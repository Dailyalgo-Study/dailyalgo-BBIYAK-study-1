public class Solution {
    public int solution(int[] numbers) {
        int count = numbers.length;
        int left = 0;
        int right = count - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] <= numbers[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return numbers[left];
    }
}
