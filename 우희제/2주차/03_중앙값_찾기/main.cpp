#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> numbers)
{
    int index = numbers.size() / 2;

    sort(numbers.begin(), numbers.end());

    return numbers[numbers.size() / 2];
}
