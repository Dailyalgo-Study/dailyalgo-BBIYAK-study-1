import java.util.Arrays;

public class Solution {
    public int solution(int[] A, int[] B) {
        int count = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int max = 0;
        for (int i = 0; i < count; i++) {
            max += A[i] * B[i];
        }
        return max;
    }
}