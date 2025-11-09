import java.util.*;

public class Solution {
    public int[] solution(int[] numbers, int window) {
        int n = numbers.length;
        int sum = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < window; i++) {
            sum += numbers[i];
        }

        result.add(sum);
        
        for (int i = window; i < n; i++) {
            sum += numbers[i] - numbers[i - window];
            result.add(sum);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}