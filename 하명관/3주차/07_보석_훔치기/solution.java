import java.util.*;

public class Solution {
    public int solution(String[] jewels) {
        Map<String, Integer> map = new HashMap<>();

        int left = 0, minLength = Integer.MAX_VALUE;
        int count = 0; 

        for (int right = 0; right < jewels.length; right++) {
            String jewel = jewels[right];
            map.put(jewel, map.getOrDefault(jewel, 0) + 1);


            if (map.get(jewel) == 1) count++;

            while (count == 5) {
                minLength = Math.min(minLength, right - left + 1);

                String leftJewel = jewels[left];
                map.put(leftJewel, map.get(leftJewel) - 1);
                if (map.get(leftJewel) == 0) count--; 
                left++;
            }
        }

        return minLength;
    }

}