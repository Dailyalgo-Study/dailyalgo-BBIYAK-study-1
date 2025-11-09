import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String[] solution(String[] words) {
        String[] answer = Arrays.stream(words).toArray(String[]::new);
        Arrays.sort(words, Collections.reverseOrder());
        return  words;
    }
}