import java.util.*;

public class Solution {
    public int[] solution(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;
        List<Integer> merged = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged.add(arr1[i]);
                i++;
            } else {
                merged.add(arr2[j]);
                j++;
            }
        }
        while (i < n) merged.add(arr1[i++]);
        while (j < m) merged.add(arr2[j++]);

        return merged.stream().mapToInt(Integer::intValue).toArray();
    }
}