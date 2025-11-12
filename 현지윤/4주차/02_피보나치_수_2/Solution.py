# 풀이가 계속 틀려서 정답 코드를 보면서 공부하겠습니다.

def solution(n):
    # nonlocal
        # -> 중첩함수내에서 외부함수의 지역변수를 수정할 수 있게 함
    def fibo(n):
        nonlocal count1, count2
        if n == 1:
            count1 += 1
        elif n == 2:
            count2 += 1
        else:
            fibo(n - 1)
            fibo(n - 2)
    
    count1 = 0
    count2 = 0
    # if n == 4,
        # fibo(3)과 fibo(2) 호출 
        # fibo(3)은 fibo(2)와 fibo(1)을 호출 
            # conunt2 == 1
            # count1 == 1
        #fibo(2) 
            # count2 == 2
        # fibo(4) == [1,2]
    fibo(n)
    
    return [count1, count2]
