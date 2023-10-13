import sys

T = int(input())

for i in range(T):
    a, b = map(int, sys.stdin.readline().split())
    aa, bb = a, b

    while bb != 0:
        aa %= bb
        aa, bb = bb, aa

    print(a*b // aa)