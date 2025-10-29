import java.util.*;

public class Solution {
	public int[] solution(int[] numbers) {
        List<Integer> numbersList = new ArrayList<>();

        for(int num : numbers){
            numbersList.add(num);
        }

        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            int minValue = 99999;
            int minIdx = -1;

            for(int idx = 0; idx < numbersList.size(); idx++) {
                if(numbersList.get(idx) < minValue) {
                    minValue = numbersList.get(idx);
                    minIdx = idx;
                }
            }

            answer.add(minValue);

            numbersList.remove(minIdx);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}
