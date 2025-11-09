#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> solution(vector<string> words)
{
    //sort(words.begin(), words.end(), greater<>());

    // 1. sort 함수를 이용해 정렬하기
    sort(words.begin(), words.end());

    // 2. reverse 함수를 이용해 내림차순으로 바꾸기
    reverse(words.begin(), words.end());

    return words;
}