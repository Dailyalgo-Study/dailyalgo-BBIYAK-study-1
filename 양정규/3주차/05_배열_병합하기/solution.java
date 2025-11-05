import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int arr1Index = 0;
        int arr2Index = 0;

        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] <= arr2[arr2Index]) {
                answer.add(arr1[arr1Index]);
                arr1Index++;
            } else {
                answer.add(arr2[arr2Index]);
                arr2Index++;
            }
        }
        while (arr1Index < arr1.length) {
            answer.add(arr1[arr1Index]);
            arr1Index++;
        }
        while (arr2Index < arr2.length) {
            answer.add(arr2[arr2Index]);
            arr2Index++;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}