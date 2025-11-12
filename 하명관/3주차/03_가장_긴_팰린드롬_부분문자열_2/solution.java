    public class Solution {
        public int solution(String text) {
            int n = text.length();
            int maxLen = 0;

            for (int center = 0; center < n; center++) {
                int len1 = expand(text, center, center);
                int len2 = expand(text, center, center + 1);

                maxLen = Math.max(maxLen, Math.max(len1, len2));
            }

            return maxLen;
        }

        private int expand(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            return right - left - 1;
        }
    }