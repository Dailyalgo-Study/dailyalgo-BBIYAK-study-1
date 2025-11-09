public class Solution {
    private static String text_glob;
    private static int len;

    public int solution(String text) {
        text_glob = text;
        len = text.length();
        int answer = 0;

        for(int i=0; i<len; i++){
            int temp = getMaxPalinSize(i, i);
            if(temp > answer) {
                answer = temp;
            }
        }

        for(int i=0; i<len-1; i++){
            if(text.charAt(i) == text.charAt(i+1)){
                int temp = getMaxPalinSize(i, i+1);
                if(temp > answer){
                    answer = temp;
                }
            }
        }
        return answer;
    }

    private int getMaxPalinSize(int left, int right){
        while(left-1 >= 0 && right+1 < text_glob.length()
        && text_glob.charAt(left-1) == text_glob.charAt(right+1)){
            left --;
            right ++;
        }
        return right - left + 1;
    }
}

