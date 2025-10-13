def solution(sides):
    n = len(sides)
    minP = float('inf')
    for i in range(n-2):
        for j in range(i+1, n-1):
            for k in range(j+1, n):
                a, b, c = sides[i], sides[j], sides[k]
                if a + b > c and a + c > b and b + c > a:
                    s = a + b + c
                    if s < minP:
                        minP = s
    assert minP != float('inf'), "No valid triangle can be formed"
    return minP