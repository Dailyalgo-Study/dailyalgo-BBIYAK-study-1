#include <string>
#include <vector>

using namespace std;

int solution(int limit, vector<int> people) {
	int answer = 0;

    sort(people.begin(),people.end(),greater<int>());

    bool check = false;

    for(int idx=0; idx<people.size(); idx++)
    {
        check = false;
        if(people[idx]==0)
        {
            continue;
        }
        if(limit==people[idx])
        {
            answer++;
            continue;
        }
        for(int idx2=people.size()-1; idx2>idx; idx2--)
        {
            if(limit-people[idx]>=people[idx2] && people[idx2]!=0)
            {
                answer++;
                people[idx2] =0;
                check = true;
                break;
            }
        }
        if(!check)
        {
            answer++;
        }
    }
	return answer;
}
