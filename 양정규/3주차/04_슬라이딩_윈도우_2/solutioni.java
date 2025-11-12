import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] numbers, int window) {
        int count = numbers.length;
        List<Integer> answer = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < window; i++) {
            sum += numbers[i];
        }
        answer.add(sum);

        for (int i = 0; i < count - window; i++) {
            sum = sum - numbers[i] + numbers[i + window];
            answer.add(sum);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
