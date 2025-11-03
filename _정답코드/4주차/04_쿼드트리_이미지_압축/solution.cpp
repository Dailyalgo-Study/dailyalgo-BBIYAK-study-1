#include <vector>
#include <string>
using namespace std;

vector<vector<int>> imgGlob;

string encode(int x, int y, int n) {
    int countZero = 0;
    for (int i = x; i < x + n; i++) {
        for (int j = y; j < y + n; j++) {
            if (imgGlob[i][j] == 0) {
                countZero++;
            }
        }
    }
    if (countZero == 0) {
        return "1";
    }
    if (countZero == n * n) {
        return "0";
    }
    return "("
        + encode(x, y, n / 2)
        + encode(x, y + n / 2, n / 2)
        + encode(x + n / 2, y, n / 2)
        + encode(x + n / 2, y + n / 2, n / 2)
        + ")";
}

string solution(vector<vector<int>> img) {
    imgGlob = img;
    return encode(0, 0, 8);
}

