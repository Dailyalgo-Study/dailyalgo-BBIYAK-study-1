import java.util.*;

public class Solution {
	public int solution(int limit, int[] people) {
        Arrays.sort(people);

        int first = 0;
        int last = people.length - 1;
        int answer = 0;

        while(first <= last) {
            if(people[first] + people[last] <= limit) {
                first++;
            }
            last--;
            answer++;
        }
        return answer;
	}
}