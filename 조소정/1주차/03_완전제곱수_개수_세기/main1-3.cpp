#include <string>
#include <vector>

using namespace std;

int solution(int n, int m) {
    int answer = 0;


    for (int idx = 1; idx * idx <= m; idx++)
    {
        if (idx * idx >= n)
        {
            answer++;
        }
    }

    return answer;
}
