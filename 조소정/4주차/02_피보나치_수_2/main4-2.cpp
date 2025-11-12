#include <string>
#include <vector>

using namespace std;
int fibo(int n, int &count1, int &count2) {
    if (n == 1) 
    {
        count1++;
        return 1;
    } 
    else if (n == 2) 
    {
        count2++;
        return 1;
    }
    else 
    {
        return fibo(n - 1, count1, count2) + fibo(n - 2, count1, count2);
    }
}

vector<int> solution(int n) {
    vector<int> answer = {0,0};

    fibo(n, answer[0], answer[1]);
    return answer;
}
