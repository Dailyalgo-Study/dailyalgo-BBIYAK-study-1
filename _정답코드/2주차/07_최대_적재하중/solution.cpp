#include <string>
#include <vector>

using namespace std;

int solution(vector<int> ropes) {

    sort(ropes.begin(), ropes.end(), greater<int>());

	int answer = -1;
    for(int i=0; i<ropes.size(); i++){
        answer = max(answer, (i+1) * ropes[i]);
    }
	return answer;
}

