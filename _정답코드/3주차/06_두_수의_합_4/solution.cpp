#include <vector>
using namespace std;

vector<int> solution(vector<int> numbers, int target) {
    vector<int> answer = {-1, -1};
    int n = numbers.size();
    int left = 0, right = n - 1;

    while (left < right) {
        int total = numbers[left] + numbers[right];
        if (total == target) {
            answer = {numbers[left], numbers[right]};
            left++;
        } else if (total < target) {
            left++;
        } else {
            right--;
        }
    }

    return answer;
}