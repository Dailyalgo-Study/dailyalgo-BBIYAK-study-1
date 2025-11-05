public class Solution {
    public int solution(String text) {
        int maxLength = 0;

        for (int i = 0; i < text.length(); i++) {
            maxLength = Math.max(maxLength, isPalindrome(text, i, i));
            
            maxLength = Math.max(maxLength, isPalindrome(text, i, i + 1));
        }

        return maxLength;
    }

    private int isPalindrome(String text, int left, int right) {
        while (left >= 0 && right < text.length() && text.charAt(left) == text.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}