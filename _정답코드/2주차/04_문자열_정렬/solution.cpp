#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> words) {
        sort(words.begin(), words.end(), greater<string>());
        return words;
}

