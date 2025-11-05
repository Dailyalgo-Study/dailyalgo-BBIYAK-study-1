def solution(numbers, window):
    answer = []
    #슬라이딩 윈도우
    n = len(numbers)

    for i in range(n - window + 1):
        #  n == 5, window == 3 ,
        pre_answer = 0
        # i = 0, j(0~3)
        # i = 1, j(1~4)
        for j in range(i, i+ window):
            pre_answer += numbers[j]

        print(pre_answer)

        answer.append(pre_answer)




    return answer
