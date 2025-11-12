public class Solution {
    public int solution(int[] numbers, int target) {
        int count = numbers.length;
        int left = 0;
        int right = count - 1;
        int answer = 0;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {

                if (numbers[left] == numbers[right]) {
                    int sameNumberCount = right - left + 1;
                    answer += (sameNumberCount * (sameNumberCount - 1)) / 2;
                    break;
                }

                int leftCount = 1;
                while (left + 1 < right && numbers[left] == numbers[left + 1]) {
                    leftCount++;
                    left++;
                }

                int rightCount = 1;
                while (right - 1 > left && numbers[right] == numbers[right - 1]) {
                    rightCount++;
                    right--;
                }

                answer += leftCount * rightCount;

                left++;
                right--;
            }
        }
        return answer;
    }
}