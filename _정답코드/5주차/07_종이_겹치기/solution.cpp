#include <vector>
using namespace std;

vector<vector<int>> solution(int n, int m, vector<vector<int>> papers){
    vector<vector<int>> count(n + 2, vector<int>(m + 2));
    
    for (int i = 0; i < papers.size(); i++) {
        int x1 = papers[i][0];
        int y1 = papers[i][1];
        int x2 = papers[i][2];
        int y2 = papers[i][3];
        
        count[x1][y1]++;
        count[x1][y2 + 1]--;
        count[x2 + 1][y1]--;
        count[x2 + 1][y2 + 1]++;
    }
    
    vector<vector<int>> result(n, vector<int>(m));
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            count[i][j] += count[i - 1][j] + count[i][j - 1] - count[i - 1][j - 1];
            result[i - 1][j - 1] = count[i][j];
        }
    }
    
    return result;
}

