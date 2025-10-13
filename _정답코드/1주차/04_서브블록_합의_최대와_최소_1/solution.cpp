#include <vector>
#include <string>
using namespace std;

vector<int> solution(vector<vector<int>> array) {
    int m = array.size();
    int n = array[0].size();
    int maxSum = array[0][0] + array[0][1] + array[1][0] + array[1][1];
    int minSum = maxSum;
    for (int i = 0; i < m - 1; i++) {
        for (int j = 0; j < n - 1; j++) {
            int s = array[i][j] + array[i][j+1] + array[i+1][j] + array[i+1][j+1];
            if (s > maxSum) maxSum = s;
            if (s < minSum) minSum = s;
        }
    }
    return {maxSum, minSum};
}