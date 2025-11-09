import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int n = numbers.length;
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(numbers[0], 1);

        for (int i = 1; i < n; i++) {
            numbers[i] += numbers[i - 1];
            sumCount.put(numbers[i], sumCount.getOrDefault(numbers[i], 0) + 1);
        }

        int count = 0;
        for (Integer key : sumCount.keySet()) {
            Integer value = sumCount.get(key);
            if( key == 0 ) {
                count += value * (value + 1) / 2;
            } else {
                count += value * (value - 1) / 2;
            }
        }
        
        return count;
    }
}

