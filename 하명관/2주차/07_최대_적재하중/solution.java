// 문제 풀이
// 1. 묶음의 인장 하중 = 묶음에 사용된 루프의 개수 * 묶음 중에서 가장 작은 인장 하중
// 2. 로프의 각 인장 하중을 담은 배열 ropes가 주어질 때 최대 인장 하중을 반환

import java.util.*;

public class Solution {
    public int solution(int[] ropes) {
        Arrays.sort(ropes);
        int answer = 0;

        for (int i = 0; i < ropes.length; i++) {
            int weight = ropes[i] * (ropes.length - i);
            if (answer < weight) {
                answer = weight;
            }
        }

        return answer;
    }
}