import java.util.*;

public class Solution {
	public int[] solution(int[] numbers) {
		int[] count = new int[2001];
        int[] answer = new int[numbers.length];

        for (int n : numbers) {
            count[n + 1000] += 1;
        }

        for (int i = 1; i < 2001; i++) {
            count[i] += count[i - 1];
        }

        for (int num : numbers) {
            answer[count[num + 1000] - 1] = num;
            count[num + 1000] -= 1;
        }

        return answer;
	}
}
