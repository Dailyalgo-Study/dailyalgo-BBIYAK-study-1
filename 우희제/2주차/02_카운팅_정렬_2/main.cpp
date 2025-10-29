#include <string>
#include <vector>

using namespace std;

// 카운팅 정렬 만들기
// 1. 각 원소의 빈도수 구하기
// 2. 누적합 구하기
// 3. 숫자 정렬

// 주의 : 범위에 음수가 나올 경우

vector<int> solution(vector<int> numbers)
{
    int max = numbers[0];
    int min = numbers[0];

    // numbers의 최소, 최대 수 구하기
    for (int num : numbers)
    {
        if (num < min)
        {
            min = num;
        }

        if (num > max)
        {
            max = num;
        }
    }

    // 최소 ~ 최대 범위의 배열 초기화 -> 음수가 나올 경우
    vector<int> arr(max - min + 1);
    vector<int> counting(numbers.size());

    // 각 원소의 빈도 수 구하기
    for (int num : numbers)
        arr[num - min]++;

    // 누적합 구하기
    for (int i = 1; i < arr.size(); ++i)
    {
        arr[i] += arr[i - 1];
    }

    // 뒤에서부터 값 채우기
    for (int i = numbers.size() - 1; i >= 0; --i)
    {
        int num = numbers[i];
        arr[num - min]--;
        counting[arr[num - min]] = num;
    }

    // while문으로 바꿔보기
    /*int i = numbers.size() - 1;

    while (i >= 0)
    {
        int num = numbers[i];
        arr[num - min]--;
        counting[arr[num - min]] = num;

        --i;
    }*/

    return counting;
}