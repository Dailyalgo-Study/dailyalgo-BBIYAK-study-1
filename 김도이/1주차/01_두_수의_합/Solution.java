public class Solution {
    public int solution(int[] numbers, int m) {
        int maxSum = 0;

        // 1. numbers의 [i], [j(i+1)] 이중반복문을 돌며,
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                // 2-1. 두 수가 같으면, 제외(반복문 탈출)
                if (numbers[i] == numbers[j]) continue;

                // 2-2. 두 수가 다르면, 계산!
                // if (numbers[i] + numbers[j](total) 가 m을 넘지 않는다 && total이 maxSum보다 크면)
                // 3. maxSum = total; 갱신한다
                int total = numbers[i]+numbers[j];
                if (total<=m && total>=maxSum) {
                    maxSum = total;
                }
            }
        }
        return maxSum;
    }
}