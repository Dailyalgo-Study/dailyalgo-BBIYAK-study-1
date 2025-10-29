#include <string>
#include <vector>
#include <algorithm>


using namespace std;

vector<int> solution(vector<vector<int>> array) {
    vector<int> answer = {};

    vector<int> temp;

    int temp1 = 0;

    for (int idx = 0; idx < array.size() - 1; idx++)
    {
        for (int idx2 = 0; idx2 < array[0].size() - 1; idx2++)
        {
            temp1 = array[idx][idx2] + array[idx][idx2 + 1] + array[idx + 1][idx2] + array[idx + 1][idx2 + 1];
            temp.push_back(temp1);
        }

    }

    sort(temp.begin(), temp.end());

    answer.push_back(temp.back());
    answer.push_back(temp.front());

    return answer;
}
