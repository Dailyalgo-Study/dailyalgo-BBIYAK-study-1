#include <string>
#include <vector>

using namespace std;

// 서로 다른 쌍을 한 번씩만 세서 테스트케이스 3번 통과 안됨.
int solution(vector<int> numbers, int target)
{
    int count = 0;
    int left = 0;
    int right = numbers.size() - 1;

    while (left < right)
    {
        int sum = numbers[left] + numbers[right];

        if (sum == target)
        {
            count++;
            left++;
            right--;
        }

        else if (sum < target)
        {
            left++;
        }

        // 합이 target보다 클 경우
        else
        {
            right--;
        }
    }

    return count;
}