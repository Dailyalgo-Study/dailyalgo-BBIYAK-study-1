public class Solution {
    public int[] solution(int n) {
        int[] answer = new int[2];
        fibo(n, answer);
        return answer;
    }

    public int fibo(int n, int[] count) {
        if (n == 2) {
            count[1]++;
            return 1;
        } else if (n == 1) {
            count[0]++;
            return 1;
        } else if (n == 0) {
            return 1;
        } else {
            return fibo(n - 1, count) + fibo(n - 2, count);
        }
    }
}
