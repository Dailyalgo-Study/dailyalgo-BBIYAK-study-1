#include <string>
#include <vector>

using namespace std;

int solution(int n, int m)
{
	int answer = 0;
	int i = n;

	// 1. n부터 m까지 숫자를 뽑는다.
	// 2. 숫자를 나누었을 때 나눈 수와 값이 같은 수를 구한다.
	// 3. 같다면 answer를 증가 시킨다.

	// 4번 케이스 타임 아웃
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


	// 2중 반복문을 사용하여 타임 오류를 해결하기 위해 반복문을 분리한 버전
	 /*int i = 1;

	 // 1. 제일 작은, 첫번째 완전제곱수를 구한다.
	 while (i * i < n)
	 {
	     ++i;
	 }

	 // 2. 첫 제곱근 i부터 m까지 완전제곱수의 개수를 구한다.
	 for (; i * i <= m; ++i)
	 {
	     ++answer;
	 }*/


	// 두번째 문제를 하나의 반복문으로 바꿔보기
	for (int i = 1; i * i <= m; ++i)
	{
		// i의 제곱이 m까지 반복하면서 n 이상일 경우만 카운트한다.
		if (i * i >= n)
		{
			++answer;
		}
	}

	return answer;
}