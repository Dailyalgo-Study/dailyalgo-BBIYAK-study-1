def solution(numbers, target):
    answer = 0
    n = len(numbers)
    for i in range(n):
        for j in range(i+1, n):
            # print(f'i :{numbers[i]}, j : {numbers[j]}')
            if numbers[i]+ numbers[j] == target:
                answer += 1


    return answer
