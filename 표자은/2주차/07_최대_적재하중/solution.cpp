#include <string>
#include <vector>

using namespace std;

int solution(vector<int> ropes) {
    int answer = 0;
    // 몇 가지 경우 구하다보면 최대값을 구하는 공식이 정해져 있다는 걸 알 수 있다.
    // 정렬하고
    sort(ropes.begin(), ropes.end());
    int n = ropes.size();
    int temp = 0;
    // 임의의 수 선택 후 
    for (int i = 0; i < n; i++)
    {
        temp = ropes[i] * (n - i);
        if (temp > answer)
            answer = temp;
    }
    // 그 수 보다 뒤에 있는 수(큰 수)의 개수 곱함 
    return answer;
}
