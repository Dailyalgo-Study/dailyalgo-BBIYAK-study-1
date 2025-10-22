public class Solution {
	public int[] solution(int[] numbers) {
        int[] count = new int[2001];
		int[] answer = new int[numbers.length];

        for(int num : numbers){
            count[num+1000] += 1;
        }

        for(int idx=1; idx < 2001; idx++){
            count[idx] += count[idx-1];
        }

        for(int num : numbers){
            answer[count[num+1000]-1] = num;
            count[num+1000] -= 1;
        }

		return answer;
	}
}

