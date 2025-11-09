#include <vector>
using namespace std;

vector<int> solution(vector<vector<int>> numbers, vector<vector<int>> queries){
    int n = numbers.size();
    int m = numbers[0].size();
    
    vector<vector<int>> rowPrefixSum(n + 1, vector<int>(m + 1));
    vector<vector<int>> colPrefixSum(n + 1, vector<int>(m + 1));
    
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            rowPrefixSum[i][j] = rowPrefixSum[i][j - 1] + numbers[i - 1][j - 1];
            colPrefixSum[i][j] = colPrefixSum[i - 1][j] + numbers[i - 1][j - 1];
        }
    }
    
    vector<int> result;
    for (int i = 0; i < queries.size(); i++) {
        int cx = queries[i][0];
        int cy = queries[i][1];
        int s = queries[i][2];
        
        int horizontalSum = rowPrefixSum[cx][cy + s] - rowPrefixSum[cx][cy - s - 1];
        int verticalSum = colPrefixSum[cx + s][cy] - colPrefixSum[cx - s - 1][cy];
        
        result.push_back(horizontalSum + verticalSum - numbers[cx - 1][cy - 1]);
    }
    
    return result;
}

