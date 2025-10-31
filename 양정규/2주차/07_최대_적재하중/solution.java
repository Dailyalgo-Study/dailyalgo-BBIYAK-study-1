import java.util.Arrays;

public class Solution {
    public int solution(int[] ropes) {
        int count = ropes.length;
        int answer = 0;
        int temp = 0;
        Arrays.sort(ropes);
        for (int i = 0; i < count; i++) {
            temp = ropes[i] * (ropes.length - i);
            if (answer < temp) {
                answer = temp;
            }
        }
        return answer;
    }
}