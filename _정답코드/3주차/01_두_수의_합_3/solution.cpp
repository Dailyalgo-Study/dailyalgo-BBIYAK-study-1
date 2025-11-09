#include <vector>
using namespace std;

int solution(vector<int> numbers, int target) {
    int n = numbers.size();
    int left = 0, right = n - 1;
    int answer = 0;

    while (left < right) {
        int curSum = numbers[left] + numbers[right];
        int cntLeft = 1, cntRight = 1;

        while (left + cntLeft < n && numbers[left] == numbers[left + cntLeft]) {
            cntLeft++;
        }
        
        while (right - cntRight >= 0 && numbers[right] == numbers[right - cntRight]) {
            cntRight++;
        }

        if (curSum == target) {
            if (numbers[left] == numbers[right]) {
                answer += cntLeft * (cntLeft - 1) / 2;
            } else {
                answer += cntLeft * cntRight;
            }
            left += cntLeft;
            right -= cntRight;
        } else if (curSum < target) {
            left += cntLeft;
        } else {
            right -= cntRight;
        }
    }

    return answer;
}

