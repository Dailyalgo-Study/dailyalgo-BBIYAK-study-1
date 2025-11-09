#include <vector>
#include <unordered_map>
using namespace std;

int solution(vector<int> numbers){
    int n = numbers.size();
    unordered_map<int, int> sumCount;
    sumCount[numbers[0]] = 1;
    
    for (int i = 1; i < n; i++) {
        numbers[i] += numbers[i - 1];
        if (sumCount.find(numbers[i]) != sumCount.end()) {
            sumCount[numbers[i]]++;
        } else {
            sumCount[numbers[i]] = 1;
        }
    }
    
    int count = 0;
    for (auto& pair : sumCount) {
        int key = pair.first;
        int value = pair.second;
        if (key == 0) {
            count += value * (value + 1) / 2;
        } else {
            count += value * (value - 1) / 2;
        }
    }
    
    return count;
}

