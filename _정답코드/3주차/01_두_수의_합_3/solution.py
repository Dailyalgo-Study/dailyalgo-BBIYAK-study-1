def solution(numbers, target):
    n = len(numbers)
    left, right = 0, n - 1
    answer = 0

    while left < right:
        cur_sum = numbers[left] + numbers[right]
        cnt_left, cnt_right = 1, 1

        while left + cnt_left < n and numbers[left] == numbers[left + cnt_left]:
            cnt_left += 1
            
        while right - cnt_right >= 0 and numbers[right] == numbers[right - cnt_right]:
            cnt_right += 1

        if cur_sum == target:
            if numbers[left] == numbers[right]:
                answer += cnt_left * (cnt_left - 1) // 2
            else:
                answer += cnt_left * cnt_right
            left += cnt_left
            right -= cnt_right
        elif cur_sum < target:
            left += cnt_left
        else:
            right -= cnt_right

    return answer

