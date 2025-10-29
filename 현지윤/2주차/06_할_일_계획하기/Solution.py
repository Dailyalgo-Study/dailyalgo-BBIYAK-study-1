def solution(tasks):
    answer = 0
    #종료시간 기준로 함수 sort하게 어쩌고 저쩌고
    def sort_key(tasks):
        #1번쩨 인덱스 기준
        return tasks[1]

    tasks.sort(key=sort_key)
    last_end = 0 

    for start, end in tasks:
        # 현재 작업시간 >= 마지막 종료시가 ㄱ 이상이면 카운트 증가
        if start >= last_end:
            print(f'start:{start}, last_end : {last_end}, end:{end},')
            answer +=1
            print(last_end)
            last_end = end
    return answer


if __name__ == "__main__":
    tasks1 = [[1, 3], [2, 5], [4, 6], [5, 7], [6, 9]]
    print(solution(tasks1))
    