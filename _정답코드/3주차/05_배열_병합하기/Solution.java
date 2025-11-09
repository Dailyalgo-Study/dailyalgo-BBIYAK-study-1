import java.util.*;

public class Solution {
    public int[] solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int idx1 = 0, idx2 = 0;

        List<Integer> answer = new ArrayList<>();
        
        while(idx1 < len1 && idx2 < len2){
            if(arr1[idx1] < arr2[idx2]){
                answer.add(arr1[idx1]);
                idx1 ++;
            } else {
                answer.add(arr2[idx2]);
                idx2 ++;
            }
        }

        while(idx1 < len1){
            answer.add(arr1[idx1]);
            idx1 ++;
        }

        while(idx2 < len2){
            answer.add(arr2[idx2]);
            idx2 ++;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

