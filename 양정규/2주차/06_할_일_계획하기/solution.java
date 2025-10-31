//import java.util.Arrays;
//
//public class Solution {
//    public int solution(int[][] tasks) {
//        int count = tasks.length;
//        int endTime = 0;
//        int taskCount = 0;
//        int firstTaskNumber = 0;
//        int[] countList = new int[count];
//        Arrays.sort(tasks, (a, b) -> a[0] - b[0]);
//        for (int i = 0; i < count; i++) {
//            for (int j = firstTaskNumber; j < count; j++) {
//                if (endTime <= tasks[j][0]) {
//                    endTime = tasks[j][1];
//                    taskCount++;
//                }
//            }
//            countList[i] = taskCount;
//            taskCount = 0;
//            endTime = 0;
//            firstTaskNumber++;
//        }
//        Arrays.sort(countList);
//        return countList[countList.length - 1];
//    }
//}