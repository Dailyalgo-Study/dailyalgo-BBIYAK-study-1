import java.util.*;

public class Solution {
    public int solution(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : numbers) {
            int need = target - num;
            if (map.containsKey(need)) {
                count += map.get(need);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}