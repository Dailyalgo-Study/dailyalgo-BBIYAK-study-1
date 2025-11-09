def solution(numbers):
    n = len(numbers)
    answer = []

    for iteration in range(n):
        max_value = -99999
        max_idx = -1

        for idx, num in enumerate(numbers):
            if num > max_value:
                max_value = num
                max_idx = idx
        
        answer.append(max_value)
        numbers.pop(max_idx)

    return answer

