#include <vector>
#include <string>
#include <cmath>
using namespace std;

int solution(int n, int m) {
    int count = 0;
    for (int i = n; i <= m; ++i) {
        if ((int)sqrt(i) * (int)sqrt(i) == i) {
            count++;
        }
    }
    return count;
}