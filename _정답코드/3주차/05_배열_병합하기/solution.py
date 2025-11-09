def solution(arr1, arr2):
    len1 = len(arr1)
    len2 = len(arr2)
    idx1, idx2 = 0, 0
    answer = []

    while idx1 < len1 and idx2 < len2:
        if arr1[idx1] < arr2[idx2]:
            answer.append(arr1[idx1])
            idx1 += 1
        else:
            answer.append(arr2[idx2])
            idx2 += 1

    while idx1 < len1:
        answer.append(arr1[idx1])
        idx1 += 1

    while idx2 < len2:
        answer.append(arr2[idx2])
        idx2 += 1

    return answer

