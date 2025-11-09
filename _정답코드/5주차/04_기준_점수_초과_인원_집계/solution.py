def solution(numbers, infimum, queries):
    n = len(numbers)
    prefixCount = [0] * (n + 1)
    
    for i in range(n):
        prefixCount[i + 1] = prefixCount[i]
        if numbers[i] > infimum:
            prefixCount[i + 1] += 1
    
    result = []
    for i in range(len(queries)):
        l = queries[i][0]
        r = queries[i][1]
        result.append(prefixCount[r] - prefixCount[l - 1])
    
    return result

