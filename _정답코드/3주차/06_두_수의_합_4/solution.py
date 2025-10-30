def solution(numbers, target):
    answer = [-1, -1]
    n = len(numbers)
    left, right = 0, n - 1

    while left < right:
        total = numbers[left] + numbers[right]
        if total == target:
            answer = [numbers[left], numbers[right]]
            left += 1
        elif total < target:
            left += 1
        else:
            right -= 1

    return answer