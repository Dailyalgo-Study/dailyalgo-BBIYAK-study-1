def solution(n):
    answer = recursive(n)
    
    return answer


def recursive(n):
    if n == 1:
        return 1 
    else:
        # print(n)
        return n * recursive(n-1)

