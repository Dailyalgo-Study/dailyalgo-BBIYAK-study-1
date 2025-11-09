#include <string>
#include <vector>
#include <algorithm>

using namespace std;

// 3중 for문으로 타임 오류난다...
vector<string> solution(vector<int> scores)
{
    vector<string> answer(scores.size());

    // 1. 등급 지정하기
    vector<string> rank = { "A", "B", "C" };

    // 백업~ 임시로 저장하기 위함
    vector<int> temp = scores;

    // 2. 등급별 k명 구하기
    int k = scores.size() / 3;
    int count = 0;

    // 3. 최고 점수를 가진 학생을 찾기. 등급 부여
    for (int i = 0; i < rank.size(); ++i)
    {
        for (int j = 0; j < k; ++j)
        {
            int max = 0;
            int idx = -1;

            for (int i = 0; i < temp.size(); ++i)
            {
                if (temp[i] > max)
                {
                    max = temp[i];
                    idx = i;
                }
            }

            answer[idx] = rank[i];
            temp[idx] = -1;
        }
    }

    return answer;
}