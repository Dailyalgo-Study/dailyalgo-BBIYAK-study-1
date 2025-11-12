public class Solution {
    public int solution(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return target;
            }
        }
        
        int close = numbers[0];
        int min = Math.abs(numbers[0] - target);
        
        for (int i = 1; i < numbers.length; i++) {
            int diff = Math.abs(numbers[i] - target);
            
            if (diff < min || (diff == min && numbers[i] > close)) {
                min = diff;
                close = numbers[i];
            }
        }
        
        return close;
    }
}
