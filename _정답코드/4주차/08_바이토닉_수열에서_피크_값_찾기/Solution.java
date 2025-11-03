public class Solution {
    private static int[] numbers_glob;

    public int solution(int[] numbers) {
        numbers_glob = numbers;
        int n = numbers.length;

        if(n == 1){
            return numbers[0];
        }
        if(numbers[0] > numbers[1]){
            return numbers[0];
        }
        if(numbers[n-1] > numbers[n-2]){
            return numbers[n-1];
        }

        int idx = binary_search(1, n-1);
        return numbers[idx];
    }

    private int binary_search(int left, int right){
        if(left == right){
            return left;
        }

        int mid = (left + right+1) / 2;
        if(numbers_glob[mid-1] < numbers_glob[mid]){
            return binary_search(mid, right);
        } else {
            return binary_search(left, mid-1);
        }
    }
}

