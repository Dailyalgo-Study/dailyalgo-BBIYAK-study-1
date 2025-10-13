#include <vector>
#include <string>
#include <map>
using namespace std;

int solution(vector<int> numbers) {
    map<int, int> freq;
    for (int i = 0; i < numbers.size(); i++) {
        int num = numbers[i];
        freq[num]++;
    }
    
    int maxfreq = 0, result = 0;
    for (auto& pair : freq) {
        if (pair.second > maxfreq) {
            maxfreq = pair.second;
            result = pair.first;
        }
    }
    return result;
}