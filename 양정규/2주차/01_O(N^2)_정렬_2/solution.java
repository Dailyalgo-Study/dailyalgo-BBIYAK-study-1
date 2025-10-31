import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static Integer[] solution(int[] numbers) {
        Integer[] answer = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(answer, Collections.reverseOrder());
        return answer;
    }
}