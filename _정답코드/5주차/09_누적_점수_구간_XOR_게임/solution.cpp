#include <vector>
using namespace std;

vector<int> solution(vector<int> numbers, vector<vector<int>> queries){
    int n = numbers.size();
    vector<int> prefixXor(n + 1);
    
    for (int i = 0; i < n; i++) {
        prefixXor[i + 1] = prefixXor[i] ^ numbers[i];
    }
    
    vector<int> result;
    for (int i = 0; i < queries.size(); i++) {
        int l = queries[i][0];
        int r = queries[i][1];
        result.push_back(prefixXor[r] ^ prefixXor[l - 1]);
    }
    
    return result;
}

