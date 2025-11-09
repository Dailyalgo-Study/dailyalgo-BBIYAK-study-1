public class Solution {
    private static int count1 = 0;
    private static int count2 = 0;
    public int[] solution(int n) {
        fibo(n);
        int[] answer = {count1, count2};
        return answer;
    }

    private void fibo(int n){
        if(n == 1){
            count1 ++;
        } else if (n == 2){
            count2 ++;
        } else {
            fibo(n-1);
            fibo(n-2);
        }
    }
}

