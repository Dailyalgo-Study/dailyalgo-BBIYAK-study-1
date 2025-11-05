#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers, int window)
{
    int size = numbers.size();
    vector<int> answer;

    // 첫번째 윈도우의 합 계산하기
    int sum = 0;
    for (int i = 0; i < window; i++)
    {
        sum += numbers[i];
    }

    // 합을 answer에 추가한다.
    answer.push_back(sum);

    // 이후 윈도우부터는 기존 합을 이용해 업데이트
    for (int left = 1; left <= size - window; left++)
    {
        // 새로 들어올 인덱스
        int right = left + (window - 1);

        // 한 칸 오른쪽으로 슬라이드했을 때 변화된 부분 갱신한다.
        sum = sum + numbers[right] - numbers[left - 1];

        answer.push_back(sum);
    }

    return answer;
}