#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(int limit, vector<int> people)
{
    int answer = 0;

    // 1. 몸무게 정렬하기
    sort(people.begin(), people.end());

    // 가벼운 사람의 인덱스
    int light = 0;
    // 무거운 사람의 인덱스       
    int heavy = people.size() - 1;

    // 2. 양쪽 끝에서부터 짝을 지어가기
    while (light <= heavy)
    {
        // 가벼운 사람과 무거운 사람의 합이 limit 이하인 경우 그 다음 가벼운 사람과 무거운 사람으로 넘어간다.
        if (people[light] + people[heavy] <= limit)
        {
            light++;
            heavy--;
        }
        else
        {
            // 무거운 사람은 혼자 타십쇼
            heavy--;
        }

        answer++;
    }

    return answer;
}
