import java.util.*;

public class Solution {
	public int solution(String[] jewels) {
        Map<String, Integer> jewelCount = new HashMap<>();
        for (String jewel : jewels) {
            jewelCount.put(jewel, jewelCount.getOrDefault(jewel, 0) + 1);
        }
        int totalTypes = jewelCount.size();

        Map<String, Integer> jew = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int end = 0; end < jewels.length; end++) {
            jew.put(jewels[end], jew.getOrDefault(jewels[end], 0) + 1);

            while (jew.size() == totalTypes) {
                minLength = Math.min(minLength, end - start + 1);

                String startJewel = jewels[start];
                jew.put(startJewel, jew.get(startJewel) - 1);
                if (jew.get(startJewel) == 0) {
                    jew.remove(startJewel);
                }
                start++;
            }
        }

        return minLength;
    }
}
