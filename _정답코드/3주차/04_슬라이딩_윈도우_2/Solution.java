import java.util.*;

public class Solution {
    public int[] solution(int[] numbers, int window) {
        int n = numbers.length;
        int window_sum = 0;

        for(int i=0; i<window; i++){
            window_sum += numbers[i];
        }

        List<Integer> answer = new ArrayList<>();
        answer.add(window_sum);

        for(int i=window; i<n; i++){
            window_sum += numbers[i] - numbers[i-window];
            answer.add(window_sum);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

