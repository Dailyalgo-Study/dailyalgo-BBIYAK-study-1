def solution(array):
    m = len(array)
    n = len(array[0])
    max_sum = array[0][0] + array[0][1] + array[1][0] + array[1][1]
    min_sum = max_sum
    for i in range(m-1):
        for j in range(n-1):
            s = array[i][j] + array[i][j+1] + array[i+1][j] + array[i+1][j+1]
            if s > max_sum:
                max_sum = s
            if s < min_sum:
                min_sum = s
    return [max_sum, min_sum]