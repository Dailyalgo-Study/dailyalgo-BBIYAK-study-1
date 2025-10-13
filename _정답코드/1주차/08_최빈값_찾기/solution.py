def solution(numbers):
    freq = {}
    for num in numbers:
        freq[num] = freq.get(num, 0) + 1

    max_freq = 0
    result = 0

    for num, count in freq.items():
        if count > max_freq:
            max_freq = count
            result = num

    return result