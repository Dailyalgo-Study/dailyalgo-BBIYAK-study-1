import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] numbers) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = 0;
        int result = 0;
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }
        
        return result;
    }
}