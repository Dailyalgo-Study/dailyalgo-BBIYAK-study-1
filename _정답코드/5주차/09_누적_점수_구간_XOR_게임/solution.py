def solution(numbers, queries):
    n = len(numbers)
    prefixXor = [0] * (n + 1)
    
    for i in range(n):
        prefixXor[i + 1] = prefixXor[i] ^ numbers[i]
    
    result = []
    for i in range(len(queries)):
        l = queries[i][0]
        r = queries[i][1]
        result.append(prefixXor[r] ^ prefixXor[l - 1])
    
    return result

