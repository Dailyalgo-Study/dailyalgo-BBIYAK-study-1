def solution(text):
    
    def is_palin(left, right):
        n = right - left + 1
        for i in range(n):
            if text[left + i] != text[right - i]:
                return False
        return True

    n = len(text)
    answer = 0

    for i in range(n):
        for j in range(i, n):
            if is_palin(i, j) and answer < (j - i + 1):
                answer = j - i + 1
                
    return answer

