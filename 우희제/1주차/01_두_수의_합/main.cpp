#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int m)
{
    // 서로 다른 두 수 고르기
    // 인덱스 기준으로 서로 다름의 기준을 만들기
    int answer = 0;
    int length = numbers.size();

    for (int idx1 = 0; idx1 < length; ++idx1)
    {
        for (int idx2 = idx1 + 1; idx2 < length; ++idx2)
        {
            /*if (numbers[idx1] == numbers[idx2])
                continue;*/

            // 두 수의 합을 계산한다.
            int SumNumber = numbers[idx1] + numbers[idx2];

            // m을 넘는지 확인한다.
            if (m < SumNumber)
                continue;

            // m을 넘지 않으면 "정답후보군"에 저장해둔다.
            //printf("%d, %d, 두 수의 합 : %d", numbers[idx1], numbers[idx2], SumNumber);
            //printf("\n");

            if (answer < SumNumber)
            {
                answer = SumNumber;
            }

        }
    }

    // "정답후보군" 중에서 m과 가장 가까운 값을 찾는다.
    return answer;
}