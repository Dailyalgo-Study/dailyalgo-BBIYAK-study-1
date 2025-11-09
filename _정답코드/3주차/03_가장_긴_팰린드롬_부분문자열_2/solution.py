def solution(text):
    
    def get_max_palin_size(left, right):
        while left - 1 >= 0 and right + 1 < length and text[left - 1] == text[right + 1]:
            left -= 1
            right += 1
        return right - left + 1
    
    length = len(text)
    answer = 0

    for i in range(length):
        temp = get_max_palin_size(i, i)
        if temp > answer:
            answer = temp

    for i in range(length - 1):
        if text[i] == text[i + 1]:
            temp = get_max_palin_size(i, i + 1)
            if temp > answer:
                answer = temp

    return answer

