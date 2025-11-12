def solution(numbers, target):
    left, right = 0, len(numbers) - 1
    answer = [-1, -1]
    min_ = 9999
    
    # 오름차순이므로 left가 right보다 크면 안도니다.
    while left < right:
        # 양 끝 값을 비교한다.
        s = numbers[left] + numbers[right]
        # 만약 s가 target이라면
        # 두 원소의 차를 구한다. -> diff
        # 만약 diff값이 기존의 min_값보다 작다면 교체한다.
        if s == target:
            diff = numbers[right] - numbers[left]
            if diff < min_:
                min_ = diff
                answer = [numbers[left], numbers[right]]
            # target과 같아도 두 포인터 이동, 완전탐색
            left += 1
            right -= 1
        # 만 s값이 target보다 작다면 왼쪽 인덱스 증가
        elif s < target:
            left += 1
        # s값이 target보다 클 경우 오른쪽인덱스 감소 
        else:
            right -= 1

    return answer