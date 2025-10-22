import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> participants = new ArrayList<>();
        for (String name : participant) {
            participants.add(name);
        }
        for (String name : completion) {
            participants.remove(name);
        }
        return participants.get(0);
    }
}