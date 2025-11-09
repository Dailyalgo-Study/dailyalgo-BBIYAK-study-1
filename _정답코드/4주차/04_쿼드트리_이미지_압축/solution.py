img_glob = []

def solution(img):
    global img_glob
    img_glob = img
    return encode(0, 0, 8)

def encode(x, y, n):
    count_zero = 0
    for i in range(x, x + n):
        for j in range(y, y + n):
            if img_glob[i][j] == 0:
                count_zero += 1
    if count_zero == 0:
        return "1"
    if count_zero == n * n:
        return "0"
    return "(" + \
        encode(x, y, n // 2) + \
        encode(x, y + n // 2, n // 2) + \
        encode(x + n // 2, y, n // 2) + \
        encode(x + n // 2, y + n // 2, n // 2) + \
        ")"

