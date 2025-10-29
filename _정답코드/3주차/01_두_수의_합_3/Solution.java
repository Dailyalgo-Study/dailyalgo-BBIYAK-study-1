import java.util.*;

public class Solution {
    public int solution(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0, right = n-1;
        int cur_sum;
        int answer = 0;

        while(left < right){
            cur_sum = numbers[left] + numbers[right];

            int cnt_left = 1, cnt_right = 1;
            while(
                left + cnt_left < n
                && numbers[left] == numbers[left+cnt_left]
            ){
                cnt_left ++;
            }

            while(
                right - cnt_right >= 0
                && numbers[right] == numbers[right-cnt_right]
            ){
                cnt_right ++;
            }

            if(cur_sum == target){
                if(numbers[left] == numbers[right]){
                    answer += cnt_left * (cnt_left - 1) / 2;
                } else {
                    answer += cnt_left * cnt_right;
                }
                left += cnt_left;
                right -= cnt_right;
            } else if(cur_sum < target){
                left += cnt_left;
            } else {
                right -= cnt_right;
            }
        }

        return answer;
    }
}

