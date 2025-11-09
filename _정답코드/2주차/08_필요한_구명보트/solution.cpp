#include <string>
#include <vector>

using namespace std;

int solution(int limit, vector<int> people) {
    sort(people.begin(), people.end());

	int answer = 0;
    int passed = 0;
    while (passed < people.size()){
        if(people[passed] + people[people.size()-1] <= limit){
            passed += 1;
        }
        answer += 1;
        people.pop_back();
    }
	return answer;
}

