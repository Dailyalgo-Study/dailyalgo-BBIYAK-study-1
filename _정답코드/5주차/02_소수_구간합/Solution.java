class Solution {
    private static final int MAX = 5000000;
    private static boolean[] isPrime = new boolean[MAX + 1];
    
    public int solution(int[] numbers) {
        isPrimeInit();
        
        int n = numbers.length;
        int[] prefixSum = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + numbers[i];
        }
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int sum = prefixSum[j] - prefixSum[i - 1];
                if (isPrime[sum]) {
                    count++;
                }
            }
        }
        
        return count;
    }

    private void isPrimeInit() {
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}

