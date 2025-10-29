import java.util.Arrays;
import java.util.Collections;


// TIME_OUT
public class Solution {
    public int solution(int limit, int[] people) {
        int count = people.length;
        Integer[] sortedPeople = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedPeople, Collections.reverseOrder());

        boolean[] used = new boolean[count];
        int boatCount = 0;

        for (int i = 0; i < count - 1; i++) {
            if (used[i]) continue;
            for (int j = i + 1; j < count; j++) {
                if (used[j]) continue;

                if (sortedPeople[i] + sortedPeople[j] <= limit) {
                    used[i] = true;
                    used[j] = true;
                    boatCount++;
                    break;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            if (!used[i]) boatCount++;
        }
        return boatCount;
    }
}