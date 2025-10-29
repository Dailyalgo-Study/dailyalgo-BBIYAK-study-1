#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(vector<vector<int>> tasks) {
    int answer = 0;
    vector<int> vec;
    for (vector<int> task : tasks)
    {
        for (int t : task) vec.push_back(t);
    }
    sort(vec.begin(), vec.end());
    auto v = *--vec.end();  // 1000000000 юлго
    //cout << v;
    int dp[100] = { 0 };

    for (int i = 0; i < v; i++)
    {
        for (vector<int> task : tasks)
        {
            if (task[1] == i)
            {
                cout << i << " ";
                dp[v] = dp[task[0]] + 1;
            }
            else
            {
                dp[v + 1] = dp[v];
            }
        }

    }
    cout << endl;
    for (int i = 0; i < 100; i++)
    {
        cout << dp[i] << " ";
    }
    sort(dp, dp + 100);
    answer = dp[99];
    return answer;
}
v