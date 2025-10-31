import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers) {
        int range = 2001;
        int[] count = new int[range];
        int[] answer = new int[numbers.length];
        int answerCount = 0;
        for (int number : numbers) {
            count[number+1000]++;
        }
        for (int i = 0; i < range; i++) {
            while(count[i]>0){
                answer[answerCount] = i-1000;
                answerCount++;
                count[i]--;
            }
        }
        return answer;
    }
}