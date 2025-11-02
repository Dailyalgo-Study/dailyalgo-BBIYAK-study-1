public class Solution {
	public int solution(int n, int m) {
		int start = (int) Math.ceil(Math.sqrt(n));
        int end = (int) Math.floor(Math.sqrt(m));
        return end - start + 1;
	}
}
