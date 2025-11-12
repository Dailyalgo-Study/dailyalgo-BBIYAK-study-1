public class Solution {
    public int solution(int[] numbers, int target) {
        int count = numbers.length;
        int left = 0;
        int right = count - 1;
        int answer;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return numbers[mid];
            }
            if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (target < numbers[0]) {
            return numbers[0];
        }

        if (target > numbers[count - 1]) {
            return numbers[count - 1];
        }

        int diffLeft = numbers[left] - target;
        int diffRight = target - numbers[right];

        if (diffLeft == diffRight) {
            answer = numbers[left];
        } else if (diffLeft > diffRight) {
            answer = numbers[right];
        } else {
            answer = numbers[left];
        }
        return answer;
    }
}
