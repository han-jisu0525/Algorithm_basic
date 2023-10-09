import math

n = int(input())  # 심어져 있는 나무수
a = int(input())  # 첫 번째 나무의 좌표

arr = []

for i in range(n-1):
    num = int(input())
    arr.append(num - a)  # 나무와 나무 사이의 거리 -> 제일 짧은 거리 찾기
    a = num

b = arr[0]

for i in range(1, len(arr)):
    b = math.gcd(b, arr[i])  # 최대공약수 찾기 (gcd 이용)

result = 0

for each in arr:
    result += (each // b) - 1  # 둘 사이에 심을 가로수 개수: 간격//최대공약수-1

print(result)