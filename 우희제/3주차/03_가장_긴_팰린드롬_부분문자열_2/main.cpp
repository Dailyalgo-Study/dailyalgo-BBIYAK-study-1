#include <string>
#include <vector>

using namespace std;

int solution(string text)
{
    int size = text.size();
    int answer = 1;

    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            int start = i;
            int end = j;

            bool Palindrome = true;

            // i에서 j 구간이 팰린드롬인지 확인한다.
            while (start < end)
            {
                if (text[start] != text[end])
                {
                    // 다르면 멈춤
                    Palindrome = false;
                    break;
                }

                start++;
                end--;
            }

            // 팰린드롬이면 길이 계산 후 최대값 갱신 해준다.
            if (Palindrome)
            {
                int len = j - i + 1;

                if (len > answer)
                {
                    answer = len;
                }
            }
        }
    }

    return answer;
}