import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> answer = new HashMap<>();  // 중복제거되는 HashMap

        for (String p: participant) {
            // 1. 참가자 이름을 key로 HashMap에 저장하고, 값을 +1 한다.
            // answer.put(p, 1);
            answer.put(p, answer.getOrDefault(p, 0) + 1);   // 동명이인일때 1로 덮어쓰는 게 아닌 +1이 되어야 하므로 없으면 0설정 후 찾아서+1 하게
        }
        // System.out.println(answer);

//         2. 완주자 이름을 key로 HashMap에서 찾으면, 값을 -1 한다.
        for (String c : completion) {
            if (answer.containsKey(c)) {
                answer.replace(c, answer.get(c)-1);
            }
        }

//         3. 값이 0이 아닌 key를 반환한다(답은 무조건 한 명이라고 문제에 나와있음)
        for (String key : answer.keySet()) {
            if (answer.get(key) != 0) {
                // System.out.println(key);
                return key;
            }
        }
        return "";
    }
}