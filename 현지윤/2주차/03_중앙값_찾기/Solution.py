def solution(numbers):
    answer = 0
    print(sorted(numbers))
    sorted_nums = sorted(numbers)
    n = len(numbers)
    print(int(n/2))
    n = int(n/2)
    answer = sorted_nums[n]
    return answer
