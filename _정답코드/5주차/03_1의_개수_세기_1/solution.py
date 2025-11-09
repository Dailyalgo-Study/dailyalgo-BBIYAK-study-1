def solution(bits, queries):
    n = len(bits)
    prefixSum = [0] * (n + 1)
    
    for i in range(n):
        prefixSum[i + 1] = prefixSum[i] + bits[i]
    
    result = []
    for i in range(len(queries)):
        l = queries[i][0]
        r = queries[i][1]
        result.append(prefixSum[r] - prefixSum[l - 1])
    
    return result

