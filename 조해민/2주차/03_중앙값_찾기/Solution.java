import java.util.*;

public class Solution {
	public int solution(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length / 2];
	}
}