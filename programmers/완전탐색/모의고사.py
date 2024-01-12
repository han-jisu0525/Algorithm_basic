def solution(answers):
    answer = []
    stu1_score = 0
    stu2_score = 0
    stu3_score = 0
    
    stu1 = [1, 2, 3, 4, 5]
    stu2 = [2, 1, 2, 3, 2, 4, 2, 5]
    stu3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    for i in range(len(answers)):
        j = i % len(stu1)
        if answers[i] == stu1[j]:
            stu1_score += 1
            
    for i in range(len(answers)):
        j = i % len(stu2)
        if answers[i] == stu2[j]:
            stu2_score += 1
            
    for i in range(len(answers)):
        j = i % len(stu3)
        if answers[i] == stu3[j]:
            stu3_score += 1
    max_ans = max([stu1_score, stu2_score, stu3_score])
    
    if stu1_score == max_ans:
        answer.append(1)
    if stu2_score == max_ans:
        answer.append(2)
    if stu3_score == max_ans:
        answer.append(3)
    
    return answer