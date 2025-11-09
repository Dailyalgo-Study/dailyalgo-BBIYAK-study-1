public class Solution {
    private static int[] numbers_glob;

    public int solution(int[] numbers, int target) {
        numbers_glob = numbers;
        int n = numbers.length;
        if(numbers[0] > target){
            return numbers[0];
        }
        
        int idx = binary_search(0, n-1, target);
        if(idx == n-1){
            return numbers[n-1];
        }

        int left_value = numbers[idx];
        int right_value = numbers[idx+1];

        if(right_value - target <= target - left_value){
            return right_value;
        } else {
            return left_value;
        }
    }

    private int binary_search(int left, int right, int target){
        if(left == right){
            return left;
        }

        int mid = (left + right + 1) / 2;
        if(numbers_glob[mid] <= target){
            return binary_search(mid, right, target);
        } else {
            return binary_search(left, mid-1, target);
        }
    }
}

