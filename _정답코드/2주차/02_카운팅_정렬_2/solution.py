def solution(numbers):
    count = [0] * 2001

    for num in numbers:
        count[num+1000] += 1
    
    for idx in range(1, 2001):
        count[idx] += count[idx-1]
    
    answer = [0] * len(numbers)
    for num in numbers:
        answer[count[num+1000]-1] = num
        count[num+1000] -= 1

    return answer

