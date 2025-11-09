#include <string>
#include <vector>

using namespace std;

int solution(vector<int> ropes) {
	int answer = 0;

    sort(ropes.begin(),ropes.end());


    for(int idx=0; idx< ropes.size(); idx++)
    {
        int current = ropes[idx] * (ropes.size()-idx);
        if(answer<current)
        {
            answer = current;
        }
    }

	return answer;
}
