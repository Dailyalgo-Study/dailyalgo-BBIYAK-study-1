import java.util.Scanner;

class Solution {
    public int solution(int n, int m, String[] board) {
        int minRepaint = 64;
        
        for (int startRow = 0; startRow <= n - 8; startRow++) {
            for (int startCol = 0; startCol <= m - 8; startCol++) {
                int repaintW = 0; // 'W'로 시작하는 패턴
                int repaintB = 0; // 'B'로 시작하는 패턴
                
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char current = board[startRow + i].charAt(startCol + j);
                        
                        // 'W'로 시작하는 체스판 패턴
                        char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B';
                        if (current != expectedW) repaintW++;
                        
                        // 'B'로 시작하는 체스판 패턴
                        char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W';
                        if (current != expectedB) repaintB++;
                    }
                }
                
                minRepaint = Math.min(minRepaint, Math.min(repaintW, repaintB));
            }
        }
        
        return minRepaint;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        String[] board = new String[n];
        for (int i = 0; i < n; i++) {
            board[i] = sc.nextLine();
        }
        
        Solution sol = new Solution();
        System.out.println(sol.solution(n, m, board));
        
        sc.close();
    }
}

