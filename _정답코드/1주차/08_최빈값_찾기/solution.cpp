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
    for (auto& [k, v] : freq) {
        if (v > maxfreq) {
            maxfreq = v;
            result = k;
        } else if (v == maxfreq && result > k) {
            result = k;
        }
    }
    return result;
}