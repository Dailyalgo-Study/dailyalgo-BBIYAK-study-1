public class Solution {
    public int[] solution(int[] numbers, int target) {
        int[] answer = {-1, -1};
        int count = numbers.length;
        int diff;
        int left = 0;
        int right = count - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] < target && right - left > 1) {
                left++;
            }
            if (numbers[left] + numbers[right] > target && right - left > 1) {
                right--;
            }
            if (numbers[left] + numbers[right] == target && left != right) {
                diff = numbers[right] - numbers[left];
                if (answer[0] == -1 && answer[1] == -1) {
                    answer[0] = numbers[left];
                    answer[1] = numbers[right];
                } else if (answer[1] - answer[0] > diff) {
                    answer[0] = numbers[left];
                    answer[1] = numbers[right];
                }
                left++;
            }
            if (numbers[left] + numbers[right] != target && right - left == 1) {
                break;
            }
        }
        return answer;
    }
}