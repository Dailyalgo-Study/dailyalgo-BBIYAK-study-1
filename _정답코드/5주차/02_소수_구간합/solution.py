MAX = 1000000
isPrime = [False] * (MAX + 1)

for i in range(2, MAX + 1):
    isPrime[i] = True

for i in range(2, int(MAX**0.5) + 1):
    if isPrime[i]:
        for j in range(i * i, MAX + 1, i):
            isPrime[j] = False

def solution(numbers):
    n = len(numbers)
    prefixSum = [0] * (n + 1)
    
    for i in range(n):
        prefixSum[i + 1] = prefixSum[i] + numbers[i]
    
    count = 0
    for i in range(1, n + 1):
        for j in range(i, n + 1):
            sum_val = prefixSum[j] - prefixSum[i - 1]
            if sum_val >= 2 and sum_val <= MAX and isPrime[sum_val]:
                count += 1
    
    return count

