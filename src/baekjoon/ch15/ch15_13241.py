<<<<<<< HEAD
# 입력
A, B = map(int, input().split())
res = A*B

# 최대공약수
while B:
    if A > B:
        A, B = B, A
    B %= A

# 최소공배수
=======
# 입력
A, B = map(int, input().split())
res = A*B

# 최대공약수
while B:
    if A > B:
        A, B = B, A
    B %= A

# 최소공배수
>>>>>>> 333d5879a20af5c580ac8537f6df7f1d1a71bc85
print(res//A)