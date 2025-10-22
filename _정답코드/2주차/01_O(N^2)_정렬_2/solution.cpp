#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers) {
	int n = numbers.size();
    vector<int> answer = {};

    for (int iter=0; iter<n; iter++){
        int max_value = -99999;
        int max_idx = -1;

        for(int idx=0; idx < numbers.size(); idx++){
            if (numbers[idx] > max_value) {
                max_value = numbers[idx];
                max_idx = idx;
            }
        }
        
        answer.push_back(max_value);
        numbers.erase(numbers.begin() + max_idx);
    }
	return answer;
}

