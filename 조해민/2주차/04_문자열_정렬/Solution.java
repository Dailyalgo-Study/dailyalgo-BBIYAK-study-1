import java.util.*;

public class Solution {
	public String[] solution(String[] words) {
		
		String[] answer = words.clone();
		
		Arrays.sort(answer, Collections.reverseOrder());
		
		return answer;
	}
}
