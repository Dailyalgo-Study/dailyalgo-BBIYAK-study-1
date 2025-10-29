#include <string>
#include <vector>

using namespace std;

int solution(vector<int> A, vector<int> B) {
    int answer = 0;
    // 이것도 마찬가지로 그냥 큰거*큰거가 최대값일거같다고 생각해서
    sort(A.begin(), A.end());
    sort(B.begin(), B.end());
    // 휴리스틱으로
    int n = A.size();
    for (int i = 0; i < n; i++)
    {
        answer += A[i] * B[i];
    }
    return answer;
}
