#include <string>
#include <vector>

using namespace std;

vector<int> answer = { 0, 0 };

void fibo12(int n)
{
    if (n == 1) {
        answer[0]++;
        return;
    }
    if (n == 2) {
        answer[1]++;
        return;
    }
    fibo12(n - 1);
    fibo12(n - 2);
}

vector<int> solution(int n) {
    fibo12(n);
    return answer;
}
