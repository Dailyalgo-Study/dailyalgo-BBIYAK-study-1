class Solution {
    public int solution(int n, int m) {
        int count = 0;
        for (int i = n; i <= m; i++) {
            int sqrt = (int)Math.sqrt(i);
            if (sqrt * sqrt == i) {
                count++;
            }
        }
        return count;
    }
}