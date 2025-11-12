public class Solution {
    public long solution(int n) {
        return factorial(n);
    }

    public long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
