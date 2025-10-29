def solution(scores):
    answer = []
    n = len(scores)
    k = n // 3

    def sort_key(i):
        # 점수는 내림차순, 번호는 오름차순
        return (-scores[i], i+1)

    order = sorted(range(n), key=sort_key)

    grades = [''] * n # 등급 초기화

    for rank, idx in enumerate(order):
        if rank < k : #상위 33%.
            grade = 'A'
        elif rank < 2 * k:
            grade = 'B'
        else:
            grade = 'C'

        grades[idx] = grade
    return grades
