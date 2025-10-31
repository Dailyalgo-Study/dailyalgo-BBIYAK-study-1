import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
        String[] StringNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(StringNumbers, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String s : StringNumbers) {
           sb.append(s);
        }

        String answer = sb.toString();
        if (answer.startsWith("0")) {
            return "0";
        }

        return answer;
    }
}
