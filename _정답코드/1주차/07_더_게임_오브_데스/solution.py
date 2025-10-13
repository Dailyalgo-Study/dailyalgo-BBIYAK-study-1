def solution(target, k):
    current = 1
    for _ in range(k):
        current = target[current-1]
    return current