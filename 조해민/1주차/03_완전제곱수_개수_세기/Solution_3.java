public class Solution {
	public int solution(int n, int m) {
		int answer = 0;

        for(int k = 0; k * k <= m; k++) {
            if(k * k >= n && k * k <= m) {
                answer++;
            }
        }
        return answer;
	}
}
