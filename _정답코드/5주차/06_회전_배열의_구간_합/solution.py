def solution(numbers, queries):
    n = len(numbers)
    prefixSum = [0] * (n + 1)
    
    for i in range(n):
        prefixSum[i + 1] = prefixSum[i] + numbers[i]
    
    totalSum = prefixSum[n]
    
    result = []
    for i in range(len(queries)):
        l = queries[i][0]
        r = queries[i][1]
        
        if l <= r:
            result.append(prefixSum[r] - prefixSum[l - 1])
        else:
            result.append(totalSum - (prefixSum[l - 1] - prefixSum[r]))
    
    return result

