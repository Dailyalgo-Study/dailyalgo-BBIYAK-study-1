class Solution {
    public int[] solution(int[] bits, int[][] queries) {
        int n = bits.length;
        int[] prefixSum = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + bits[i];
        }
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            result[i] = prefixSum[r] - prefixSum[l - 1];
        }
        
        return result;
    }
}

