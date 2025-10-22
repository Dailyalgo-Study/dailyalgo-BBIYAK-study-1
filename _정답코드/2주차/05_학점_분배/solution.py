def solution(scores):
    n = len(scores)
    numbers = list(range(n))

    numbers.sort(key = lambda x : (-scores[x], x))

    answer = [""] * n
    for i in range(n):
        number = numbers[i]
        if i < n//3:
            answer[number] = "A"
        elif i < 2*n//3:
            answer[number] = "B"
        else:
            answer[number] = "C"
    return answer

