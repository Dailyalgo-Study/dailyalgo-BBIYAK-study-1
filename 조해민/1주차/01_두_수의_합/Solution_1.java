public class Solution {
	public int solution(int[] numbers, int m) {
		int answer = 0;

        for(int i = 0; i <= numbers.length - 1; i++) {
            for(int j = i + 1; j <= numbers.length - 1; j++) {
                int sum = numbers[i] + numbers[j]; 
                if(sum <= m && sum >= answer) {
                    answer = sum;
                }
            }
        }
        return answer;
	}
}
