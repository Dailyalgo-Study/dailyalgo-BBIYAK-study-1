jewel_count = {}
all_jewels = ["Diamond", "Ruby", "Emerald", "Sapphire", "Gold"]

def solution(jewels):
    global jewel_count
    jewel_count = {j: 0 for j in all_jewels}

    n = len(jewels)
    left, right = 0, 4

    for i in range(5):
        jewel = jewels[i]
        jewel_count[jewel] += 1

    answer = n

    while left < n:
        contain = contain_all_jewels()

        if not contain and right < n - 1:
            added_jewel = jewels[right + 1]
            jewel_count[added_jewel] += 1
            right += 1
        else:
            if contain:
                window = right - left + 1
                if window < answer:
                    answer = window
            removed_jewel = jewels[left]
            jewel_count[removed_jewel] -= 1
            left += 1

    return answer


def contain_all_jewels():
    for jewel in all_jewels:
        if jewel_count[jewel] == 0:
            return False
    return True