#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<vector<int>> vec) {
    vector<int> answer = {};
    int m = vec.size();
    int n = vec[0].size();
    int minsum = 40000, maxsum = -40000;
    int vsum = 0;

    for (int j = 0; j < m - 1; j++)
    {
        for (int i = 0; i < n - 1; i++)
        {
            vsum = vec[j][i] + vec[j + 1][i] + vec[j][i + 1] + vec[j + 1][i + 1];

            if (vsum < minsum) minsum = vsum;
            if (vsum > maxsum) maxsum = vsum;
        }
    }
    answer.push_back(maxsum);
    answer.push_back(minsum);
    return answer;
}
