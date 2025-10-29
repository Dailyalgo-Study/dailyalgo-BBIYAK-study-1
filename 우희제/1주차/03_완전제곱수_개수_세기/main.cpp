#include <string>
#include <vector>

using namespace std;

int solution(int n, int m)
{
	int answer = 0;
	int i = n;

	// 1. n���� m���� ���ڸ� �̴´�.
	// 2. ���ڸ� �������� �� ���� ���� ���� ���� ���� ���Ѵ�.
	// 3. ���ٸ� answer�� ���� ��Ų��.

	// 4�� ���̽� Ÿ�� �ƿ�
	/*for (int i = n; i <= m; ++i)
	{
		for (int j = 1; j * j <= i; ++j)
		{
			if (i / j == j && i % j == 0)
			{
				++answer;
			}
		}
	}*/


	// 2�� �ݺ����� ����Ͽ� Ÿ�� ������ �ذ��ϱ� ���� �ݺ����� �и��� ����
	 /*int i = 1;

	 // 1. ���� ����, ù��° ������������ ���Ѵ�.
	 while (i * i < n)
	 {
	     ++i;
	 }

	 // 2. ù ������ i���� m���� ������������ ������ ���Ѵ�.
	 for (; i * i <= m; ++i)
	 {
	     ++answer;
	 }*/


	// �ι�° ������ �ϳ��� �ݺ������� �ٲ㺸��
	for (int i = 1; i * i <= m; ++i)
	{
		// i�� ������ m���� �ݺ��ϸ鼭 n �̻��� ��츸 ī��Ʈ�Ѵ�.
		if (i * i >= n)
		{
			++answer;
		}
	}

	return answer;
}