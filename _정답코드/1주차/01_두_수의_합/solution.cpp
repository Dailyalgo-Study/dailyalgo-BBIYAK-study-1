#include <vector>
#include <string>
using namespace std;

int solution(vector<int> numbers, int m) {
    int res = 0;
    int n = numbers.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            int sum = numbers[i] + numbers[j];
            if (sum <= m && sum > res) {
                res = sum;
            }
        }
    }
    return res;
}