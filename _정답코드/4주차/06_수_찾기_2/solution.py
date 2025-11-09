def binary_search(numbers, left, right, target):
    if left == right:
        return left
    
    mid = (left + right + 1) // 2
    if numbers[mid] >= target:
        return binary_search(numbers, mid, right, target)
    else:
        return binary_search(numbers, left, mid-1, target)

def solution(numbers, target):
    n = len(numbers)
    left, right = 0, n-1
    idx = binary_search(numbers, left, right, target)
    return numbers[idx] == target

