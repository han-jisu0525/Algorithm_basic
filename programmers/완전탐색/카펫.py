def solution(brown, yellow):
    answer = []
    brown2 = brown // 2
    j = 0
    
    for i in range(brown2, 0, -1):
        print(i, j)
        if (i-2) * j == yellow:
            answer = [i, j+2]
            break
        else:
            j += 1
    return answer