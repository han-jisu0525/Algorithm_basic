def gcd(top, under):
    mod = top % under
    while mod > 0:
        top = under
        under = mod
        mod = top % under
    return under

A, B = map(int, input().split())
C, D = map(int, input().split())

under = B * D
top = A*D + B*C
N = gcd(top, under)

# for i in range(2, under):
#     if under%i==0 and top%i==0:
#         under /= i
#         top /= i

print("%d %d" % (top/N, under/N))