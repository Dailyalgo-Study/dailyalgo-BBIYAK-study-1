#include <string>
#include <vector>

using namespace std;

int jewelindex(const string& jewel)
{
    if (jewel == "Diamond")
    {
        return 0;
    }
    if (jewel == "Ruby")
    {
        return 1;
    }
    if (jewel == "Emerald")
    {
        return 2;
    }
    if (jewel == "Sapphire")
    {
        return 3;
    }
    // "Gold" 는 인덱스 4
    return 4;
}

int solution(vector<string> jewels)
{
    int size = jewels.size();
    vector<int> jewelcount(5);

    // 보석 종류 개수
    int count = 0;
    int left = 0;
    int answer = size + 1;

    for (int right = 0; right < size; right++)
    {
        int idx = jewelindex(jewels[right]);

        // 새 종류의 보석이 추가되면 count++
        if (jewelcount[idx] == 0)
        {
            count++;
        }

        jewelcount[idx]++;

        // 다섯 종류 다 모였으면 왼쪽 줄이기
        while (count == 5)
        {
            answer = min(answer, right - left + 1);

            int leftidx = jewelindex(jewels[left]);

            jewelcount[leftidx]--;

            if (jewelcount[leftidx] == 0)
            {
                // 종류 하나 빼기
                count--;
            }

            left++;
        }
    }

    return answer;
}