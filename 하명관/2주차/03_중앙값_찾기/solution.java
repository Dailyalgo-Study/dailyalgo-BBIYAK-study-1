// 문제 분석
// 1. 오름차순 정렬 후 중간에 있는 요소를 출력 하면 된다.

import java.util.*;

public class Solution {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
        int answer = numbers[numbers.length / 2];
		return answer;
	}
}
