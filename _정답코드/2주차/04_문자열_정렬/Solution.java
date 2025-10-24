import java.util.*;

public class Solution {
    public String[] solution(String[] words) {
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));

        Collections.sort(wordsList, Collections.reverseOrder());

        return wordsList.stream().toArray(String[]::new);
    }
}

