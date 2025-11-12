public class Solution {
    public boolean solution(int[] numbers, int target) {
        int count = numbers.length;
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return true;
            }
            if (numbers[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
