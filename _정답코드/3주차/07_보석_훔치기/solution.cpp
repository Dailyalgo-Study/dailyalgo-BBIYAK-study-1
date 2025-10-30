#include <vector>
#include <string>
#include <unordered_map>
using namespace std;

unordered_map<string, int> jewelCount;
vector<string> allJewels = {"Diamond", "Ruby", "Emerald", "Sapphire", "Gold"};

bool containAllJewels() {
    for (int i = 0; i < allJewels.size(); i++) {
        if (jewelCount[allJewels[i]] == 0) {
            return false;
        }
    }
    return true;
}

int solution(vector<string> jewels) {
    jewelCount.clear();
    for (int i = 0; i < allJewels.size(); i++) {
        jewelCount[allJewels[i]] = 0;
    }

    int n = jewels.size();
    int left = 0, right = 4;

    for (int i = 0; i < 5; i++) {
        string jewel = jewels[i];
        jewelCount[jewel]++;
    }

    int answer = n;

    while (left < n) {
        bool contain = containAllJewels();

        if (!contain && right < n - 1) {
            string addedJewel = jewels[right + 1];
            jewelCount[addedJewel]++;
            right++;
        } else {
            if (contain) {
                int window = right - left + 1;
                if (window < answer) {
                    answer = window;
                }
            }
            string removedJewel = jewels[left];
            jewelCount[removedJewel]--;
            left++;
        }
    }

    return answer;
}