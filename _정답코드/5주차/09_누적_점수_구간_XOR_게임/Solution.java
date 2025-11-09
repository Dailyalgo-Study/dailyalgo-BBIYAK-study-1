class Solution {
    public int[] solution(int[] numbers, int[][] queries) {
        int n = numbers.length;
        int[] prefixXor = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefixXor[i + 1] = prefixXor[i] ^ numbers[i];
        }
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            result[i] = prefixXor[r] ^ prefixXor[l - 1];
        }
        
        return result;
    }
}

