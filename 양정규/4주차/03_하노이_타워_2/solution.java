import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] solution(int n) {
        List<int[]> answer = new ArrayList<>();

        hanoi(answer, n, 1, 2, 3);

        return answer.toArray(new int[0][]);
    }

    private void hanoi(List<int[]> answer, int n, int start, int sub, int end) {
        if (n == 1) {
            answer.add(new int[]{n, start, end});
            return;
        }
        hanoi(answer, n - 1, start, end, sub);

        answer.add(new int[]{n, start, end});

        hanoi(answer, n - 1, sub, start, end);
    }
}