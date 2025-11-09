#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
    int n = numbers.size();
    sort(numbers.begin(), numbers.end());
    return numbers[n / 2];
}
