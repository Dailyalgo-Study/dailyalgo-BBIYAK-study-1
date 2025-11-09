public class Solution {

    private int[] numbers_glob;

    public boolean solution(int[] numbers, int target) {
        numbers_glob = numbers;

        int n = numbers.length;
        int left = 0, right = n-1;

        int idx = binary_search(left, right, target);
        return (numbers[idx] == target);
    }

    private int binary_search(int left, int right, int target){
        if(left == right) {
            return left;
        }
        
        int mid = (left + right + 1) / 2;
        if(numbers_glob[mid] >= target){
            return binary_search(mid, right, target);
        } else {
            return binary_search(left, mid-1, target);
        }
    }
}

