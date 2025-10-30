public class Solution {
    public int solution(int n, int m) {
        int answer = 0;
        for (int i = 1; i * i <= m; i++) {
            if (i * i >= n) {
                answer += 1;
            }
        }
        return answer;
    }
}
