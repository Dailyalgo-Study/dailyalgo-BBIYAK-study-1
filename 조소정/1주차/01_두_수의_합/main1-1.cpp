#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int solution(vector<int> numbers, int m) {
	int answer = 0;
    vector<int> temp;

    int compare = 0;
    for(int idx = 0; idx< numbers.size(); idx++)
    {
         for(int idx2 = idx+1; idx2<numbers.size()-1; idx2++)
        {
            compare = numbers[idx]+numbers[idx2];
        
            if(compare>m) continue;

            if(compare==m)
            {
                return compare;
            }

            if(answer<compare)
            {
                temp.push_back(compare);
            }
        }
    }

    sort(temp.begin(),temp.end());

    return temp.back();
}
