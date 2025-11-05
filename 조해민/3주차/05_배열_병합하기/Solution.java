import java.util.*;

public class Solution {
	public int[] solution(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[index++] = arr2[i];
        }

        Arrays.sort(result);

        return result;
    }
}
