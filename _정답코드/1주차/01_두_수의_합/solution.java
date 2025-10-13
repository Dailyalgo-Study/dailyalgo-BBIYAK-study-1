class Solution {
    public int solution(int[] numbers, int m) {
        int res = 0;
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum <= m && sum > res) {
                    res = sum;
                }
            }
        }
        return res;
    }
}