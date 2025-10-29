#include <string>
#include <vector>
#include <algorithm>

using namespace std;

// �ι�° �õ�
string solution(vector<string> participant, vector<string> completion)
{
    // 1. ���� ��ϰ� ���� ����� ���� ������ �����Ѵ�.
    sort(participant.begin(), participant.end());
    sort(completion.begin(), completion.end());

    // 2. �� ����� ������ �� ��ŭ ���Ѵ�.
    for (int i = 0; i < completion.size(); ++i)
    {
        // ���� �ٸ� ����̸� �ش� ����� �̿�����
        if (participant[i] != completion[i])
        {
            return participant[i];
        }
    }

    // 3. ��� ��ġ�Ѵٸ� ������ �����ڰ� �̿������̹Ƿ� ������ ��� ��ȯ�Ѵ�.
    return participant.back();
}




// ù��° �õ�(�ߺ� �̸��� �� �� �����Ͽ� �ε��� ��������.)
/*string solution(vector<string> participant, vector<string> completion)
{
    string answer = "";
    // 1. ������ ������ ���(completion)�� ������ ��� ���(completion)���� ���� ����� �ִٸ� �����Ѵ�.
    // 2. ���� �� ���� �ε��� 0�� ���� ��ȯ�Ѵ�.
    int PSize = participant.size();
    int CSize = completion.size();

    for (int PIndex = 0; PIndex < PSize; ++PIndex)
    {
        for (int CIndex = 0; CIndex < CSize; ++CIndex)
        {
            if (participant[PIndex] == completion[CIndex])
            {
                // ��ġ �ϴ� ����� �ִٸ� ����
                participant.erase(participant.begin() + PIndex);
                break;
            }
        }
    }

    return participant[0];
}*/