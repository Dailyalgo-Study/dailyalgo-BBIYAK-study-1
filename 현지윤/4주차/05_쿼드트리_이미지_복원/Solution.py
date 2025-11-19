def solution(compressed):
    idx = [0]

    def restore():
        char = compressed[idx[0]]
        print(f'char : {c}')
        idx[0] += 1

        if char == '0':
            return [[0]]

        if char == '1':
            return [[1]]

        # char == '('인 경우
        # 4조각 복원
        a = restore()  # 좌상
        b = restore()  # 우상
        c = restore()  # 좌하
        d = restore()  # 우하

        idx[0] += 1  # ')' 건너뛰기

        # 크기 맞추기 (가장 큰 크기로 확장)
        size = max(len(a), len(b), len(c), len(d))

        # 작은 배열을 size x size로 확장
        def expand(arr, target_size):
            current_size = len(arr)
            if current_size == target_size:
                return arr

            # 현재 크기에서 목표 크기로 확장
            # 각 셀을 (target_size / current_size)배로 복제
            scale = target_size // current_size
            result = []
            for row in arr:
                # 각 행을 scale배 복제
                expanded_row = []
                for value in row:
                    expanded_row.extend([value] * scale)
                # 행 자체도 scale번 반복
                for _ in range(scale):
                    result.append(expanded_row[:])
            return result

        a = expand(a, size)
        b = expand(b, size)
        c = expand(c, size)
        d = expand(d, size)

        # 4조각 합치기
        result = []
        # 위쪽 = a + b (좌우로 붙이기)
        for i in range(size):
            result.append(a[i] + b[i])
        # 아래쪽 = c + d (좌우로 붙이기)
        for i in range(size):
            result.append(c[i] + d[i])

        return result

    # 복원 후 8x8로 확장
    result = restore()
    size = len(result)

    # 1x1이면 8x8로 확장
    if size == 1:
        value = result[0][0]
        return [[value] * 8 for _ in range(8)]

    return result