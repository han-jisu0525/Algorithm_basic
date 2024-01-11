import collections

def solution(nums):
    answer = 0
    num_dict = collections.Counter(nums)
    if len(num_dict) <= len(nums)/2:
        return len(num_dict)
    else:
        return len(nums) // 2