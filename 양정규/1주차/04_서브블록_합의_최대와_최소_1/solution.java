import java.util.Arrays;

public class Solution {
    public int[] solution(int[][] array) {
        int columnCount = array[0].length;
        int rowCount = array.length;
        int[] squareValueSum = new int[(columnCount - 1) * (rowCount - 1)];
        int calcCount = 0;
        for (int i = 0; i < rowCount - 1; i++) {
            for (int j = 0; j < columnCount - 1; j++) {
                squareValueSum[calcCount] += array[i][j] + array[i + 1][j] + array[i][j + 1] + array[i + 1][j + 1];
                calcCount++;
            }
        }
        Arrays.sort(squareValueSum);
        int[] answer = new int[2];
        answer[0] = squareValueSum[squareValueSum.length - 1];
        answer[1] = squareValueSum[0];
        return answer;
    }
}