def binary_search(numbers, left, right):
    if left == right:
        return left
    
    mid = (left + right + 1) // 2
    if numbers[mid-1] < numbers[mid]:
        return binary_search(numbers, mid, right)
    else:
        return binary_search(numbers, left, mid-1)

def solution(numbers):
    n = len(numbers)
    if n == 1:
        return numbers[0]
    if numbers[0] > numbers[1]:
        return numbers[0]
    if numbers[n-1] > numbers[n-2]:
        return numbers[n-1]
    
    idx = binary_search(numbers, 1, n-1)
    return numbers[idx]

