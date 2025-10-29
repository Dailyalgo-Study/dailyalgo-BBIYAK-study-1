def solution(ropes):
    def sort_key(rope):
        # 내림차순 정렬
        return -rope

    # 강한 로프부터 정렬 (내림차순)
    ropes.sort(key=sort_key)

    max_load = 0  # 최대 적재하중

 
    for i in range(len(ropes)):
        # 현재까지의 로프 개수
        count = i + 1
        # 현재까지 중 가장 약한 로프 (정렬되어 있으므로 현재 로프)
        min_rope = ropes[i]
        # 묶음의 인장 하중 계산
        load = count * min_rope
        print(f'count:{count} x min_rope:{min_rope} = load:{load}')
        # 최댓값 갱신
        max_load = max(max_load, load)
        print(f'max_load:{max_load}')

    return max_load


