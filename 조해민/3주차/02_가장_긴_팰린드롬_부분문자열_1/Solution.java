import java.util.*;

public class Solution {
	public int solution(String text) {
        int maxLength = 0;

        for (int i = 0; i < text.length(); i++) {   
            for(int j = i; j < text.length(); j++) {
                if (isPalindrome(text, i, j)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }   
        }
        return maxLength;
    }

    private boolean isPalindrome(String text, int left, int right) {
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
