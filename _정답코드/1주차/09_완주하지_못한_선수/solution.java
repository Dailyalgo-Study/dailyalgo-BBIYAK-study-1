import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> freq = new HashMap<>();
        
        for (int i = 0; i < participant.length; i++) {
            String name = participant[i];
            freq.put(name, freq.getOrDefault(name, 0) + 1);
        }
        
        for (int i = 0; i < completion.length; i++) {
            String name = completion[i];
            freq.put(name, freq.get(name) - 1);
        }
        
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        
        return "";
    }
}

