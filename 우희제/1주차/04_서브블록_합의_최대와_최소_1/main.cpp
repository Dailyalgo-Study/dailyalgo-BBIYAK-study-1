#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<vector<int>> array)
{
	vector<int> answer = {};

	int rowsize = array.size() - 1;
	int columnsize = array[0].size() - 1;

	// array�� ���Ҵ� -10,000 �̻� 10,000 ������ ����
	int minnum = 10000;
	int maxnum = -10000;

	int num = 0;

	// 0�� ��
	// [1,2], [5,6]
	// [2,3], [6,7]
	// [3,4], [7,8]

	// 1�� ��
	// [5,6], [9,10]
	// [6,7], [10,11]
	// [7,8], [11,12]

	// 0�� �ε������� �� - 1 ���� -> size - 1(�ݺ� Ƚ��)
	// 1�� �ε������� �� ���� -> size - 1(�ݺ� Ƚ��)

	// 4���� ������ �ε���
	// 1 = [0][0]
	// 2 = [0][1]
	// 5 = [1][0]
	// 6 = [1][1]

	// 2 = [0][1]
	// 3 = [0][2]
	// 6 = [1][1]
	// 7 = [1][2]

	// �ϴ� �� 4�� ã��
	for (int i = 0; i < rowsize; ++i)
	{
		for (int j = 0; j < columnsize; ++j)
		{
			num = array[i][j] + array[i][j + 1] + array[i + 1][j] + array[i + 1][j + 1];

			// �ּڰ� ���ϱ�
			if (num < minnum)
				minnum = num;

			// �ִ� ���ϱ�
			if (num > maxnum)
				maxnum = num;
		}
	}

	// �� ����
	answer.push_back(maxnum);
	answer.push_back(minnum);

	return answer;
}