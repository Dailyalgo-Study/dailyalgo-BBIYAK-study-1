def solution(n, m):
    count = 0
    for i in range(n, m+1):
        if int(i**0.5)**2 == i:
            count += 1
    return count