# a = input("请输入需要转换的摄氏度：")
# print("转换为的华氏度为：", round(float(a) * 1.8 + 32, 2), "°F")

# a = int(input("请输入小时数"))
# b = int(input("请输入分钟数"))
# print("总分钟数为：", a * 60 + b)

# print("请输入三个需要比较大小的数字")
# a = int(input("a："))
# b = int(input("b："))
# c = int(input("c："))
# print(a<b<c)

# print("请输入三角形三边")
# a = int(input("a："))
# b = int(input("b："))
# c = int(input("c："))
# p = (a+b+c)/2
# print("面积为：", p*(p-a)*(p-b)*(p-c))
# print("周长为：", a + b + c)

a = int(input("请输入一个三位数:"))
b = 1
for i in range(3):
    c = i % 10
    b += c * c * c
    i /= 10
print("判断是否相同", b == a)