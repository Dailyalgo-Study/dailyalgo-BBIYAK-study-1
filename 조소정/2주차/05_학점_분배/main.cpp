#include <string>
#include <vector>

using namespace std;
vector<int> scores_glob;

bool cmp(int a, int b) {
    if(scores_glob[a] != scores_glob[b]) {
        return scores_glob[a] > scores_glob[b];
    }
    return a < b;
}

vector<string> solution(vector<int> scores) {
    scores_glob = scores;
    int n = scores.size();
    vector<int> numbers = vector<int>(n);
    for(int i=0; i<n; i++){
        numbers[i] = i;
    }

    sort(numbers.begin(), numbers.end(), cmp);
	
    vector<string> answer = vector<string>(n);
    for(int i=0; i<n; i++){
        int number = numbers[i];
        if(i < n/3){
            answer[number] = "A";
        } else if(i < 2*n/3){
            answer[number] = "B";
        } else {
            answer[number] = "C";
        }
    }
	return answer;
}

