#include <string>
#include <vector>

using namespace std;

bool cmp(string& a, string& b){
    return (a+b) > (b+a);
}

string solution(vector<int> numbers) {
    vector<string> strNumbers = vector<string>();
    for(int num : numbers){
        strNumbers.push_back(to_string(num));
    }

    sort(strNumbers.begin(), strNumbers.end(), cmp);

	string answer = "";
    for(string strNum : strNumbers){
        answer += strNum;
    }

    if(answer[0] == '0'){
        answer = "0";
    }
	return answer;
}

