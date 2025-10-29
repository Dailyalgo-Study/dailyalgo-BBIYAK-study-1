#include <string>
#include <vector>

using namespace std;

int solution(vector<int> target, int k)
{
    int answer = 0;
    //int n = target.size();
    int targetnum = 1;

    // k만큼 반복하기
    // 지목 당한 사람 번호 구하기 (어떻게?)

    while (k > 0)
    {
        //for (int i = 0; i <= n; ++i)
        //{
            targetnum = target[targetnum - 1];

            //printf("targetnum = %d \n", targetnum);
        //}

        --k;
    }

    return targetnum;
}