def solution(numbers):
    # 버블정렬을 사용해 풀기
    n = len(numbers)
    for i in range(n-1):
        for j in range(n-1-i):
            if numbers[j] < numbers[j+1]:
                #Python의 동시할당 문법을 통해 풀어준다.
                numbers[j], numbers[j + 1] = numbers[j + 1], numbers[j]

    return numbers
