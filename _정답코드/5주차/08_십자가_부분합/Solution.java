class Solution {
    public int[] solution(int[][] numbers, int[][] queries) {
        int n = numbers.length;
        int m = numbers[0].length;
        
        int[][] rowPrefixSum = new int[n + 1][m + 1];
        int[][] colPrefixSum = new int[n + 1][m + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                rowPrefixSum[i][j] = rowPrefixSum[i][j - 1] + numbers[i - 1][j - 1];
                colPrefixSum[i][j] = colPrefixSum[i - 1][j] + numbers[i - 1][j - 1];
            }
        }
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int cx = queries[i][0];
            int cy = queries[i][1];
            int s = queries[i][2];
            
            int horizontalSum = rowPrefixSum[cx][cy + s] - rowPrefixSum[cx][cy - s - 1];
            int verticalSum = colPrefixSum[cx + s][cy] - colPrefixSum[cx - s - 1][cy];
            
            result[i] = horizontalSum + verticalSum - numbers[cx - 1][cy - 1];
        }
        
        return result;
    }
}

