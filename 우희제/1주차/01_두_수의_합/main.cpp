#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int m)
{
    // ���� �ٸ� �� �� ����
    // �ε��� �������� ���� �ٸ��� ������ �����
    int answer = 0;
    int length = numbers.size();

    for (int idx1 = 0; idx1 < length; ++idx1)
    {
        for (int idx2 = idx1 + 1; idx2 < length; ++idx2)
        {
            /*if (numbers[idx1] == numbers[idx2])
                continue;*/

            // �� ���� ���� ����Ѵ�.
            int SumNumber = numbers[idx1] + numbers[idx2];

            // m�� �Ѵ��� Ȯ���Ѵ�.
            if (m < SumNumber)
                continue;

            // m�� ���� ������ "�����ĺ���"�� �����صд�.
            //printf("%d, %d, �� ���� �� : %d", numbers[idx1], numbers[idx2], SumNumber);
            //printf("\n");

            if (answer < SumNumber)
            {
                answer = SumNumber;
            }

        }
    }

    // "�����ĺ���" �߿��� m�� ���� ����� ���� ã�´�.
    return answer;
}