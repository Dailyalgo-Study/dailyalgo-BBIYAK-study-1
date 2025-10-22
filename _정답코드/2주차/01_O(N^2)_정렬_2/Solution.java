import java.util.*;

public class Solution {
	public int[] solution(int[] numbers) {
        int n = numbers.length;
        ArrayList<Integer> numList = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();

        for (int num : numbers){
            numList.add(num);
        }

        for (int iter = 0; iter < n; iter++){
            int maxValue = -99999;
            int maxIdx = -1;

            for (int idx = 0; idx < numList.size(); idx++){
                if (numList.get(idx) > maxValue) {
                    maxValue = numList.get(idx);
                    maxIdx = idx;
                }
            }

            answer.add(maxValue);
            numList.remove(maxIdx);
        }

		return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
	}
}

