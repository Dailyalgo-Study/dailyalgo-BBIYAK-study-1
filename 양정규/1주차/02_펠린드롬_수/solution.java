import java.util.Arrays;

public class Solution {
    public boolean solution(int n) {
        String numberToString = Integer.toString(n);
        String[] numberList = numberToString.split("");
        String[] reversedNumberList = new String[numberList.length];
        for (int i = 0; i < numberList.length; i++) {
            reversedNumberList[numberList.length - i - 1] = numberList[i];
        }
        return Arrays.equals(numberList, reversedNumberList);
    }
}