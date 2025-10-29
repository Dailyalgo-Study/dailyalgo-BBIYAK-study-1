#include <string>
#include <vector>
#include <algorithm>

using namespace std;


bool compare(const vector<int>&a, const vector<int>&b)
{
    if(a[1]==b[1]) return a[0]< b[0];

    return a[1]<b[1];
}



int solution(vector<vector<int>> tasks) {
	int answer = 0;

    sort(tasks.begin(), tasks.end(), compare);

    int endtime=0;

    for(int idx=0; idx<tasks.size(); idx++)
    {
        int start = tasks[idx][0];
        int end = tasks[idx][1];

        if(start >= endtime)
        {
            answer++;
            endtime = end;
        }
    }



	return answer;
}
