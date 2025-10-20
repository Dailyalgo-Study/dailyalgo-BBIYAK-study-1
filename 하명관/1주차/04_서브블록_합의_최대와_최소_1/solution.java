public class Solution {
	public int[] solution(int[][] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = array.length;
        int m = array[0].length;
        int sum = 0;
		int[][] S = new int [n + 1][m + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                S[i][j] = array[i - 1][j - 1] + S[i][j - 1] + S[i - 1][j] - S[i - 1][j - 1];
            }
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < m + 1; j++) {
                sum = S[i][j]  - S[i][j - 2] - S[i - 2][j] + S[i - 2][j - 2];

                if (sum < min) min = sum;
                if (sum > max) max = sum;
            }
        }


        int[] answer = {max, min};

        // for (int[] a : S) {
        //     for (int b : a) {
        //         System.out.print(b);
        //         System.out.print(", ");
        //     }
        //     System.out.println();
        // }

		return answer;
	}
}
