#include <string>
#include <vector>
#include <map>
//#include <algorithm>

using namespace std;

int solution(vector<int> numbers) 
{
    map<int, int> freq;
    int n = numbers.size();

    // 같은 숫자 카운트 세기
    for (int i = 0; i < n; ++i) 
    {
        int num = numbers[i];

        // num의 등장 횟수 증가
        freq[num]++;
    }

    int maxfreq = 0, result = 0;

    // 여기서 최빈값 찾기!!
    for (auto& [k, v] : freq) 
    {
        // key : 현재 숫자
        // value : 등장 횟수
        if (v > maxfreq) 
        {
            // v가 최고 등장횟수 maxfreq보다 등장 횟수가 크다면 result에 k를 저장한다.
            maxfreq = v;
            result = k;
        }

        // 빈도수가 같다면 더 작은 k를 result에 저장한다.
        else if (v == maxfreq && result > k) 
        {
            result = k;
        }
    }
    return result;
}



/*int solution(vector<int> numbers)
{
    int answer = 0;
    int n = numbers.size();
    int maxcount = 100000;

    int currentcount = 0;

    // 1. 배열을 정렬한다.
    sort(numbers.begin(), numbers.end());

    // 2. 배열 순회 하면서 현재 숫자의 등장 횟수 찾기
    for (int i = 1; i <= n; ++i)
    {
        // 현재 숫자와 다음 숫자가 다르다면
        if (numbers[i - 1] != numbers[i])
        {
            // maxcount에 새로 저장한다.
            if (currentcount > maxcount)
            {
                maxcount = currentcount;
            }
        }

        // 같은 숫자가 나오면
        if (numbers[i - 1] == numbers[i])
        {
            // 정답후보군에 저장
            answer = numbers[i];

            // 카운트 증가하기
            ++currentcount;
        }

    }

    return answer;
}*/
