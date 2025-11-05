#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr1, vector<int> arr2)
{
    // 1. 배열 합치기
    vector<int> answer = arr1;
    answer.insert(answer.end(), arr2.begin(), arr2.end());

    // 2. 정렬하기
    sort(answer.begin(), answer.end());

    return answer;
}