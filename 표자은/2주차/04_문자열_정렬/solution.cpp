#include <string>
#include <vector>
#include <iostream>
using namespace std;

vector<string> solution(vector<string> words) {
	sort(words.begin(), words.end(), greater<string>());
	return words;
}
