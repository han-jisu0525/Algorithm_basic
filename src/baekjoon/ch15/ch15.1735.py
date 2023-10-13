<<<<<<< HEAD
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

=======
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

>>>>>>> 333d5879a20af5c580ac8537f6df7f1d1a71bc85
print("%d %d" % (top/N, under/N))