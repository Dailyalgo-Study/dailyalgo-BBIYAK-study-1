def solution(numbers):
    n = len(numbers)
    sumCount = {}
    sumCount[numbers[0]] = 1
    
    for i in range(1, n):
        numbers[i] += numbers[i - 1]
        if numbers[i] in sumCount:
            sumCount[numbers[i]] += 1
        else:
            sumCount[numbers[i]] = 1
    
    count = 0
    for key in sumCount:
        value = sumCount[key]
        if key == 0:
            count += value * (value + 1) // 2
        else:
            count += value * (value - 1) // 2
    
    return count

