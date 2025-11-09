#include <vector>
using namespace std;

vector<int> solution(vector<int> numbers, int window) {
    int n = numbers.size();
    int windowSum = 0;

    for (int i = 0; i < window; i++) {
        windowSum += numbers[i];
    }

    vector<int> answer;
    answer.push_back(windowSum);

    for (int i = window; i < n; i++) {
        windowSum += numbers[i] - numbers[i - window];
        answer.push_back(windowSum);
    }

    return answer;
}

