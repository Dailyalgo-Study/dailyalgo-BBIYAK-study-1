def solution(n):

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

    fibo(n)
    
    return [count1, count2]

