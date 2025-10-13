def solution(n, m, board):
    min_repaint = 64
    
    for start_row in range(n - 7):
        for start_col in range(m - 7):
            repaint_w = 0  # 'W'로 시작하는 패턴
            repaint_b = 0  # 'B'로 시작하는 패턴
            
            for i in range(8):
                for j in range(8):
                    current = board[start_row + i][start_col + j]
                    
                    # 'W'로 시작하는 체스판 패턴
                    expected_w = 'W' if (i + j) % 2 == 0 else 'B'
                    if current != expected_w:
                        repaint_w += 1
                    
                    # 'B'로 시작하는 체스판 패턴
                    expected_b = 'B' if (i + j) % 2 == 0 else 'W'
                    if current != expected_b:
                        repaint_b += 1
            
            min_repaint = min(min_repaint, repaint_w, repaint_b)
    
    return min_repaint


n, m = map(int, input().split())
board = []
for _ in range(n):
    board.append(input().strip())

print(solution(n, m, board))

