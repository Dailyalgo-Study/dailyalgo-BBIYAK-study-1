public class Solution {
	public int solution(int[] sides) {
		int answer = 0;

        for(int i = 0; i < sides.length - 1; i++) {
            for(int j = i + 1; j < sides.length; j++) {
                for(int k = j + 1; k < sides.length; k++) {
                    
                    int first = sides[i];
                    int second = sides[j];
                    int third = sides[k];

                    int max = first;

                    if(max < second) {
                        max = second;
                    }

                    if(max < third) {
                        max = third;
                    }

                    int sum = first + second + third;

                    if(sum > max) {
                        answer = sum;
                    }
                }
            }
        }
        return answer;
	}
}