import java.util.*;

public class Solution {
	public int solution(int[] ropes) {
        int maxWeight = 0;

        Arrays.sort(ropes);

        for(int i = 0; i < ropes.length; i++) {
            int weight = ropes[i] * (i + 1);

            if(weight > maxWeight) {
                maxWeight = weight;
            }
        }
        return maxWeight;
	}
}
