public class Solution {
	public int solution(int[] numbers, int target) {
		int start = 0;
        int end = numbers.length - 1;
        int count = 0;

        while(start < end) {
            int sum = numbers[start] + numbers[end];

            if(sum == target) {    
                if (numbers[start] == numbers[end]) {
                    count += (end - start + 1) * (end - start) / 2;
                    break;
                } else {
                    int left = numbers[start];
                    int right = numbers[end];
                    int leftCount = 0;
                    int rightCount = 0;

                    while (start <= end && numbers[start] == left) {
                        leftCount++;
                        start++;
                    }
                    while (start <= end && numbers[end] == right) {
                        rightCount++;
                        end--;
                    }

                    count += leftCount * rightCount;
                }
            } else if(sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return count;
	}
}
