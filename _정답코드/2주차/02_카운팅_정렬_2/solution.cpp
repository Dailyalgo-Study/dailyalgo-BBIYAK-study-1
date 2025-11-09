#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> count = vector<int>(2001, 0);
	vector<int> answer = vector<int>(numbers.size());

    for(int num : numbers){
        count[num+1000] += 1;
    }

    for(int idx = 1; idx < 2001; idx++){
        count[idx] += count[idx-1];
    }

    for(int num : numbers){
        answer[count[num+1000] - 1] = num;
        count[num+1000] -= 1;
    }
	return answer;
}

