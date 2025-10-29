def solution(numbers, window):
    n = len(numbers)
    window_sum = 0

    for i in range(window):
        window_sum += numbers[i]

    answer = [window_sum]

    for i in range(window, n):
        window_sum += numbers[i] - numbers[i - window]
        answer.append(window_sum)

    return answer

