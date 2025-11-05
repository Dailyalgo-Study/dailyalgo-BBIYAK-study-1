#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr1, vector<int> arr2) {
	vector<int> answer = {};

    for(int idx = 0; idx<arr1.size(); idx++)
    {
        answer.push_back(arr1[idx]);
    }

    for(int idx = 0; idx<arr2.size(); idx++)
    {
        answer.push_back(arr2[idx]);
    }

    sort(answer.begin(), answer.end());

	return answer;
}
