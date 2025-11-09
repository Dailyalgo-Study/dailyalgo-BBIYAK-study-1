#include <vector>
using namespace std;

vector<int> solution(vector<int> numbers, int infimum, vector<vector<int>> queries){
    int n = numbers.size();
    vector<int> prefixCount(n + 1);
    
    for (int i = 0; i < n; i++) {
        prefixCount[i + 1] = prefixCount[i];
        if (numbers[i] > infimum) {
            prefixCount[i + 1]++;
        }
    }
    
    vector<int> result;
    for (int i = 0; i < queries.size(); i++) {
        int l = queries[i][0];
        int r = queries[i][1];
        result.push_back(prefixCount[r] - prefixCount[l - 1]);
    }
    
    return result;
}

