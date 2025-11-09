def getBackup(mems, x):
    sum_val = 0
    for m in mems:
        if m > x:
            sum_val += (m - x)
    return sum_val

def binary_search(mems, limit, left, right):
    if left == right:
        return left
    
    mid = (left + right) // 2
    if getBackup(mems, mid) <= limit:
        return binary_search(mems, limit, left, mid)
    else:
        return binary_search(mems, limit, mid+1, right)

def solution(limit, mems):
    return binary_search(mems, limit, 0, 1000000)

