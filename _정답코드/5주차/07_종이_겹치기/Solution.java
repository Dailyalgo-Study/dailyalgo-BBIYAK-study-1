class Solution {
    public int[][] solution(int n, int m, int[][] papers) {
        int[][] count = new int[n + 2][m + 2];
        
        for (int i = 0; i < papers.length; i++) {
            int x1 = papers[i][0];
            int y1 = papers[i][1];
            int x2 = papers[i][2];
            int y2 = papers[i][3];
            
            count[x1][y1]++;
            count[x1][y2 + 1]--;
            count[x2 + 1][y1]--;
            count[x2 + 1][y2 + 1]++;
        }
        
        int[][] result = new int[n][m];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                count[i][j] += count[i - 1][j] + count[i][j - 1] - count[i - 1][j - 1];
                result[i - 1][j - 1] = count[i][j];
            }
        }
        
        return result;
    }
}

