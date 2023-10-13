import sys

<<<<<<< HEAD
T = int(input())

for i in range(T):
    a, b = map(int, sys.stdin.readline().split())
    aa, bb = a, b

    while bb != 0:
        aa %= bb
        aa, bb = bb, aa

    print(a*b // aa)
=======
T=int(input())

for i in range(T):
    a,b=map(int,sys.stdin.readline().strip().split())
    aa,bb=a,b

    while bb!=0:
        aa=aa%bb
        aa,bb=bb,aa

    print(a*b//aa)
>>>>>>> 333d5879a20af5c580ac8537f6df7f1d1a71bc85
