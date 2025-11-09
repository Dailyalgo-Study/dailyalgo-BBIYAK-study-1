def binary_search(numbers, left, right, target):
    if left == right:
        return left
    
    mid = (left + right + 1) // 2
    if numbers[mid] <= target:
        return binary_search(numbers, mid, right, target)
    else:
        return binary_search(numbers, left, mid-1, target)

def solution(numbers, target):
    n = len(numbers)
    if numbers[0] > target:
        return numbers[0]
    
    idx = binary_search(numbers, 0, n-1, target)
    if idx == n-1:
        return numbers[n-1]
    
    left_value = numbers[idx]
    right_value = numbers[idx+1]
    
    if right_value - target <= target - left_value:
        return right_value
    else:
        return left_value

