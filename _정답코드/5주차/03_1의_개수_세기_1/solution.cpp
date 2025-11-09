#include <vector>
using namespace std;

vector<int> solution(vector<int> bits, vector<vector<int>> queries){
    int n = bits.size();
    vector<int> prefixSum(n + 1);
    
    for (int i = 0; i < n; i++) {
        prefixSum[i + 1] = prefixSum[i] + bits[i];
    }
    
    vector<int> result;
    for (int i = 0; i < queries.size(); i++) {
        int l = queries[i][0];
        int r = queries[i][1];
        result.push_back(prefixSum[r] - prefixSum[l - 1]);
    }
    
    return result;
}

