#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<int> scores) {
    // 인덱스 배열을 만든다
    int n = scores.size();
    vector<string> answer(n);
    vector<int> indexs(n);
    for (int i = 0; i < n; i++)
    {
        indexs[i] = i;
    }

    // score-index pair vector 만든다
    vector<pair<int, int>> sipair;
    for (int i = 0; i < n; i++)
    {
        sipair.push_back({ scores[i], indexs[i] });
    }

    // 정렬한다
    sort(sipair.begin(), sipair.end(), [](const pair<int, int>& a, const pair<int, int>& b) {
        if (a.first == b.first)
        {
            return a.second < b.second;
        }
        return a.first > b.first;
        });

    // 인덱스대로 점수 매핑 해준다
    for (int i = 0; i < n; i++)
    {
        int idx = sipair[i].second;
        if (i < (n / 3))
        {
            answer[idx] = "A";
        }
        else if (i < (2 * n / 3))
        {
            answer[idx] = "B";
        }
        else
        {
            answer[idx] = "C";
        }
    }
    return answer;
}
