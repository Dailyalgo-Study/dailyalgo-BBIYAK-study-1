class Solution {
    public int[] solution(int[][] array) {
        int m = array.length;
        int n = array[0].length;
        int maxSum = array[0][0] + array[0][1] + array[1][0] + array[1][1];
        int minSum = maxSum;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                int s = array[i][j] + array[i][j+1] + array[i+1][j] + array[i+1][j+1];
                if (s > maxSum) maxSum = s;
                if (s < minSum) minSum = s;
            }
        }
        return new int[]{maxSum, minSum};
    }
}