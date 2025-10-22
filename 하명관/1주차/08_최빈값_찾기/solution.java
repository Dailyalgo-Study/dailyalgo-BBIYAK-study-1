import java.util.*;

public class Solution {
	public int solution(int[] numbers) {
		int answer = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;

        for (int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int num = m.getKey();
            int count = m.getValue();

            if (count > maxCount || (count == maxCount && num < answer)) {
                maxCount = count;
                answer = num;
            };
        }
		return answer;
	}
}
