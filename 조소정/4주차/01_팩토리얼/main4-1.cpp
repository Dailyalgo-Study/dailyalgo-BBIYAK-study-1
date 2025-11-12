#include <string>
#include <vector>

using namespace std;

unsigned long long factorial(int n) {
    if (n == 0) return 1; 
    return n * factorial(n - 1);
}

long long solution(int n) {
    long long answer = 0;

    answer = factorial(n);

    return answer;
}
