public class Solution {
    public int solution(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int peak = (left + right) / 2;

            if(numbers[peak] < numbers[peak + 1]) {
                left = peak + 1;
            } else {
                right = peak;
            }
        }

        return numbers[left];
    }
}
