// 문재 풀이
// 1 ~ n 까지의 번호가 부여된 n명의 학생들의 점수가 담긴 배열 scores가 주어진다.
// 상 중 하 등급을 점수가 높은 순으로 부여한다.
// 만약 점수가 같다면 학생 번호가 작은 순서대로 상위 등급 부여

import java.util.*;

public class Solution {
	public String[] solution(int[] scores) {
        int[][] array = new int[scores.length][2];

        for (int i = 0; i < scores.length; i++) {
            array[i][0] = i;
            array[i][1] = scores[i];
        }

        Arrays.sort(array, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0]; 
            return b[1] - a[1];                   
        });

        int k = scores.length / 3;
        String[] grades = new String[scores.length];
        for (int i = 0; i < scores.length; i++) {
            if (i < k) grades[array[i][0]] = "A";
            else if (i < 2 * k) grades[array[i][0]] = "B";
            else grades[array[i][0]] = "C";
        }        
        
		return grades;
	}
}
