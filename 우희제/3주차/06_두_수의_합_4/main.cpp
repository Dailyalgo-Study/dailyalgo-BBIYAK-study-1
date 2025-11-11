#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers, int target)
{
    int left = 0;
    int right = numbers.size() - 1;

    vector<int> answer = { -1, -1 };
    int min = 100000;

    // 두 포인터가 만날 때까지 반복한다.
    while (left < right)
    {
        // 두 수의 합 계산
        int sum = numbers[left] + numbers[right];

        if (sum == target)
        {
            // 두 수의 차이 계산
            int diff = numbers[right] - numbers[left];

            // 차이가 더 작으면 바꿔준다.
            if (diff < min)
            {
                min = diff;
                answer = { numbers[left], numbers[right] };
            }

            // 포인터 이동시켜 다른 조합 찾기
            left++;
            right--;
        }
        else if (sum < target)
        {
            // 합이 작으면 왼쪽 값을 증가 시킨다.
            left++;
        }
        // sum > target일 경우
        else
        {
            // 합이 크면 오른쪽 값을 감소 시킨다.
            right--;
        }
    }

    return answer;
}