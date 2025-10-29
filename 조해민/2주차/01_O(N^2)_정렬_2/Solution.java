import java.util.*;

public class Solution {
	public int[] solution(int[] numbers) {
        List<Integer> numbersList = new ArrayList<>();

        for(int num : numbers){
            numbersList.add(num);
        }

        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            int maxValue = -99999;
            int maxIdx = -1;

            for(int idx = 0; idx < numbersList.size(); idx++) {
                if(numbersList.get(idx) > maxValue) {
                    maxValue = numbersList.get(idx);
                    maxIdx = idx;
                }
            }

            answer.add(maxValue);

            numbersList.remove(maxIdx);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}