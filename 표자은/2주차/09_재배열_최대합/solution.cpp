#include <string>
#include <vector>

using namespace std;

int solution(vector<int> A, vector<int> B) {
    int answer = 0;
    // �̰͵� ���������� �׳� ū��*ū�Ű� �ִ밪�ϰŰ��ٰ� �����ؼ�
    sort(A.begin(), A.end());
    sort(B.begin(), B.end());
    // �޸���ƽ����
    int n = A.size();
    for (int i = 0; i < n; i++)
    {
        answer += A[i] * B[i];
    }
    return answer;
}
