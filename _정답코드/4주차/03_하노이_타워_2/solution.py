def solution(n):

    def hanoi(n, start, end, mid):
        move = [n, start, end]
        if n == 1:
            answer.append(move)
        else:
            hanoi(n - 1, start, mid, end)
            answer.append(move)
            hanoi(n - 1, mid, end, start)
    
    answer = []
    hanoi(n, 1, 3, 2)
    
    return answer

