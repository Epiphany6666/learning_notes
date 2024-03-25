# # 这里注意input得到的永远是字符串类型的数据，这里需要强转为int
# age = int(input("请输入你的年龄"))
# if age >= 18:
#     print("您已成年，游玩需补票10元！")
# else:
#     print("您未成年，可以免费游玩！")
import random

# if int(input("请输入你的身高")) < 120:
#     print("")

# num = 10
# if int(input("请输入第一次猜想的数字")) == num:
#     print("恭喜你猜对啦");
# elif int(input("不对，再猜一次")) == num:
#     print("恭喜你猜对啦");
# elif int(input("不对，再猜最后一次")) == num:
#     print("恭喜你猜对啦！")
# else:
#     print("Sorry, 全部猜错啦，我想的是：%d" % num)
num = random.randint(1, 10)

guess_num = int(input("输入你要猜测的数字："))
if guess_num == num:
    print("恭喜，第一次就猜中了")
else:
    if guess_num > num:
        print("你猜测的数字大了")
    else:
        print("你猜测的数字小了")
        guess_num = int(input("再次输入你要猜测的数字："))

    if guess_num == num:
        print("恭喜，第二次猜中了")
    else:
        if guess_num > num:
            print("你猜测的数字大了")
        else:
            print("你猜测的数字小了")
            guess_num = int(input("第三次输入你要猜测的数字："))

            if guess_num == num:
                print("第三次猜中了")
            else:
                print("三次机会用完了，没有猜中。")
