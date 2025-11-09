public class Solution {
	public int solution(int[] numbers) {
		int answer = numbers[0]; 
        int mode = 0; 


        for(int i = 0; i < numbers.length; i++) {
            int count = 0;

            for(int j = 0; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    count++;
                }
                
                if(count > mode) {
                    mode = count;
                    answer = numbers[i];
                } else if(count == mode && numbers[i] < answer) {
                    answer = numbers[i];
                }
            }

        }
        return answer;
	}
}
