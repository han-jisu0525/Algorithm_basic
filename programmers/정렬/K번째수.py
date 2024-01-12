def solution1(array, commands):
    answer = []
    for i in commands:
        new_array = []
        for j in range(i[0], i[1]+1):
            new_array.append(array[j-1])
        new_array.sort()
        answer.append(new_array[i[2]-1])

    return answer

def solution2(array, commands): 
    answer = []
    for i, j, k in commands:
        answer.append(sorted(array[i-1:j])[k-1])
    return answer