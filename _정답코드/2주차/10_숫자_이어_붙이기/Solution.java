import java.util.*;
import java.util.stream.*;

public class Solution {
    public String solution(int[] numbers) {
        List<String> stringNumbers = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .collect(Collectors.toList());
        
        Collections.sort(stringNumbers, (a, b) -> (b + a).compareTo(a + b));

        String answer = "";
        for(String num : stringNumbers){
            answer += num;
        }

        if(answer.charAt(0) == '0'){
            answer = "0";
        }
        return answer;
    }
}

