#include <string>
#include <vector>
#include <map>

using namespace std;

int solution(vector<string> jewels) {
    map<string, int> count; 
    int left = 0;           
    int n = jewels.size();
    int answer= 100001;   
    int type = 0;          

    for (int right = 0; right < n; right++) {
        string jewel = jewels[right];
        count[jewel]++;

       
        if (count[jewel] == 1) type++;

       
        while (type == 5) {
            int currentLen = right - left + 1;
            if (currentLen < answer) answer = currentLen;

          
            count[jewels[left]]--;
            if (count[jewels[left]] == 0) {
                type--; 
            }
            left++;
        }
    }

    return answer;
}