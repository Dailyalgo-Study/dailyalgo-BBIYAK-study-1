#include <vector>
using namespace std;

vector<int> solution(vector<int> numbers, vector<vector<int>> queries){
    int n = numbers.size();
    vector<int> prefixSum(n + 1);
    
    for (int i = 0; i < n; i++) {
        prefixSum[i + 1] = prefixSum[i] + numbers[i];
    }
    
    int totalSum = prefixSum[n];
    
    vector<int> result;
    for (int i = 0; i < queries.size(); i++) {
        int l = queries[i][0];
        int r = queries[i][1];
        
        if (l <= r) {
            result.push_back(prefixSum[r] - prefixSum[l - 1]);
        } else {
            result.push_back(totalSum - (prefixSum[l - 1] - prefixSum[r]));
        }
    }
    
    return result;
}

