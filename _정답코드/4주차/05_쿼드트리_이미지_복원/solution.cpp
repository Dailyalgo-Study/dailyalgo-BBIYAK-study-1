#include <vector>
#include <string>
using namespace std;

vector<vector<int>> answer(8, vector<int>(8));
string comp;
int idx = 0;

void decode(int x, int y, int n) {
    if ( comp[idx] != '(' ) {
        int value = comp[idx] - '0';
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                answer[i][j] = value;
            }
        }
        idx += 1;
    } else {
        idx += 1;
        decode(x, y, n / 2);
        decode(x, y + n / 2, n / 2);
        decode(x + n / 2, y, n / 2);
        decode(x + n / 2, y + n / 2, n / 2);
        idx += 1;
    }
}

vector<vector<int>> solution(string compressed) {
    comp = compressed;
    idx = 0;
    decode(0, 0, 8);
    return answer;
}

