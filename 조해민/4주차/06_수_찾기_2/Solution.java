public class Solution {
    public boolean solution(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return true;
            }
        }
        
        return false;
    }
}
