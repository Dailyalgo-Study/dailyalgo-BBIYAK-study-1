#include <string>
#include <vector>
#include <iostream>
using namespace std;

void  elemsum(vector<int>& numbers, int startIdx, int nelem, int nsum, int m, int& answer)
{
    if (nelem == 2)
    {
        if (nsum <= m && nsum > answer) // �� ����Լ��� ������ʿ��� answer ����
        {
            answer = nsum;
            cout << answer << endl;
            return;
        }
    }

    int n = numbers.size();
    for (int i = startIdx + 1; i < n; i++)
    {
        nsum += numbers[i]; // push
        nelem += 1;

        if (nsum > m)   // pruning
        {
            nsum -= numbers[i];
            nelem -= 1;
            continue;
        }
        elemsum(numbers, i, nelem, nsum, m, answer); // �Լ� ��ü�� �ϳ��� ��Ҹ� �ִ°� ����

        nsum -= numbers[i]; // pop
        nelem -= 1;
    }
}

int solution(vector<int> numbers, int m) {
    int answer = 0;

    elemsum(numbers, -1, 0, 0, m, answer); // �ε��� -1���� �ִ� ����

    return answer;
}
