#导入tkinter模块，用于创建图形用户界面
import tkinter as tk
import os
import json
#从tkinter模块中导入messagebox子模块，用于显示对话框
from tkinter import messagebox
from tkinter import Toplevel, Button
import tkinter as tk
#导入random模块，生成随机数
import random

# 设置行数和列数
Row = 24
Cloumn = 15

# 排行榜文件
RANKING_FILE = "ranking.json"

# 设置格子的大小
cell_size = 30

# 设置游戏窗口的高和宽
height = Row * cell_size
width = Cloumn * cell_size +200


# 定义一个字典，设置七种形状的俄罗斯方块
SHAPES = {
    "Z": [(-1, -1), (0, -1), (0, 0), (1, 0)],
    "O": [(-1, -1), (0, -1), (-1, 0), (0, 0)],
    "S": [(-1, 0), (0, 0), (0, -1), (1, -1)],
    "T": [(-1, 0), (0, 0), (0, -1), (1, 0)],
    "I": [(0, 1), (0, 0), (0, -1), (0, -2)],
    "L": [(-1, 0), (0, 0), (-1, -1), (-1, -2)],
    "J": [(-1, 0), (0, 0), (0, -1), (0, -2)]
}

# 定义一个字典，规定方块颜色
SHAPESCOLOR = {
    "O":"purple",
    "S":"yellow",
    "T":"green",
    "I":"orange",
    "L":"blue",
    "J":"red",
    "Z":"black",
}

#定义draw_blank_board方法，绘制游戏棋盘
def board_draw(canvas, block_list):
    # 遍历每一行和每一列
    for ri in range(Row):
        for ci in range(Cloumn):
            # 从block_list（棋盘数据）中获取当前位置的方块类型
            cell_type = block_list[ri][ci]
            # 判断cell_type是否为空，若不为空
            # 调用draw_cell_background函数，绘制当前位置的方块背景
            # 传入参数包括canvas、列索引ci、行索引ri和对应的颜色SHAPESCOLOR[cell_type]
            # SHAPESCOLOR是一个字典，用于根据方块类型查找对应的颜色
            if cell_type:
                background_cell_draw(canvas, ci, ri, SHAPESCOLOR[cell_type])
                # 若为空
                # 调用draw_cell_background函数，但只传入canvas、列索引ci和行索引ri
                # 此时，默认绘制空白或无色的背景
            else:
                background_cell_draw(canvas, ci, ri)


# 在画板上画格子
def background_cell_draw(canvas, col, row, color="#CCCCCC"):
    # 找到单元格左上、左下、右上、右下的坐标，然后用canvas的create_rectangle方法画矩形
    x0 = col * cell_size
    y0 = row * cell_size
    x1 = col * cell_size + cell_size
    y1 = row * cell_size + cell_size

    # 画矩形
    '''
       -fill=color:矩形内部的填充颜色
       -outline:矩形边框的颜色
       在窗口的1/3到2/3的地方边框颜色为淡绿色，其他地方边框颜色为白色
       -width=2:矩形边框的宽度设置为2个像素
    '''
    # 判断格子是否位于窗口三分之一到三分之二的地方
    is_in_middle_third = (
            y0 >= height / 3 and y0 < 2 * height / 3 or y0 == 9
    )
    # 根据是否位于中间三分之一来决定边框颜色
    outline_color = "#90EE90" if is_in_middle_third else "white"
    canvas.create_rectangle(x0, y0, x1, y1, fill=color, outline=outline_color, width=2)


# 绘制刚开始空白棋盘
def board_blank_draw(canvas):
    # 遍历每一行和每一列
    for ri in range(Row):
        for cj in range(Cloumn):
            # 用之前定义的draw_cell_background方法画格子
            background_cell_draw(canvas, cj, ri)


# 绘制单元格
def cells_draw(canvas, col, row, cell_list, color="#CCCCCC"):
    """
    在画布上绘制形状，该形状由多个单元格组成
    param canvas: 画板对象
    param col: 形状的的原点所在的列
    param row: 形状所的原点所在的行
    param cell_list: 这个形状各个格子相对于自身的原点所处的位置坐标
    param color: 这个形状的颜色，默认为灰色
    return:无返回值，直接在画布上绘制
    """
    for cel in cell_list:
        cell_col, cell_row = cel
        #计算实际行数和列数
        ci = cell_col + col
        ri = cell_row + row
        # 判断是否越界
        if 0 <= ci < Cloumn and 0 <= ri < Row:
            background_cell_draw(canvas, ci, ri, color)


# 创建窗体
win = tk.Tk()

# 创建一个tkinter canvas对象，将值赋给变量canvas，设置宽度和高度
canvas = tk.Canvas(win, width=width, height=height)

# 打包放置组件对象
#将canvas控件添加到其父容器中，并使用tkinter的pack几何管理器进行布局
canvas.pack()

# 画背景
# 初始化一个二维列表 block_list，用于存储棋盘（或游戏区域）的每一行和每一列的状态
block_list = []
#遍历每一行
# 为每一行初始化一个包含 Cloumn 个空字符串的列表，表示这一行的初始状态（可能是空的）
# 将这一行的列表添加到 block_list 中
for i in range(Row):
    i_row = ['' for j in range(Cloumn)]
    block_list.append(i_row)

# 调用 board_draw 函数，将 block_list 中的数据绘制到 canvas 上
board_draw(canvas, block_list)


# 在画布上绘制俄罗斯方块的移动
def move_block_draw(canvas, block, direction=[0, 0]):
    """
    param canvas: 画布对象
    param block: 俄罗斯方块
    param direction: 移动的方向
    return:无返回值，直接在画布上绘制
    """
    #获取方块的类型
    shape_type = block['kind']
    #获取方块的中心坐标
    c, r = block['cr']
    #获取方块占用的单元格列表
    cell_list = block['cell_list']

    cells_draw(canvas, c, r, cell_list)
    #提取移动方向上的行和列的变化量
    dc, dr = direction
    #计算新的中心坐标
    new_c, new_r = c + dc, r + dr
    #更新方块的中心坐标
    block['cr'] = [new_c, new_r]
    cells_draw(canvas, new_c, new_r, cell_list, SHAPESCOLOR[shape_type])


# 定义一个字典，来表示俄罗斯方块
block_one = {
    'kind': 'O',  # 存储俄罗斯方块的类型
    'cell_list': SHAPES['O'],  # 存储每个俄罗斯方块所占据的网格坐标列表
    'cr': [3, 3],  # 存储该方块在游戏面板上的中心坐标，即行列坐标
}

def block_new_product():
    # 随机生成新的俄罗斯方块，并返回其描述字典
    kind = random.choice(list(SHAPES.keys()))

    cr = [Cloumn // 2, 0]
    '''
    block_new : 一个包含新生成方块信息的字典，包含以下键：  
            - 'kind' (str): 存储方块的类型（如"I", "O", "T"等）。  
            - 'cell_list' (list of list): 存储方块在网格上的形状表示。  
            - 'cr' (list of int): 存储方块的初始位置（列和行）的坐标，这里固定为网格的中心列和顶部行
    '''
    #创建一个新的方块描述字典
    block_new = {
        "kind": kind,
        "cell_list": SHAPES[kind],
        'cr': cr
    }
    return block_new

def check_move(block, direction=[0, 0]):
    """
    检查给定的俄罗斯方块是否可以朝指定的方向移动
    :param block:俄罗斯方块的前身
    :param direction: 移动方向
    :return: boolean ：是否可以朝着指定的方向移动
    """
    #获取方块的当前位置（行和列）
    cc, cr = block['cr']
    #获取方块的形状信息
    cell_list = block['cell_list']
    #遍历方块的每一个格子
    for cel in cell_list:
        #获取当前格子相对于方块中心的相对位置
        cell_c, cell_r = cel
        #计算如果方块移动后，当前格子在网格上的绝对位置
        c = cell_c + cc + direction[0]#x轴上的位置
        r = cell_r + cr + direction[1]#y轴上的位置

        # 判断边界，如果新的位置超出了网格边界，则不能移动
        if c < 0 or c >= Cloumn or r >= Row:
            return False
        # r >= 0是防止格子下不来的情况
        #如果新位置已有方块则不能移动
        if r >= 0 and block_list[r][c]:
            return False
    return True


# 保存当前的俄罗斯方块到列表里面
def save_block_list(block):
    '''
    将给定的俄罗斯方块添加到游戏网格的 block_list 中
    :param block:俄罗斯方块的信息字典
    :return:无返回值，但会修改全局变量 block_list
    '''
    shape_type = block['kind']
    cc, cr = block['cr']
    cell_list = block['cell_list']

    for cel in cell_list:
        cell_c, cell_r = cel
        c = cell_c + cc
        r = cell_r + cr

        block_list[r][c] = shape_type


def move_block_horizontal(event):
    """
    根据键盘的监听事件，左右水平移动当前显示的俄罗斯方块
    event:键盘的监听事件对象，包含按键信息
    """
    # 初始化移动方向为不移动（0,0）
    direction = [0, 0]
    #判断按键类型，并设置相应的移动方向
    if event.keysym == 'Left':
        direction = [-1, 0]
    elif event.keysym == 'Right':
        direction = [1, 0]
    else:
        return

    global current_block
    if current_block is not None and check_move(current_block, direction):
        move_block_draw(canvas, current_block, direction)

#旋转方块
def block_rotate(event):
    '''
    根据键盘事件旋转俄罗斯方块
    '''
    global current_block
    #如果当前没有方块，则直接返回
    if current_block is None:
        return
    #获取当前方块的形状信息
    cell_list = current_block['cell_list']
    #初始化旋转后的形状列表
    rotate_list = []
    for cel in cell_list:
        cell_c, cell_r = cel
        rotate_cell = [cell_r, -cell_c]
        #将旋转后的格子坐标添加到列表中
        rotate_list.append(rotate_cell)
    #创建旋转后的方块字典
    after_rotate_block = {
        'kind': current_block['kind'],
        'cell_list': rotate_list,
        'cr': current_block['cr']
    }
    #检查旋转后的方块是否可以移动到当前位置
    if check_move(after_rotate_block):
        cc, cr = current_block['cr']
        cells_draw(canvas, cc, cr, current_block['cell_list'])
        cells_draw(canvas, cc, cr, rotate_list, SHAPESCOLOR[current_block['kind']])
        #更新当前方块为旋转后的方块
        current_block = after_rotate_block

#方块下落
def luo(event):
    global current_block
    if current_block is None:
        return
    cell_list = current_block['cell_list']
    cc, cr = current_block['cr']
    min_height = Row
    for cel in cell_list:
        cell_c, cell_r = cel
        c, r = cell_c + cc, cell_r + cr
        if block_list[r][c]:
            return
        h = 0
        for ri in range(r + 1, Row):
            if block_list[ri][c]:
                break
            else:
                h += 1
        #更新最小高度，即当前方块可以下落的最大的行数
        if h < min_height:
            min_height = h
    #计算方块需要下落的行数
    down = [0, min_height]
    #检查方块下落后的位置是否合法，若合法，绘制下落过程
    if check_move(current_block, down):
        move_block_draw(canvas, current_block, down)


# 检查指定行是否被完全填满
def check_complete_row(row):
    for i in row:
        if i == '':
            return False

    return True

#初始化一个变量来存储分数
score = 0
best_scores = []
#设置窗口的标题显示当前分数
win.title("SCORES: %s" % score)  # 标题中展示分数

#计算列表中已堆叠的最高高度
def calculate_highest(block_list):
    highest_height = 0
    for row  in block_list:
        for cel in row:
            if cel != '':
                height = len(block_list) - block_list.index(row)
                if height > highest_height:
                    highest_height = height
    return highest_height

'''score = 0
best_scores = []
win.title("SCORES: %s" % score)  # 标题中展示分数'''


def read_ranking():
    global best_scores
    if os.path.exists(RANKING_FILE):
        with open(RANKING_FILE, "r") as f:
            best_scores = json.load(f)
    else:
        best_scores = []

def save_ranking():
    global best_scores
    with open(RANKING_FILE, "w") as f:
        json.dump(best_scores, f)

def update_ranking(score):
    global best_scores
    best_scores.append(score)
    best_scores = sorted(best_scores, reverse=True)[:5]  # 只保存前5名
    save_ranking()

def display_ranking():
    read_ranking()  # 读取排行榜数据
    canvas.create_text(width -100, 50, text="游戏排行榜", font=("宋体", 16))
    for i, score in enumerate(best_scores, start=1):
        canvas.create_text(width - 100, 50 + i * 30, text=f"第{i}名的成绩是. {score}", font=("Arial", 14))

display_ranking()



def clear_and_check():
    global score
    #标记是否有完整行和完整行的数量
    has_complete_row = False
    complete_row_count = 0
    #获取block_list的总行数
    total_row = len(block_list)

    #遍历每一行，检查是否有完整行
    for ri in range(len(block_list)):
        if check_complete_row(block_list[ri]):
            complete_row_count += 1

    if (complete_row_count >= 3 and calculate_highest(block_list) <= Row * 1/3) or (
            complete_row_count >= 2 and Row * 1/3 < calculate_highest(block_list) < Row * 2/3 ) or (
            complete_row_count >= 1 and calculate_highest(block_list) >= Row * 2/3):
        #遍历每一行，清除完整行
        for ri in range(len(block_list)):
            if check_complete_row(block_list[ri]):
                has_complete_row = True
                #如果不是第一行，将上一行的内容复制到当前行并清除第一行
                if ri > 0:
                    #从当前行开始，向上遍历到第一行
                    #复制上一行
                    #清除第一行
                    for cur_ri in range(ri, 0, -1):
                        block_list[cur_ri] = block_list[cur_ri - 1][:]
                    block_list[0] = ['' for j in range(Cloumn)]
                    #如果是第一行，直接清除
                else:
                    block_list[ri] = ['' for j in range(Cloumn)]

                score += 10

    if has_complete_row:
        board_draw(canvas, block_list)
        win.title("SCORE: %s" % score)

#选择难度窗口
def difficulty_choose():
    global difficulty_window
    difficulty_window = tk.Toplevel(win)
    difficulty_window.title("选择你的难度")
    # 设置选择不同难度的按钮，不同难度对应不同的速度
    easy_button = tk.Button(difficulty_window, text="简单", command=lambda: game_start(600))
    medium_button = tk.Button(difficulty_window, text="中等", command=lambda: game_start(400))
    hard_button = tk.Button(difficulty_window, text="困难", command=lambda: game_start(200))

    easy_button.pack(pady=10)
    medium_button.pack(pady=10)
    hard_button.pack(pady=10)
    # 关闭窗口
    difficulty_window.protocol("WM_DELETE_WINDOW", difficulty_window.destroy)
    difficulty_window.mainloop()


# 开始游戏
def game_start(fps):
    global FPS, difficulty_window
    FPS = fps
    difficulty_window.destroy()  # 关闭难度选择窗口
    loop_game()

#重启游戏
def game_restart():
    global score, current_block, block_list
    score = 0
    current_block = None
    block_list = [['' for _ in range(Cloumn)] for _ in range(Row)]
    board_draw(canvas, block_list)
    win.title("SCORE: %s" % score)
    difficulty_choose()

# 游戏主循环，控制游戏流程
def loop_game():
    win.update()
    global current_block
    # 如果没有俄罗斯方块就生成一个新的
    if current_block is None:
        # 生成新的俄罗斯方块
        block_new = block_new_product()
        move_block_draw(canvas, block_new)
        current_block = block_new

        # 检查新生成的方块是否可以放置在顶部
        #如果不能则游戏结束
        if not check_move(current_block, [0, 0]):
            update_ranking(score)
            dialog_game_over()
            return
    # 如果有方块，则尝试将方块向下移动
    else:
        #检查当前方块是否可以向下移动一格，若可以，绘制移动后的方块
        if check_move(current_block, [0, 1]):
            move_block_draw(canvas, current_block, [0, 1])
        else:
            # 如果不能，则将当前方块固定到游戏棋盘上
            save_block_list(current_block)
            #准备生成下一个方块
            current_block = None
    # 清除完整行
    clear_and_check()
    #win.after()设置下一次循环的延迟，递归调用game_loop
    #FPS定义了每秒的帧数（游戏循环的频率）
    win.after(FPS, loop_game)

# 游戏结束窗口（重启和退出）
def dialog_game_over():
    #创建一个新的顶级窗口作为对话框
    dialog = Toplevel(win)
    dialog.title("游戏结束")
    #对话框大小
    dialog.geometry("200x120")  # 调整高度以容纳两个按钮
    #禁止用户调整对话框的大小
    dialog.resizable(False, False)

    message = tk.Label(dialog, text=f"游戏结束!\n你的成绩是 {score}", pady=10)
    message.pack()

    #创建一个按钮重启游戏
    restart_button = Button(dialog, text="再来一局", command=lambda: [dialog.destroy(), game_restart()])
    restart_button.pack(side=tk.LEFT, padx=10, pady=10)  #将按钮放在对话框的左侧，添加内边距

    #创建一个按钮来退出游戏
    exit_button = Button(dialog, text="退出", command=lambda: [dialog.destroy(), win.quit()])  # 添加退出按钮
    exit_button.pack(side=tk.RIGHT, padx=10, pady=10)  # 并排放置，将按钮放在对话框的右侧，添加内边距

    #设置对话框为win窗口的模态对话框，这样用户必须先处理这个对话框才能回到主窗口
    dialog.transient(win)
    # 锁定对话框，使其始终处于活动状态，直到被关闭
    dialog.grab_set()
    # 等待对话框被关闭后再继续执行主窗口的其他操作
    win.wait_window(dialog)


# 当前的俄罗斯方块
current_block = None

# 将焦点设置到canvas上，就可以接收键盘事件，画布聚焦后，玩家可使用键盘与游戏进行交互
canvas.focus_set()
# 所按按键对应的事件
canvas.bind("<KeyPress-Left>", move_block_horizontal)
canvas.bind("<KeyPress-Right>", move_block_horizontal)
canvas.bind("<KeyPress-Up>", block_rotate)
canvas.bind("<KeyPress-Down>", luo)

difficulty_choose()
win.mainloop()
