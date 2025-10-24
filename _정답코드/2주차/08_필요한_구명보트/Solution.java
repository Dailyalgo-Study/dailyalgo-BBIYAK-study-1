import java.util.*;
import java.util.stream.*;

public class Solution {
    public int solution(int limit, int[] people) {
        List<Integer> peopleList = Arrays.stream(people)
            .boxed()
            .collect(Collectors.toList());
        Collections.sort(peopleList);

        int answer = 0;
        int passed = 0;

        while(passed < peopleList.size()){
            if(peopleList.get(passed) + peopleList.get(peopleList.size() - 1) <= limit) {
                passed += 1;
            }
            answer += 1;
            peopleList.remove(peopleList.size() - 1);
        }

        return answer;
    }
}

