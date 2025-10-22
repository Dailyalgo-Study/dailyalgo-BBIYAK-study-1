public class Solution {
	public boolean solution(int n) {

        char[] pal = String.valueOf(n).toCharArray();

        int start = 0;
        int end = pal.length -1;

        while(start < end) {
            if(pal[start] != pal[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
	}
}
