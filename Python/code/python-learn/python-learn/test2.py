import random
import sys
import time
import pygame
from tkinter import Tk, simpledialog, Canvas
from pygame.locals import *
from collections import deque
import os
import json
#导入random模块，生成随机数
import random

# Basic settings
Screen_Height = 480  # Screen height
Screen_Width = 600  # Screen width
Size = 20  # Small square size
Line_Width = 1  # Grid line width

Area_x = (0, Screen_Width // Size - 1)
Area_y = (2, Screen_Height // Size - 1)

Food_Style_List = [(-10, (255, 100, 100)), (10, (100, 255, 100)), (10, (100, 100, 255))]
Light = (100, 100, 100)
Dark = (200, 200, 200)
Black = (0, 0, 0)
Red = (200, 30, 30)
Back_Ground = (40, 40, 60)

def Print_Txt(screen, font, x, y, text, fcolor=(255, 255, 255)):
    Text = font.render(text, True, fcolor)
    screen.blit(Text, (x, y))

def init_snake(length, start_pos=(2, Area_y[0])):
    snake = deque()
    for i in range(length):
        snake.append((start_pos[0] - i, start_pos[1]))
    return snake

def Creat_Food(snake):
    food_x = random.randint(Area_x[0], Area_x[1])
    food_y = random.randint(Area_y[0], Area_y[1])
    while (food_x, food_y) in snake:
        food_x = random.randint(Area_x[0], Area_x[1])
        food_y = random.randint(Area_y[0], Area_y[1])
    return food_x, food_y

def Food_Style():
    return Food_Style_List[random.randint(0, 2)]

def all_red(food_styles):
    for style in food_styles:
        if style[1] != (255, 100, 100):
            return False
    return True

def game_over_dialog(screen, font, countdown):
    font_big = pygame.font.SysFont('SimHei', 50)
    for i in range(countdown, 0, -1):
        screen.fill(Back_Ground)
        Print_Txt(screen, font_big, 20, 200, f'游戏结束，请等待: {i} 秒', Red)
        pygame.display.update()
        time.sleep(1)
    pygame.display.update()
    Print_Txt(screen, font_big, 100, 260, 'Yes (Y) or No (N)', Red)
    pygame.display.update()

    waiting_for_response = True
    while waiting_for_response:
        for event in pygame.event.get():
            if event.type == QUIT:
                sys.exit()
            elif event.type == KEYDOWN:
                if event.key == K_y:
                    waiting_for_response = False
                    return True
                elif event.key == K_n:
                    sys.exit()

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


# 排行榜文件
RANKING_FILE = "ranking.json"

def read_ranking():
    global best_scores
    if os.path.exists(RANKING_FILE):
        with open(RANKING_FILE, "r") as f:
            best_scores = json.load(f)
    else:
        best_scores = []
# 创建窗体
win = Tk()
# 设置行数和列数
Row = 24
Cloumn = 15
# 设置游戏窗口的高和宽
height = Row * Size
width = Cloumn * Size +200

# 创建一个tkinter canvas对象，将值赋给变量canvas，设置宽度和高度
canvas = Canvas(win, width=width, height=height)
def display_ranking():
    read_ranking()  # 读取排行榜数据
    canvas.create_text(width -100, 50, text="游戏排行榜", font=("宋体", 16))
    for i, score in enumerate(best_scores, start=1):
        canvas.create_text(width - 100, 50 + i * 30, text=f"第{i}名的成绩是. {score}", font=("Arial", 14))

display_ranking()

def main():

    user_input_color = custom_input_dialog("初始化蛇", "请输入初始颜色:")
    length = int(custom_input_dialog("初始化蛇", "请输入初始长度:"))
    speed = float(custom_input_dialog("初始化蛇", "请输入初始速1度，:提示：（数值越小 速度越快）"))
    snack_color = get_user_color(user_input_color)

    pygame.init()
    screen = pygame.display.set_mode((Screen_Width, Screen_Height))
    pygame.display.set_caption('贪吃蛇')
    font1 = pygame.font.SysFont('SimHei', 24)
    font2 = pygame.font.SysFont(None, 72)
    font3 = pygame.font.SysFont('SimHei', 50)

    # 选择贪吃蛇初始设置
    start_pos = (2, Area_y[0])

    # 初始化贪吃蛇
    snake = init_snake(length, start_pos)
    foods = []
    food_styles = []
    pos = (1, 0)
    game_over = True
    game_start = False
    score = 0
    orispeed = speed
    last_move_time = None
    pause = False
    countdown = 0  # Countdown time in seconds

    while True:
        for event in pygame.event.get():
            if event.type == QUIT:
                sys.exit()
            elif event.type == KEYUP:
                speed = orispeed - 0.03 * (score // 100)
            elif event.type == KEYDOWN:
                speed = 0.1
                if event.key == K_RETURN:
                    if game_over and countdown == 0:
                        game_start = True
                        game_over = False
                        snake = init_snake(length, start_pos)
                        foods = []
                        food_styles = []
                        while all_red(food_styles):
                            num = random.randint(1, 3)
                            while num > 0:
                                foods.append(Creat_Food(snake))
                                food_styles.append(Food_Style())
                                num -= 1
                        pos = (1, 0)
                        score = 0
                        last_move_time = time.time()
                elif event.key == K_SPACE:
                    if not game_over:
                        pause = not pause
                elif event.key in (K_UP, K_w):
                    if not pos[1]:
                        pos = (0, -1)
                elif event.key in (K_DOWN, K_s):
                    if not pos[1]:
                        pos = (0, 1)
                elif event.key in (K_LEFT, K_a):
                    if not pos[0]:
                        pos = (-1, 0)
                elif event.key in (K_RIGHT, K_d):
                    if not pos[0]:
                        pos = (1, 0)

        screen.fill(Back_Ground)
        for x in range(Size, Screen_Width, Size):
            pygame.draw.line(screen, Black, (x, Area_y[0] * Size), (x, Screen_Height), Line_Width)
        for y in range(Area_y[0] * Size, Screen_Height, Size):
            pygame.draw.line(screen, Black, (0, y), (Screen_Width, y), Line_Width)

        if not game_over:
            curTime = time.time()
            if curTime - last_move_time > speed:
                if not pause:
                    last_move_time = curTime
                    next_s = (snake[0][0] + pos[0], snake[0][1] + pos[1])
                    if next_s in foods:
                        index = foods.index(next_s)
                        score_add = food_styles[index][0]
                        snack_color = food_styles[index][1]
                        foods.pop(index)
                        food_styles.pop(index)
                        if score_add > 0:
                            snake.appendleft(next_s)
                        else:
                            snake.pop()
                        score += score_add
                        if score < 0:
                            game_over = True
                            countdown = 10
                            snack_color = Dark
                            if game_over_dialog(screen, font2, countdown):
                                game_start = True
                                game_over = False
                                snake = init_snake(length, start_pos)
                                foods = []
                                food_styles = []
                                while all_red(food_styles):
                                    num = random.randint(1, 3)
                                    while num > 0:
                                        foods.append(Creat_Food(snake))
                                        food_styles.append(Food_Style())
                                        num -= 1
                                pos = (1, 0)
                                score = 0
                                last_move_time = time.time()
                        speed = orispeed - 0.03 * (score // 100)
                        while all_red(food_styles):
                            num = random.randint(1, 3)
                            while num > 0:
                                foods.append(Creat_Food(snake))
                                food_styles.append(Food_Style())
                                num -= 1
                    else:
                        if Area_x[0] <= next_s[0] <= Area_x[1] and Area_y[0] <= next_s[1] <= Area_y[1] and next_s not in snake:
                            snake.appendleft(next_s)
                            snake.pop()
                        else:
                            game_over = True
                            countdown = 10
                            snack_color = Dark
                            if game_over_dialog(screen, font2, countdown):
                                game_start = True
                                game_over = False
                                snake = init_snake(length, start_pos)
                                foods = []
                                food_styles = []
                                while all_red(food_styles):
                                    num = random.randint(1, 3)
                                    while num > 0:
                                        foods.append(Creat_Food(snake))
                                        food_styles.append(Food_Style())
                                        num -= 1
                                pos = (1, 0)
                                score = 0
                                last_move_time = time.time()
                            else:
                                sys.exit()

        for index in range(len(foods)):
            pygame.draw.rect(screen, food_styles[index][1], (foods[index][0] * Size, foods[index][1] * Size, Size, Size), 0)
        for s in snake:
            pygame.draw.rect(screen, snack_color, (s[0] * Size + Line_Width, s[1] * Size + Line_Width, Size - Line_Width * 2, Size - Line_Width * 2), 0)
        Print_Txt(screen, font1, 30, 7, f'速度: {speed}')
        Print_Txt(screen, font1, 450, 7, f'得分: {score}')

        if game_over:
            if game_start:
                Print_Txt(screen, font2, (Screen_Width - 200) // 2, (Screen_Height - 50) // 2, 'GAME OVER', Red)
                if countdown > 0:
                    Print_Txt(screen, font3, (Screen_Width - 400) // 2, (Screen_Height - 50) // 2 + 60, f'还有 {countdown} 秒才能重启游戏', Red)
                    pygame.display.update()
                    time.sleep(1)  # Wait for a second
                    countdown -= 1
                else:
                    Print_Txt(screen, font3, (Screen_Width - 200) // 2, (Screen_Height - 50) // 2 + 60, '按Enter重启游戏', Red)
            else:
                Print_Txt(screen, font3, (Screen_Width - 250) // 2, (Screen_Height - 50) // 2, '按Enter开始', Red)
        pygame.display.update()

if __name__ == '__main__':
    main()
