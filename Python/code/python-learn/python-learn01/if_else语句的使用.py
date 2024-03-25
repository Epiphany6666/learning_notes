# 这里注意input得到的永远是字符串类型的数据，这里需要强转为int
age = int(input("请输入你的年龄"))
if age >= 18:
    print("您已成年，游玩需补票10元！")
else:
    print("您未成年，可以免费游玩！")