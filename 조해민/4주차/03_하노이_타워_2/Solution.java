import java.util.*;

public class Solution {
    List<int[]> answer = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 2, 3);

        return answer.stream().toArray(int[][]::new);
    }

    private void hanoi(int n, int first, int second, int third) {
        int[] move = {n, first, third};

        if (n == 1) {
            answer.add(move);
            return;
        }

        hanoi(n - 1, first, third, second);
        answer.add(move);
        hanoi(n - 1, second, first, third);
    }
}
