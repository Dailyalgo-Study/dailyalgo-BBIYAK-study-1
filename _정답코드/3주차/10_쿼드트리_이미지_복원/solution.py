answer = [[0 for _ in range(8)] for _ in range(8)]
comp = ""
idx = 0

def solution(compressed):
    global comp, idx
    comp = compressed
    idx = 0
    decode(0, 0, 8)
    return answer

def decode(x, y, n):
    global idx
    if comp[idx] != "(":
        value = int(comp[idx])
        for i in range(x, x + n):
            for j in range(y, y + n):
                answer[i][j] = value
        idx += 1
    else:
        idx += 1
        decode(x, y, n // 2)
        decode(x, y + n // 2, n // 2)
        decode(x + n // 2, y, n // 2)
        decode(x + n // 2, y + n // 2, n // 2)
        idx += 1

