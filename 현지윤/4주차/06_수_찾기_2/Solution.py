def solution(numbers, target):
    left = 0
    right = len(numbers) - 1

    while left <= right:
        mid = (left + right) // 2 # 중간인데스를 찾기

        if numbers[mid] == target:
            return True # 만약 중간 인덱스가 target과 같으면 True를 반환한다.
        elif numbers[mid] > target:
            left = mid + 1
            #만약 mid값이 target 보다 크면 내림차순이므로 target은 오른쪽에 있을 것이다.
            # if -> 4,2,2,0,-2, 이런 상황이고 target이 0 이고 mid가 4라면 
            # 타겟이 0이므로 오른쪽에 있을것이므로 mid+1 ~ right까지 다시 탐색하면 된다.
        else:
            # 반대인 경우는 타겟이 왼쪽에 있을 것이므로 left ~ mid - 1 부터 탐색하면 된다.
            right = mid - 1

    return False
