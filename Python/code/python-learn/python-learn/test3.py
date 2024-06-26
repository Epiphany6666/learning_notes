import random  # 导入随机数生成模块
import sys  # 导入系统模块，用于执行系统操作
import time  # 导入时间模块，用于时间操作
import pygame  # 导入Pygame模块，用于游戏开发
from tkinter import Tk, simpledialog  # 从Tkinter模块导入Tk和simpledialog，用于创建输入对话框
from pygame.locals import *  # 导入Pygame的常量
from collections import deque  # 从collections模块导入deque，用于高效的双向队列操作

# Basic settings
Screen_Height = 480  # 屏幕高度
Screen_Width = 600  # 屏幕宽度
Size = 20  # 小方块大小
Line_Width = 1  # 网格线宽度

Area_x = (0, Screen_Width // Size - 1)  # 游戏区域x轴范围
Area_y = (2, Screen_Height // Size - 1)  # 游戏区域y轴范围

Food_Style_List = [(-10, (255, 100, 100)), (10, (100, 255, 100)), (10, (100, 100, 255))]  # 食物样式列表，包含分数和颜色
Light = (100, 100, 100)  # 浅色
Dark = (200, 200, 200)  # 深色
Black = (0, 0, 0)  # 黑色
Red = (200, 30, 30)  # 红色
Back_Ground = (40, 40, 60)  # 背景色

def Print_Txt(screen, font, x, y, text, fcolor=(255, 255, 255)):
    Text = font.render(text, True, fcolor)  # 渲染文本
    screen.blit(Text, (x, y))  # 将文本绘制到屏幕上

def init_snake(length, start_pos=(2, Area_y[0])):
    snake = deque()  # 创建一个双向队列表示蛇的身体
    for i in range(length):
        snake.append((start_pos[0] - i, start_pos[1]))  # 初始化蛇的身体位置
    return snake

def Creat_Food(snake):
    food_x = random.randint(Area_x[0], Area_x[1])  # 随机生成食物的x坐标
    food_y = random.randint(Area_y[0], Area_y[1])  # 随机生成食物的y坐标
    while (food_x, food_y) in snake:  # 确保食物不生成在蛇的身体上
        food_x = random.randint(Area_x[0], Area_x[1])
        food_y = random.randint(Area_y[0], Area_y[1])
    return food_x, food_y

def Food_Style():
    return Food_Style_List[random.randint(0, 2)]  # 随机选择一种食物样式

def all_red(food_styles):
    for style in food_styles:  # 检查所有食物是否都是红色
        if style[1] != (255, 100, 100):
            return False
    return True

def game_over_dialog(screen, font, countdown):
    font_big = pygame.font.SysFont('SimHei', 50)  # 创建大字体
    for i in range(countdown, 0, -1):
        screen.fill(Back_Ground)  # 填充背景色
        Print_Txt(screen, font_big, 20, 200, f'游戏结束，请等待: {i} 秒', Red)  # 显示倒计时
        pygame.display.update()  # 更新屏幕
        time.sleep(1)  # 等待1秒
    pygame.display.update()
    Print_Txt(screen, font_big, 100, 260, 'Yes (Y) or No (N)', Red)  # 显示选择提示
    pygame.display.update()

    waiting_for_response = True
    while waiting_for_response:
        for event in pygame.event.get():
            if event.type == QUIT:
                sys.exit()  # 退出程序
            elif event.type == KEYDOWN:
                if event.key == K_y:
                    waiting_for_response = False
                    return True  # 返回True表示重新开始游戏
                elif event.key == K_n:
                    sys.exit()  # 退出程序

# 自定义输入框
def custom_input_dialog(title, prompt):
    root = Tk()  # 创建Tk根窗口
    root.withdraw()  # 隐藏根窗口
    result = simpledialog.askstring(title, prompt)  # 显示输入对话框
    return result

# 输入颜色
def get_user_color(color_name):
    colors = {
        'red': (255, 0, 0),  # 红色
        'green': (0, 255, 0),  # 绿色
        'blue': (0, 0, 255),  # 蓝色
        'yellow': (255, 255, 0),  # 黄色
        'black': (0, 0, 0),  # 黑色
        'pick': (255, 192, 203)  # 粉色
        # 添加更多颜色...
    }
    return colors.get(color_name.lower(), (0, 0, 0))  # 如果找不到颜色，则返回黑色

def main():
    user_input_color = custom_input_dialog("初始化蛇", "请输入初始颜色:")  # 获取用户输入的颜色
    length = int(custom_input_dialog("初始化蛇", "请输入初始长度:"))  # 获取用户输入的蛇长度
    speed = float(custom_input_dialog("初始化蛇", "请输入初始速度，提示：（数值越小 速度越快）"))  # 获取用户输入的速度
    snack_color = get_user_color(user_input_color)  # 获取用户选择的颜色

    pygame.init()  # 初始化Pygame
    screen = pygame.display.set_mode((Screen_Width, Screen_Height))  # 设置屏幕尺寸
    pygame.display.set_caption('贪吃蛇')  # 设置窗口标题
    font1 = pygame.font.SysFont('SimHei', 24)  # 创建字体对象
    font2 = pygame.font.SysFont(None, 72)  # 创建字体对象
    font3 = pygame.font.SysFont('SimHei', 50)  # 创建字体对象

    # 选择贪吃蛇初始设置
    start_pos = (2, Area_y[0])  # 设置蛇的初始位置

    # 初始化贪吃蛇
    snake = init_snake(length, start_pos)  # 初始化蛇
    foods = []  # 食物列表
    food_styles = []  # 食物样式列表
    pos = (1, 0)  # 蛇的移动方向
    game_over = True  # 游戏结束标志
    game_start = False  # 游戏开始标志
    score = 0  # 得分
    orispeed = speed  # 初始速度
    last_move_time = None  # 上次移动时间
    pause = False  # 暂停标志
    countdown = 0  # 倒计时时间

    while True:
        for event in pygame.event.get():
            if event.type == QUIT:
                sys.exit()  # 退出程序
            elif event.type == KEYUP:
                speed = orispeed - 0.03 * (score // 100)  # 根据得分调整速度
            elif event.type == KEYDOWN:
                speed = 0.1  # 设置速度
                if event.key == K_RETURN:
                    if game_over and countdown == 0:
                        game_start = True  # 开始游戏
                        game_over = False  # 游戏未结束
                        snake = init_snake(length, start_pos)  # 初始化蛇
                        foods = []  # 清空食物列表
                        food_styles = []  # 清空食物样式列表
                        while all_red(food_styles):  # 确保食物样式不全是红色
                            num = random.randint(1, 3)
                            while num > 0:
                                foods.append(Creat_Food(snake))  # 创建食物
                                food_styles.append(Food_Style())  # 选择食物样式
                                num -= 1
                        pos = (1, 0)  # 设置蛇的初始方向
                        score = 0  # 重置得分
                        last_move_time = time.time()  # 记录当前时间
                elif event.key == K_SPACE:
                    if not game_over:
                        pause = not pause  # 切换暂停状态
                elif event.key in (K_UP, K_w):
                    if not pos[1]:
                        pos = (0, -1)  # 向上移动
                elif event.key in (K_DOWN, K_s):
                    if not pos[1]:
                        pos = (0, 1)  # 向下移动
                elif event.key in (K_LEFT, K_a):
                    if not pos[0]:
                        pos = (-1, 0)  # 向左移动
                elif event.key in (K_RIGHT, K_d):
                    if not pos[0]:
                        pos = (1, 0)  # 向右移动

        screen.fill(Back_Ground)  # 填充背景色
        for x in range(Size, Screen_Width, Size):
            pygame.draw.line(screen, Black, (x, Area_y[0] * Size), (x, Screen_Height), Line_Width)  # 绘制垂直线
        for y in range(Area_y[0] * Size, Screen_Height, Size):
            pygame.draw.line(screen, Black, (0, y), (Screen_Width, y), Line_Width)  # 绘制水平线

        if not game_over:
            curTime = time.time()  # 获取当前时间
            if curTime - last_move_time > speed:
                if not pause:
                    last_move_time = curTime  # 更新上次移动时间
                    next_s = (snake[0][0] + pos[0], snake[0][1] + pos[1])  # 计算蛇头的下一个位置
                    if next_s in foods:
                        index = foods.index(next_s)  # 获取食物索引
                        score_add = food_styles[index][0]  # 获取食物分数
                        snack_color = food_styles[index][1]  # 获取食物颜色
                        foods.pop(index)  # 移除食物
                        food_styles.pop(index)  # 移除食物样式
                        if score_add > 0:
                            snake.appendleft(next_s)  # 增加蛇的长度
                        else:
                            snake.pop()  # 减少蛇的长度
                        score += score_add  # 更新得分
                        if score < 0:
                            game_over = True  # 游戏结束
                            countdown = 10  # 设置倒计时
                            snack_color = Dark  # 设置蛇的颜色
                            if game_over_dialog(screen, font2, countdown):  # 显示游戏结束对话框
                                game_start = True  # 重新开始游戏
                                game_over = False  # 游戏未结束
                                snake = init_snake(length, start_pos)  # 初始化蛇
                                foods = []  # 清空食物列表
                                food_styles = []  # 清空食物样式列表
                                while all_red(food_styles):  # 确保食物样式不全是红色
                                    num = random.randint(1, 3)
                                    while num > 0:
                                        foods.append(Creat_Food(snake))  # 创建食物
                                        food_styles.append(Food_Style())  # 选择食物样式
                                        num -= 1
                                pos = (1, 0)  # 设置蛇的初始方向
                                score = 0  # 重置得分
                                last_move_time = time.time()  # 记录当前时间
                        speed = orispeed - 0.03 * (score // 100)  # 根据得分调整速度
                        while all_red(food_styles):  # 确保食物样式不全是红色
                            num = random.randint(1, 3)
                            while num > 0:
                                foods.append(Creat_Food(snake))  # 创建食物
                                food_styles.append(Food_Style())  # 选择食物样式
                                num -= 1
                    else:
                        if Area_x[0] <= next_s[0] <= Area_x[1] and Area_y[0] <= next_s[1] <= Area_y[1] and next_s not in snake:
                            snake.appendleft(next_s)  # 移动蛇
                            snake.pop()  # 移除蛇尾
                        else:
                            game_over = True  # 游戏结束
                            countdown = 10  # 设置倒计时
                            snack_color = Dark  # 设置蛇的颜色
                            if game_over_dialog(screen, font2, countdown):  # 显示游戏结束对话框
                                game_start = True  # 重新开始游戏
                                game_over = False  # 游戏未结束
                                snake = init_snake(length, start_pos)  # 初始化蛇
                                foods = []  # 清空食物列表
                                food_styles = []  # 清空食物样式列表
                                while all_red(food_styles):  # 确保食物样式不全是红色
                                    num = random.randint(1, 3)
                                    while num > 0:
                                        foods.append(Creat_Food(snake))  # 创建食物
                                        food_styles.append(Food_Style())  # 选择食物样式
                                        num -= 1
                                pos = (1, 0)  # 设置蛇的初始方向
                                score = 0  # 重置得分
                                last_move_time = time.time()  # 记录当前时间
                            else:
                                sys.exit()  # 退出程序

        for index in range(len(foods)):
            pygame.draw.rect(screen, food_styles[index][1], (foods[index][0] * Size, foods[index][1] * Size, Size, Size), 0)  # 绘制食物
        for s in snake:
            pygame.draw.rect(screen, snack_color, (s[0] * Size + Line_Width, s[1] * Size + Line_Width, Size - Line_Width * 2, Size - Line_Width * 2), 0)  # 绘制蛇
        Print_Txt(screen, font1, 30, 7, f'速度: {speed}')  # 显示速度
        Print_Txt(screen, font1, 450, 7, f'得分: {score}')  # 显示得分

        if game_over:
            if game_start:
                Print_Txt(screen, font2, (Screen_Width - 200) // 2, (Screen_Height - 50) // 2, 'GAME OVER', Red)  # 显示游戏结束
                if countdown > 0:
                    Print_Txt(screen, font3, (Screen_Width - 400) // 2, (Screen_Height - 50) // 2 + 60, f'还有 {countdown} 秒才能重启游戏', Red)  # 显示倒计时
                    pygame.display.update()  # 更新屏幕
                    time.sleep(1)  # 等待1秒
                    countdown -= 1  # 倒计时减1
                else:
                    Print_Txt(screen, font3, (Screen_Width - 200) // 2, (Screen_Height - 50) // 2 + 60, '按Enter重启游戏', Red)  # 提示按Enter键重启游戏
            else:
                Print_Txt(screen, font3, (Screen_Width - 250) // 2, (Screen_Height - 50) // 2, '按Enter开始', Red)  # 提示按Enter键开始游戏
        pygame.display.update()  # 更新屏幕

if __name__ == '__main__':
    main()  # 调用main函数，开始游戏