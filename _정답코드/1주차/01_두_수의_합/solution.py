def solution(numbers, m):
    res = 0
    n = len(numbers)
    for i in range(n - 1):
        for j in range(i + 1, n):
            s = numbers[i] + numbers[j]
            if s <= m and s > res:
                res = s
    return res
