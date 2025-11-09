public class Solution {
	public int solution(int[] target, int k) {
        int answer = 1;

        for(int i = 1; i <= k; i++) {
            answer = target[answer - 1];
        }
        return answer;
	}
}
