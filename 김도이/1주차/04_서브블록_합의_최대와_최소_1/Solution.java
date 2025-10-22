import java.util.*;

public class Solution {
    public int[] solution(int[][] array) {
        int n = array.length;       // 행 개수
        int m = array[0].length;    // 열 개수

        // 최소.최대 합 초기화
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        // 모든 (i,j)에서 2x2 블록 검사
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<m-1; j++) {
                int sum = array[i][j]+array[i][j+1]+array[i+1][j]+array[i+1][j+1];

                // 최소.최대 갱신
                if (sum < minSum) minSum = sum;
                if (sum > maxSum) maxSum = sum;
            }
        }
        // [최대합, 최소합] 순서로 반환
        return new int[]{maxSum, minSum};
    }
}