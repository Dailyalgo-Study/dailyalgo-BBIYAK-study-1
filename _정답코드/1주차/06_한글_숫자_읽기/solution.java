import java.util.Map;
import java.util.LinkedHashMap;

class Solution {
    public String solution(String hangul_numbers) {
        Map<String, String> map = new LinkedHashMap<>();
        String[] hangul = {"공", "하나", "둘", "셋", "넷", "다섯", "여섯", "일곱", "여덟", "아홉",
                           "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String[] digit = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                          "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < hangul.length; i++) map.put(hangul[i], digit[i]);

        String result = hangul_numbers;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result = result.replace(entry.getKey(), entry.getValue());
        }
        return result;
    }
}