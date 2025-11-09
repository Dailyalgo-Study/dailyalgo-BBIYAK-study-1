public class Solution {
	public int[] solution(int[][] array) {

        int max = array[0][0] + array[0][1] + array[1][0] + array[1][1];
        int min = array[0][0] + array[0][1] + array[1][0] + array[1][1];

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array[i].length - 1; j++) {
                int sum = array[i][j] + array[i][j + 1] + array[i + 1][j] + array[i + 1][j + 1];


                if(sum > max) {
                    max = sum;
                }

                if(sum < min) {
                    min = sum;
                }
            }
        }
        int[] answer = {max, min};

        return answer;
	}
}