def solution(ropes):
    answer = -1

    ropes.sort(reverse = True)

    for i in range(len(ropes)):
        answer = max(answer, (i+1) * ropes[i])
        
    return answer

