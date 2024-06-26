# 导包
import random
import sys
import time
import pygame
import os
from tkinter import Tk, simpledialog
from pygame.locals import *
from collections import deque

Screen_Width = 600  # 屏幕宽度
Screen_Height = 480  # 屏幕高度
SIZE = 30  # 小方格大小
Line_Width = 1  # 网格线宽度

# 游戏区域的坐标范围
SCOPE_X = (0, Screen_Width // SIZE - 1)
Scope_Y = (2, Screen_Height // SIZE - 1)
# 颜色
LIGHT = (100, 100, 100)
BLACK = "#C0C0C0"  # 网格线颜色
RED = (200, 30, 30)  # 红色，GAME OVER 的字体颜色
bg = "#808080"  # 背景色
DARK = "#000000"  # 龙的初始颜色

# 获取当前脚本的绝对路径
script_dir = os.path.dirname(os.path.abspath(__file__))


# 文本
def print_text(screen, font, x, y, text, fcolor=(255, 255, 255)):
    img_text = font.render(text, True, fcolor)
    screen.blit(img_text, (x, y))


# 自定义输入框
def custom_input_dialog(title, prompt):
    root = Tk()
    root.withdraw()
    result = simpledialog.askstring(title, prompt)
    return result

# 输入颜色
def get_user_color(color_name):
    colors = {
        'red': (255, 0, 0),
        'green': (0, 255, 0),
        'blue': (0, 0, 255),
        'yellow': (255, 255, 0),
        'black': (0, 0, 0),
        'pick': (255, 192, 203)
        # 添加更多颜色...
        # 添加更多颜色...
    }
    return colors.get(color_name.lower(), (0, 0, 0))  # 如果找不到颜色，则返回黑色


# 初始化龙
def init_snake():
    snake = deque()  # 初始化一个双向队列（deque），存储龙的身体部分
    snake.append((2, Scope_Y[0]))  # 添加颜色属性
    snake.append((1, Scope_Y[0]))
    snake.append((0, Scope_Y[0]))
    return snake


'''
#游戏开始龙的随机颜色，但是不是吃一个食物就改一个颜色
snake_colors = ["#FFB6C1", "#F0FFF0", "#FFD700"]
def snake_color():
    return snake_colors[random.randint(0, 2)]
'''

# 食物的分值及颜色
Food_style_list = [(-1, "#BB0E4F"), (1, "#FFB6C1"), (2, "#F0FFF0"), (5, "#FFD700")]


# 初始化食物
def create_food(snake):
    food_list = []
    max_food = random.randint(3, 3)  # 随机生成3个食物
    for _ in range(max_food):
        food_x = random.randint(SCOPE_X[0], SCOPE_X[1])
        food_y = random.randint(Scope_Y[0], Scope_Y[1])
        while (food_x, food_y) in snake or (food_x, food_y) in food_list:
            # 如果食物出现在龙身上或已经存在的食物上，则重来
            food_x = random.randint(SCOPE_X[0], SCOPE_X[1])
            food_y = random.randint(Scope_Y[0], Scope_Y[1])
        food_list.append((food_x, food_y))
    return food_list


# 食物颜色设置
def get_food_style():
    return Food_style_list[random.randint(0, 3)]


# 界面
def main():
    global game_over_wait_timer, food_index, game_over_waiting, remaining_time, next_s, DARK

    # 调用音乐
    # 初始化pygame的mixer模块
    pygame.mixer.init()

    user_input_color = custom_input_dialog("初始化龙", "请输入初始颜色:")
    user_input_length = custom_input_dialog("初始化龙", "请输入初始长度:")
    user_input_speed = custom_input_dialog("初始化龙", "请输入初始速度，:提示：（数值越小 速度越快）")
    DARK = get_user_color(user_input_color)

    pygame.init()
    screen = pygame.display.set_mode((Screen_Width, Screen_Height))
    pygame.display.set_caption('变色龙')

    font1 = pygame.font.SysFont('SimHei', 24)  # 得分的字体
    font2 = pygame.font.Font(None, 72)  # GAME OVER 的字体
    font3 = pygame.font.Font(None, 50)
    fwidth, fheight = font2.size('GAME OVER')
    clock = pygame.time.Clock()  # 初始化时钟对象，用于控制帧率

    # 如果龙正在向右移动，那么快速点击向下向左，由于程序刷新没那么快，向下事件会被向左覆盖掉，导致龙后退，直接GAME OVER
    # b 变量就是用于防止这种情况的发生
    b = True

    # 龙
    snake = init_snake()
    # 龙的随机颜色snake_styles = [snake_color() for _ in range(len(snake_colors))]

    # 食物
    food_list = create_food(snake)
    food_styles = [get_food_style() for _ in range(len(food_list))]
    # 方向
    pos = (1, 0)

    gameover = True
    start = False  # 是否开始，当start = True，gameover = True 时，才显示 GAME OVER
    score = 0  # 得分
    orispeed = float(user_input_speed)  # 原始速度 # 转成浮点数
    speed = 0.5
    last_move_time = None
    pause = False  # 暂停

    # 无限循环，遇到sys.exit()终止
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:  # 关闭窗口
                sys.exit()
            elif event.type == KEYDOWN:  # 键盘
                if event.key == K_RETURN:  # 回车
                    if gameover:  # 如果游戏结束，则重置状态
                        start = True
                        gameover = False
                        b = True
                        snake = init_snake()
                        food_list = create_food(snake)
                        food_styles = [get_food_style() for _ in range(len(food_list))]
                        pos = (1, 0)
                        # 得分
                        score = 0
                        last_move_time = time.time()
                elif event.key == K_SPACE:  # 空格
                    if not gameover:  # 如果游戏没结束，暂停状态切换
                        pause = not pause

                elif event.key in (K_w, K_UP):
                    # 这个判断是为了防止龙向指定方向移动时，按下相反的方向，导致直接 GAME OVER
                    if b and not pos[1]:
                        pos = (0, -1)
                        b = False
                elif event.key in (K_s, K_DOWN):
                    if b and not pos[1]:
                        pos = (0, 1)
                        b = False
                elif event.key in (K_a, K_LEFT):
                    if b and not pos[0]:
                        pos = (-1, 0)
                        b = False
                elif event.key in (K_d, K_RIGHT):
                    if b and not pos[0]:
                        pos = (1, 0)
                        b = False
            # 如果游戏结束等待计时器

        # 填充背景色
        screen.fill(bg)
        # 画网格线 竖线
        for x in range(SIZE, Screen_Width, SIZE):
            pygame.draw.line(screen, BLACK, (x, Scope_Y[0] * SIZE), (x, Screen_Height), Line_Width)
        # 画网格线 横线
        for y in range(Scope_Y[0] * SIZE, Screen_Height, SIZE):
            pygame.draw.line(screen, BLACK, (0, y), (Screen_Width, y), Line_Width)

        # 画食物
        for i, food in enumerate(food_list):
            pygame.draw.rect(screen, food_styles[i][1], (food[0] * SIZE, food[1] * SIZE, SIZE, SIZE), 0)
        # 画龙
        for s in snake:
            pygame.draw.rect(screen, DARK, (s[0] * SIZE + Line_Width, s[1] * SIZE + Line_Width,
                                            SIZE - Line_Width * 2, SIZE - Line_Width * 2), 0)

        # 游戏没有结束
        if not gameover:
            cur_time = time.time()
            if len(snake) < 1:  # 如果龙的长度小于1，游戏结束
                gameover = True
            # 检测是否需要移动龙
            if cur_time - last_move_time > speed:
                # 如果没有暂停
                if not pause:
                    # 准备龙的移动
                    b = True
                    last_move_time = cur_time
                    next_s = (snake[0][0] + pos[0], snake[0][1] + pos[1])
                    # 吃到了食物
                    if next_s in food_list:
                        # 吃到了食物
                        food_index = food_list.index(next_s)
                        score += food_styles[food_index][0]  # 增加得分（假设 food_styles[food_index][0] 存储了食物的得分值）
                        if score < 0:  # 如果分数为负数，则直接结束游戏
                            gameover = True
                        DARK = food_styles[food_index][1]
                        if food_styles[food_index][0] > 0:
                            snake.appendleft(next_s)  # 在龙的头部添加新的身体部分（增长龙的长度）
                        else:
                            snake.popleft()
                        speed = orispeed - 0.03 * (score // 100)  # 根据得分调整龙的移动速度（速度随着得分的增加而减小）
                        food_list.pop(food_index)
                        food_styles.pop(food_index)
                        if not food_list:  # 如果没有食物了，重新生成食物和食物样式
                            food_list = create_food(snake)
                            food_styles = [get_food_style() for _ in range(len(food_list))]
                    else:
                        # 如果下一个位置在游戏范围内且不是龙的身体部分
                        if SCOPE_X[0] <= next_s[0] <= SCOPE_X[1] and Scope_Y[0] <= next_s[1] <= Scope_Y[1] \
                                and next_s not in snake:
                            snake.appendleft(next_s)
                            snake.pop()
                        else:  # 如果龙碰到了边界或自身，游戏结束
                            gameover = True

        # screen是您的屏幕对象，font1是字体对象，30和7是坐标
        # 计算速度值并保留小数部分
        speed_value = orispeed

        # 格式化字符串以显示小数点后两位
        formatted_speed_value = "{:.2f}".format(speed_value)

        # 打印包含小数部分的文本
        print_text(screen, font1, 30, 7, f'速度: {formatted_speed_value}')
        print_text(screen, font1, 450, 7, f'得分: {score}')

        # 如果游戏失败显示”GAME OVER样式“
        if gameover:
            if start:
                pygame.mixer.music.stop()

                if 'countdown' not in locals():
                    countdown_start = pygame.time.get_ticks()  # 记录开始时间
                    countdown = 10  # 倒计时秒数
                elapsed_time = clock.tick(60)  # 控制帧率并获取经过的毫秒数
                seconds_passed = elapsed_time / 1000  # 将毫秒转换为秒
                # 只在每秒更新一次倒计时
                if pygame.time.get_ticks() - countdown_start >= 1000:
                    countdown_start = pygame.time.get_ticks()  # 重置开始时间
                    countdown = max(0, countdown - 1)  # 更新剩余时间

                # 显示字样
                print_text(screen, font2, (Screen_Width - fwidth) // 2, (Screen_Height - fheight) // 3,
                           'GAME OVER',
                           RED)
                print_text(screen, font2, (Screen_Width - fwidth) // 2, (Screen_Height - fheight) // 3, 'GAME OVER',
                           RED)
                print_text(screen, font3, (Screen_Width - fwidth) // 2, (Screen_Height - fheight) // 2 + 80,
                           f'Please wait {str(int(countdown))} s', RED)

                # 显示倒计时
                if countdown == 0:  # 只有当倒计时未结束时显示倒计时
                    # 例如：start = False 或 pygame.quit(); sys.exit()
                    user_input_select = custom_input_dialog("Game Over", "是否重启游戏（y/n):")
                    if user_input_select == 'y':
                        countdown = 10  # 设置倒计时为初始值
                        countdown_start = pygame.time.get_ticks()
                        # 在这里添加重新启动游戏的逻辑
                        gameover = False
                        start = True
                        b = True
                        snake = init_snake()
                        food_list = create_food(snake)
                        food_styles = [get_food_style() for _ in range(len(food_list))]
                        speed =0.5
                        pos = (1, 0)
                        # 得分
                        score = 0
                        last_move_time = time.time()
                    elif user_input_select == 'n':
                        pygame.quit()
                        exit()
        pygame.display.update()


if __name__ == '__main__':
    main()
