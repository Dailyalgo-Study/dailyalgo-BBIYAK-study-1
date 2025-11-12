import java.util.*;

public class Solution {
	public int[] solution(int[] numbers, int target) {
		int left = 0;
        int right = numbers.length - 1;
        int[] answer = {-1, -1};
        int min = Integer.MAX_VALUE;

        while(left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum < target) {
                left++;
            } else if(sum > target) {
                right--;
            } else {
                int diff = numbers[right] - numbers[left];

                if(diff < min) {
                    min = diff;
                    answer[0] = numbers[left];
                    answer[1] = numbers[right];
                }
                left++;
                right--;
            }
        }
        return answer;
	}
}
