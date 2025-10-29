#include <string>
#include <vector>

using namespace std;

int solution(vector<int> sides)
{
    int answer = 10000;
    int size = sides.size();

    // 1. 서로 다른 세 수를 고른다.
    // 2. 조건이 맞는지 확인 한다.
    // 첫번째 수 + 두번째 수 > 세번째 수
    // 두번째 수 + 세번째 수 > 첫번째 수
    // 첫번째 수 + 세번째 수 > 두번째 수
    // 3. 조건을 만족하는 세 수를 전부 합한다.
    // 4. 합한 수 중 제일 작은 수를 반환한다.

    for (int idx1 = 0; idx1 < size; ++idx1)
    {
        for (int idx2 = idx1 + 1; idx2 < size; ++idx2)
        {
            for (int idx3 = idx2 + 1; idx3 < size; ++idx3)
            {
                int num = 0;

                if (sides[idx1] + sides[idx2] > sides[idx3] && sides[idx2] + sides[idx3] > sides[idx1] && sides[idx1] + sides[idx3] > sides[idx2])
                {
                    num = sides[idx1] + sides[idx2] + sides[idx3];

                    if (num < answer)
                    {
                        answer = num;
                    }

                }
            }
        }
    }

    return answer;
}