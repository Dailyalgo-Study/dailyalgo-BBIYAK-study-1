// 문제 풀이
// 1. 시작 시간, 끝 시간이 주어질 때 수행할 수 있는 최대 작업 개수를 반환
// 2. 만약 진행중인 작업이 있는 경우 다른 작업 시작 불가.

import java.util.*;

public class Solution {
	public int solution(int[][] tasks) {

        Arrays.sort(tasks, (a, b) -> {
            return a[1] - b[1];
        });

        int lastEnd = -1;
		int answer = 0;

        for (int[] t : tasks) {
            int start = t[0];
            int end = t[1];
            
            if (start >= lastEnd) {
                lastEnd = end;
                answer++;
            }
        }
		return answer;
	}
}
