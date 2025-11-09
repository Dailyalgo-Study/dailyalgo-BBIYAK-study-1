def solution(numbers, queries):
    n = len(numbers)
    prefixSum = [0] * (n + 1)
    
    for i in range(n):
        prefixSum[i + 1] = prefixSum[i] + numbers[i]
    
    result = []
    for i in range(len(queries)):
        l = queries[i][0]
        r = queries[i][1]
        result.append(prefixSum[r] - prefixSum[l - 1])
    
    return result

