#include <string>
#include <vector>

using namespace std;

int solution(vector<int> A, vector<int> B) {
	int answer = 0;

    sort(A.begin(),A.end());
    sort(B.begin(),B.end());

    for(int idx=0; idx<A.size(); idx++)
    {
        answer += A[idx]*B[idx];
    }

	return answer;
}
