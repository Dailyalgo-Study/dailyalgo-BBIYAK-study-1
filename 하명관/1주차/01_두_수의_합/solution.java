import java.util.*;

public class Solution {
	public int solution(int[] numbers, int m) {
        // 1. numbers를 오름차순으로 정렬하자.
        // 2. 왼쪽부터 서로 다른 두 수의 합을 구하여 answer에 업데이트 한다.
        // 3. 2번을 반복하며 이전 answer과 현재 answer 중 m의 크기를 넘지 않고 m에 더 가까운 수를 answer에 업데이트하자.
		int answer = Integer.MIN_VALUE;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum <= m && Math.abs(m - sum) < Math.abs(m - answer)) {
                    answer = sum;
                }
            }
        }
		return answer;
	}
}
