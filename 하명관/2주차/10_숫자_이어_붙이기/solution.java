import java.util.*;

public class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(String.valueOf(num));
        }
        String[] arr = list.toArray(new String[0]);
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        String result = String.join("", arr);

        if (result.charAt(0) == '0')
            return "0";

        return result;
    }
}