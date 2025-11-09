class Solution {
    public int[] solution(int[] numbers, int[][] queries) {
        int n = numbers.length;
        int[] prefixSum = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + numbers[i];
        }
        
        int totalSum = prefixSum[n];
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            
            if (l <= r) {
                result[i] = prefixSum[r] - prefixSum[l - 1];
            } else {
                result[i] = totalSum - (prefixSum[l - 1] - prefixSum[r]);
            }
        }
        
        return result;
    }
}

