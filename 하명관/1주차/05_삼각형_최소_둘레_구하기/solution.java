import java.util.*;

public class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        for (int i = 0; i + 2 < sides.length; i++) {
            if (sides[i] + sides[i + 1] > sides[i + 2]) {
                return sides[i] + sides[i + 1] + sides[i + 2];
            }
        }
        return -1; 
    }
}