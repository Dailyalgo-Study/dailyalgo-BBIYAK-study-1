def solution(numbers, queries):
    n = len(numbers)
    m = len(numbers[0])
    
    rowPrefixSum = [[0] * (m + 1) for _ in range(n + 1)]
    colPrefixSum = [[0] * (m + 1) for _ in range(n + 1)]
    
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            rowPrefixSum[i][j] = rowPrefixSum[i][j - 1] + numbers[i - 1][j - 1]
            colPrefixSum[i][j] = colPrefixSum[i - 1][j] + numbers[i - 1][j - 1]
    
    result = []
    for i in range(len(queries)):
        cx = queries[i][0]
        cy = queries[i][1]
        s = queries[i][2]
        
        horizontalSum = rowPrefixSum[cx][cy + s] - rowPrefixSum[cx][cy - s - 1]
        verticalSum = colPrefixSum[cx + s][cy] - colPrefixSum[cx - s - 1][cy]
        
        result.append(horizontalSum + verticalSum - numbers[cx - 1][cy - 1])
    
    return result

