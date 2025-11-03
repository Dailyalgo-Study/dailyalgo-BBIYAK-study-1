long long factorial(int n) {
    if (n == 1) {
        return 1L;
    }
    return factorial(n - 1) * n;
}

long long solution(int n) {
	return factorial(n);
}

