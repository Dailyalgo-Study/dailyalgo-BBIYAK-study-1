#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
	int answer = 0;

    sort(numbers.begin(),numbers.end());

    int size = numbers.size()/2;

    answer= numbers[size];

	return answer;
}
