public class Solution {
    private int count1 = 0;
    private int count2 = 0;

    public int[] solution(int n) {
        fibo(n);

        return new int[] {count1, count2};
    }

    private void fibo(int n) {
        if (n == 1) {
            count1++;
            return;
        }
        
        if (n == 2) {
            count2++;
            return;
        }
        
        fibo(n - 1);
        fibo(n - 2);
    }
}