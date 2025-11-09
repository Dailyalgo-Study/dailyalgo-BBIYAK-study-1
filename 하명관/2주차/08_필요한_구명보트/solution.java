import java.util.*;

public class Solution {
    public int solution(int limit, int[] people) {
        Arrays.sort(people); // 몸무게 오름차순 정렬
        int left = 0;
        int right = people.length - 1;
        int answer = 0;

        while (left <= right) {
            // 두 사람의 합이 limit 이하면 둘 다 태움
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                // 아니면 무거운 사람만 태움
                right--;
            }
            answer++;
        }

        return answer;
    }
}