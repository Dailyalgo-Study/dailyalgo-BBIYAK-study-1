#include <vector>
using namespace std;

vector<vector<int>> answer;

void hanoi(int n, int start, int end, int mid) {
    vector<int> move = {n, start, end};
    if (n == 1) {
        answer.push_back(move);
    } else {
        hanoi(n - 1, start, mid, end);
        answer.push_back(move);
        hanoi(n - 1, mid, end, start);
    }
}

vector<vector<int>> solution(int n) {
    answer.clear();
    hanoi(n, 1, 3, 2);
    return answer;
}

