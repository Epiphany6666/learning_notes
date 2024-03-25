i = 1
while i <= 9:
    j = 1
    while j <= i:
        if j == 1:
            print()
        print(f"{j} * {i} = {i * j}\t", end= '')
        j += 1
    i += 1