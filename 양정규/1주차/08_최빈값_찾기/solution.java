import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : numbers) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                int count = map.get(number);
                map.remove(number);
                map.put(number, count + 1);
            }
        }
        int answer = 0;
        int count = 0;

        for (int key : map.keySet()) {
            if (answer == 0 && count == 0) {
                count = map.get(key);
                answer = key;
            }
            if (count < map.get(key)) {
                count = map.get(key);
                answer = key;
            }
            if (count == map.get(key) && answer > key) {
                answer = key;
            }
        }
        return answer;
    }
}