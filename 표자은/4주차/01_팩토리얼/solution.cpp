#include <string>
#include <vector>

using namespace std;

long long factorial(int n)
{
    if (n == 1) return 1;
    return n * factorial(n - 1);
}

long long solution(int n) {
    return factorial(n);
}
