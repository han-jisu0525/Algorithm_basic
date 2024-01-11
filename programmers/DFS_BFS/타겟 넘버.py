def solution(numbers, target):
    def dfs(nums, target, idx, curr):
        if idx == len(nums):
            return 1 if curr == target else 0
        
        return dfs(nums, target, idx+1, curr+nums[idx]) \
                + dfs(nums, target, idx+1, curr-nums[idx])
    
    return dfs(numbers, target, 0, 0)