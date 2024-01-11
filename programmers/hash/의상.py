def solution1(clothes):
    from collections import defaultdict

    answer = 1
    cloth = defaultdict(list)

    for i in clothes:
        cloth[i[1]].append(i[0])
    for j in cloth:
        answer *= len(cloth[j]) + 1

    answer -= 1
    return answer

def solution2(clothes):
    cloth_dict = {}
    for _, t in clothes:
        if t not in cloth_dict:
            cloth_dict[t] = 2
        else:
            cloth_dict[t] += 1
            
    for i in cloth_dict.values():
        answer *= i
    return answer - 1