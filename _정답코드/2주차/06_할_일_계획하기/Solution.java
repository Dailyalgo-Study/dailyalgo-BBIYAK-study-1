import java.util.*;

public class Solution {
	public int solution(int[][] tasks) {
        List<int[]> tasksList = new ArrayList<>();
        for(int[] task : tasks){
            tasksList.add(task);
        }

        Collections.sort(tasksList, (a, b) -> (a[1] - b[1]));

        int count = 0;
        int current_time = 0;

        for(int[] task : tasksList){
            if(current_time <= task[0]){
                current_time = task[1];
                count += 1;
            }
        }

        return count;
	}
}

