def solution(numbers):
    answer = 0

    for i in numbers:
        count = 0

        for j in numbers:
            if i == j:
                count += 1

        if count == 1:
            answer = i
            break

    return answer