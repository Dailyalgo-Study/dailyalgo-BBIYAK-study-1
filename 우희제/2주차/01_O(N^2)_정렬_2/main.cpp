#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers)
{
    vector<int> answer = {};

    int temp = 0;

    // 버블 정렬 만들기
    // 이중 for문으로 앞/뒤 인덱스의 값을 비교하여 교환
    for (int i = 0; i < numbers.size(); ++i)
    {
        for (int j = 0; j < numbers.size() - 1; ++j)
        {
            // 큰 값을 앞으로 이동 시키기
            if (numbers[j] < numbers[j + 1])
            {
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
            }
        }
    }

    return numbers;
}