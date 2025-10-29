#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<vector<int>> array)
{
	vector<int> answer = {};

	int rowsize = array.size() - 1;
	int columnsize = array[0].size() - 1;

	// array의 원소는 -10,000 이상 10,000 이하의 정수
	int minnum = 10000;
	int maxnum = -10000;

	int num = 0;

	// 0번 행
	// [1,2], [5,6]
	// [2,3], [6,7]
	// [3,4], [7,8]

	// 1번 행
	// [5,6], [9,10]
	// [6,7], [10,11]
	// [7,8], [11,12]

	// 0번 인덱스부터 행 - 1 까지 -> size - 1(반복 횟수)
	// 1번 인덱스부터 열 까지 -> size - 1(반복 횟수)

	// 4개의 숫자의 인덱스
	// 1 = [0][0]
	// 2 = [0][1]
	// 5 = [1][0]
	// 6 = [1][1]

	// 2 = [0][1]
	// 3 = [0][2]
	// 6 = [1][1]
	// 7 = [1][2]

	// 일단 수 4개 찾기
	for (int i = 0; i < rowsize; ++i)
	{
		for (int j = 0; j < columnsize; ++j)
		{
			num = array[i][j] + array[i][j + 1] + array[i + 1][j] + array[i + 1][j + 1];

			// 최솟값 구하기
			if (num < minnum)
				minnum = num;

			// 최댓값 구하기
			if (num > maxnum)
				maxnum = num;
		}
	}

	// 값 저장
	answer.push_back(maxnum);
	answer.push_back(minnum);

	return answer;
}