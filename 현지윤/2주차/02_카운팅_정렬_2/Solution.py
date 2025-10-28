def solution(numbers):
    answer = []
    # 최대,최소값 찾기
    mn = min(numbers)
    mx = max(numbers)

    #2. 카운트 배열 생성 
    # 최소 - (최대 +1)
    count = [0] * (mx - mn + 1 )

    # 등장 횟수 세기
    for num in numbers:
        count[num - mn ] += 1

    for i in range(len(count)):
        print('i + mn: ',i , ':' ,i + mn)
        answer.extend([i + mn] * count[i])

    return answer
