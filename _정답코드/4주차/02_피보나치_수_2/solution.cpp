#include <vector>
using namespace std;

int count1 = 0;
int count2 = 0;

void fibo(int n) {
    if (n == 1) {
        count1++;
    } else if (n == 2) {
        count2++;
    } else {
        fibo(n - 1);
        fibo(n - 2);
    }
}

vector<int> solution(int n) {
    fibo(n);
    vector<int> answer = {count1, count2};
    return answer;
}

