import random

i = random.randint(1, 100)
guess = int(input("请输入猜的数字"))
while guess != i:
    if guess > i:
        print("猜大了")
    elif guess < i:
        print("猜小了")
    else:
        print("猜对啦")
    guess = int(input("请再次输入"))