import math


def isPrime(i):
    for j in range(2, math.floor(math.sqrt(i))):
        if (i % j == 0):
            return False
    return True

for i in range(1000, 9999):
    if isPrime(i):
        print(i, end=' ')