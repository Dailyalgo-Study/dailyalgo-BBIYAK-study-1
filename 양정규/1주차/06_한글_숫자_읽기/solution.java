import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String hangul_numbers) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        map.put("일곱", 7);
        map.put("칠", 7);
        map.put("공", 0);
        map.put("영", 0);
        map.put("일", 1);
        map.put("하나", 1);
        map.put("둘", 2);
        map.put("이", 2);
        map.put("셋", 3);
        map.put("삼", 3);
        map.put("넷", 4);
        map.put("사", 4);
        map.put("다섯", 5);
        map.put("오", 5);
        map.put("여섯", 6);
        map.put("육", 6);
        map.put("여덟", 8);
        map.put("팔", 8);
        map.put("아홉", 9);
        map.put("구", 9);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            hangul_numbers = hangul_numbers.replace(entry.getKey(), entry.getValue().toString());
        }
        answer = hangul_numbers;
        return answer;
    }
}