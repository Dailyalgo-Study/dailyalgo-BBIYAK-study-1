#include <string>
#include <vector>

using namespace std;

bool solution(int n)
{
    bool answer = true;
    vector<int> numbers;

    // 1. 숫자 n을 자릿수로 쪼개기
    while (n > 0)
    {
        // 2. 자릿수를 vector에 넣기
        numbers.push_back(n % 10);
        n /= 10;
    }

    int frontindex = 0;
    int backindex = numbers.size() - 1;

    // 3. 같다면 인덱스 증가/감소 후 다시 비교
    while (frontindex < backindex)
    {
        // 4. frontindex과 backindex 값을 비교하여 다르면 false
        if (numbers[frontindex] != numbers[backindex])
        {
            return false;
        }
        ++frontindex;
        --backindex;
    }

    // 전부 통과 되면 true 반환
    return answer;
}