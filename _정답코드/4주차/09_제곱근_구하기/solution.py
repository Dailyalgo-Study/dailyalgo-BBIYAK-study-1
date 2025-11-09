def round_val(x):
    return round(x * 1000.0) / 1000.0

def sqrt(left, right, target):
    if round_val(left) == round_val(right):
        return round_val(left)
    
    mid = (left + right) / 2.0
    if mid * mid <= target:
        return sqrt(mid, right, target)
    else:
        return sqrt(left, mid, target)

def solution(n):
    return sqrt(0.0, n+1.0, n)

