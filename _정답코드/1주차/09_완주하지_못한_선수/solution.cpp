#include <string>
#include <vector>
#include <unordered_map>
using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    unordered_map<string, int> freq;
    
    for (int i = 0; i < participant.size(); i++) {
        freq[participant[i]]++;
    }
    
    for (int i = 0; i < completion.size(); i++) {
        freq[completion[i]]--;
    }
    
    for (auto pair : freq) {
        if (pair.second > 0) {
            return pair.first;
        }
    }
    
    return "";
}

