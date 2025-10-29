import java.util.*;

public class Solution {
	public int solution(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> a[1] - b[1]);

        int count = 0;
        int endTime = 0;

        for (int i = 0; i < tasks.length; i++) {
            if (endTime <= tasks[i][0]) { 
                endTime = tasks[i][1];    
                count++;                       
            }
        }

        return count;
	}
}
