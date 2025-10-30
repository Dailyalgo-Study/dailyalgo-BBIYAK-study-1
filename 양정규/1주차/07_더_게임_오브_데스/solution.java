import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] target, int k) {
        int number = target.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= number; i++) {
            map.put(i, target[i - 1]);
        }
        int answer = map.get(1);
        for (int i = 1; i < k; i++) {
            answer = map.get(answer);
        }
        return answer;
    }
}
