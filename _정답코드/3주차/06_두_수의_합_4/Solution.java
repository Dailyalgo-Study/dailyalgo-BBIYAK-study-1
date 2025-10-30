public class Solution {
    public int[] solution(int[] numbers, int target) {
        int[] answer = {-1, -1};

        int n = numbers.length;
        int left = 0, right = n-1;

        while(left < right){
            int total = numbers[left] + numbers[right];
            if(total == target){
                answer = new int[] {numbers[left], numbers[right]};
                left ++;
            } else if(total < target){
                left ++;
            } else {
                right --;
            }
        }
        return answer;
    }
}