#include <string>
#include <vector>
#include <algorithm>

using namespace std;

// 두번째 시도
string solution(vector<string> participant, vector<string> completion)
{
    // 1. 참가 목록과 완주 목록을 같은 순서로 정렬한다.
    sort(participant.begin(), participant.end());
    sort(completion.begin(), completion.end());

    // 2. 두 목록을 완주자 수 만큼 비교한다.
    for (int i = 0; i < completion.size(); ++i)
    {
        // 만약 다른 사람이면 해당 사람이 미완주자
        if (participant[i] != completion[i])
        {
            return participant[i];
        }
    }

    // 3. 모두 일치한다면 마지막 참가자가 미완주자이므로 마지막 요소 반환한다.
    return participant.back();
}




// 첫번째 시도(중복 이름을 둘 다 제거하여 인덱스 꼬여버림.)
/*string solution(vector<string> participant, vector<string> completion)
{
    string answer = "";
    // 1. 마라톤 참가자 목록(completion)과 완주한 사람 목록(completion)에서 같은 사람이 있다면 제거한다.
    // 2. 제거 후 남은 인덱스 0의 값을 반환한다.
    int PSize = participant.size();
    int CSize = completion.size();

    for (int PIndex = 0; PIndex < PSize; ++PIndex)
    {
        for (int CIndex = 0; CIndex < CSize; ++CIndex)
        {
            if (participant[PIndex] == completion[CIndex])
            {
                // 일치 하는 사람이 있다면 제거
                participant.erase(participant.begin() + PIndex);
                break;
            }
        }
    }

    return participant[0];
}*/