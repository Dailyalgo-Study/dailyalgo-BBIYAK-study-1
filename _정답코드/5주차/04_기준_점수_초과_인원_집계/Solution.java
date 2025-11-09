class Solution {
    public int[] solution(int[] numbers, int infimum, int[][] queries) {
        int n = numbers.length;
        int[] prefixCount = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefixCount[i + 1] = prefixCount[i];
            if (numbers[i] > infimum) {
                prefixCount[i + 1]++;
            }
        }
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            result[i] = prefixCount[r] - prefixCount[l - 1];
        }
        
        return result;
    }
}

