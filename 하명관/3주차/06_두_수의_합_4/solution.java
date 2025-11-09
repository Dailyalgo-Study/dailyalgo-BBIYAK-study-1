import java.util.*;

public class Solution {
    public int[] solution(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int[] answer = { -1, -1 };

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                int diff = numbers[right] - numbers[left];
                if (diff < minDiff) {
                    minDiff = diff;
                    answer[0] = numbers[left];
                    answer[1] = numbers[right];
                }
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return answer;
    }
} 