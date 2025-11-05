public class Solution {
	public int[] solution(int[] numbers, int window) {
        int[] result = new int[numbers.length - window + 1];
        int sum = 0;

        for (int i = 0; i < window; i++) {
            sum += numbers[i];
        }

        result[0] = sum;

        for (int i = 1; i <= numbers.length - window; i++) {
            sum = sum - numbers[i - 1] + numbers[i + window - 1];
            result[i] = sum;
        }

        return result;
    }
}
