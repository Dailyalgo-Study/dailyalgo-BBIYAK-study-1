def solution(A, B):
    # B 배열 오름차순
    B.sort()

    def sort_arr(a):
        print('sort_Arr', A[a],'a',a)
        return A[a]

    sorted_indices = sorted(range(len(A)), key=sort_arr, reverse=True)

    # B의 큰 값을 A의 큰 값 위치에 배치
    B_rearranged = [0] * len(B) # B초기화
    for i, idx in enumerate(sorted_indices):
        print(f'i:{i}|실제idx:{idx} : A[{idx}]:{A[idx]}')
        B_rearranged[idx] = B[len(B) - 1 - i]


    # 내적값 계산
    result = sum(A[i] * B_rearranged[i] 
                    for i in range(len(A)))

    return result
