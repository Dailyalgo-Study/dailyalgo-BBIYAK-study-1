#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
	int answer = 0;


    map<int,int> temp;

    for(int idx=0; idx<numbers.size(); idx++)
    {
        int num = numbers[idx];
        if(temp.count(num))
        {

            temp[num]++;
        }
        else
        {
            temp[num]=1;
        }
    }

    int count =0;
    
    for(auto idx : temp)
    {
        if(idx.second> count)
        {
            count = idx.second;
            answer = idx.first;
        }
    }


	return answer;
}
