#include <vector>
#include <cmath>
using namespace std;

const int MAX = 1000000;
bool isPrime[MAX + 1] = {false};
bool initialized = false;

void isPrimeInit() {
    if (initialized) return;
    
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
    
    initialized = true;
}

int solution(vector<int> numbers) {
    isPrimeInit();
    
    int n = numbers.size();
    vector<int> prefixSum(n + 1);
    
    for (int i = 0; i < n; i++) {
        prefixSum[i + 1] = prefixSum[i] + numbers[i];
    }
    
    int count = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = i; j <= n; j++) {
            int sum = prefixSum[j] - prefixSum[i - 1];
            if (sum >= 2 && sum <= MAX && isPrime[sum]) {
                count++;
            }
        }
    }
    
    return count;
}

