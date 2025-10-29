import java.util.*;

public class Solution {
	public String solution(int[] numbers) {
        String[] strs = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        String answer = "";

        for(String num : strs) {
            answer += num;
        }

        if(answer.charAt(0) == '0') {
            return"0";
        }

        return answer;
	}
}
