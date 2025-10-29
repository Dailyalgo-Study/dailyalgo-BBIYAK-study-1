#include <string>
#include <vector>

using namespace std;

int solution(vector<int> ropes) {
    int answer = 0;
    // �� ���� ��� ���ϴٺ��� �ִ밪�� ���ϴ� ������ ������ �ִٴ� �� �� �� �ִ�.
    // �����ϰ�
    sort(ropes.begin(), ropes.end());
    int n = ropes.size();
    int temp = 0;
    // ������ �� ���� �� 
    for (int i = 0; i < n; i++)
    {
        temp = ropes[i] * (n - i);
        if (temp > answer)
            answer = temp;
    }
    // �� �� ���� �ڿ� �ִ� ��(ū ��)�� ���� ���� 
    return answer;
}
