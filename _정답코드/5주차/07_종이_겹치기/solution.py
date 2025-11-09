def solution(n, m, papers):
    count = [[0] * (m + 2) for _ in range(n + 2)]
    
    for i in range(len(papers)):
        x1 = papers[i][0]
        y1 = papers[i][1]
        x2 = papers[i][2]
        y2 = papers[i][3]
        
        count[x1][y1] += 1
        count[x1][y2 + 1] -= 1
        count[x2 + 1][y1] -= 1
        count[x2 + 1][y2 + 1] += 1
    
    result = [[0] * m for _ in range(n)]
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            count[i][j] += count[i - 1][j] + count[i][j - 1] - count[i - 1][j - 1]
            result[i - 1][j - 1] = count[i][j]
    
    return result

