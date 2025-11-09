import java.util.*;

public class Solution {
    private static List<int[]> answer = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        return answer.toArray(new int[answer.size()][3]);
    }

    private void hanoi(int n, int start, int end, int mid){
        int[] move = {n, start, end};
        if(n == 1){
            answer.add(move);
        } else {
            hanoi(n-1, start, mid, end);
            answer.add(move);
            hanoi(n-1, mid, end, start);
        }
    }
}

