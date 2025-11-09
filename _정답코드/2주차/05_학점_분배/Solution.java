import java.util.*;

public class Solution {
	public String[] solution(int[] scores) {
        int n = scores.length;
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<n; i++){
            numbers.add(i);
        }

        Collections.sort(numbers, (a, b) -> {
            if (scores[a] != scores[b]){
                return scores[b] - scores[a];
            }
            return a - b;
        });

        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            int number = numbers.get(i);
            if(i < n/3){
                answer[number] = "A";
            } else if (i < 2*n/3){
                answer[number] = "B";
            } else {
                answer[number] = "C";
            }
        }
		return answer;
	}
}

