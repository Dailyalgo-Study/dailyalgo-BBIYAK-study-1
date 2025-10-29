#include <string>
#include <vector>

using namespace std;

bool solution(int n)
{
    bool answer = true;
    vector<int> numbers;

    // 1. ���� n�� �ڸ����� �ɰ���
    while (n > 0)
    {
        // 2. �ڸ����� vector�� �ֱ�
        numbers.push_back(n % 10);
        n /= 10;
    }

    int frontindex = 0;
    int backindex = numbers.size() - 1;

    // 3. ���ٸ� �ε��� ����/���� �� �ٽ� ��
    while (frontindex < backindex)
    {
        // 4. frontindex�� backindex ���� ���Ͽ� �ٸ��� false
        if (numbers[frontindex] != numbers[backindex])
        {
            return false;
        }
        ++frontindex;
        --backindex;
    }

    // ���� ��� �Ǹ� true ��ȯ
    return answer;
}