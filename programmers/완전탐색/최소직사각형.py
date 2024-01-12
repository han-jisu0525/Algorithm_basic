def solution(sizes):
    answer = 0
    max_sizes = [] 
    min_sizes = []

    for i in sizes:
        max_sizes.append(max(i[0], i[1]))
        min_sizes.append(min(i[0], i[1]))
    max_sizes.sort(reverse = True)
    min_sizes.sort(reverse = True)
    
    answer = max_sizes[0] * min_sizes[0]
    
    return answer