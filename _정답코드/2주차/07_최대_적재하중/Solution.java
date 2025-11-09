import java.util.*;

public class Solution {
	public int solution(int[] ropes) {

        Integer[] boxedRopes = Arrays.stream(ropes)
            .boxed()
            .toArray(Integer[]::new);
        Arrays.sort(boxedRopes, Collections.reverseOrder());

        int answer = -1;
        for(int i = 0; i<boxedRopes.length; i++){
            answer = Math.max(answer, (i + 1) * boxedRopes[i]);
        }

        return answer;
	}
}

