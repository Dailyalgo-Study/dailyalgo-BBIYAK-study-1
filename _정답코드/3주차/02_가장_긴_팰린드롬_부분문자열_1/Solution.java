public class Solution {
    private static String text_glob;

    public int solution(String text) {
        text_glob = text;
        int n = text.length();
        int answer = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPalin(i, j) && answer < (j-i+1)){
                    answer = j-i+1;
                }
            }
        }
        return answer;
    }

    private boolean isPalin(int left, int right){
        int n = right - left + 1;
        for(int i=0; i<n; i++){
            if(text_glob.charAt(left+i) != text_glob.charAt(right-i)){
                return false;
            }
        }
        return true;
    }
}

