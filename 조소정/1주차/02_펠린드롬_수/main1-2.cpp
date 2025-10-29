#include <string>
#include <vector>

using namespace std;

bool solution(int n) {
    bool answer = true;


    string s = to_string(n);

   int length = s.size();
    for (int idx = 0; idx < s.size()/2; idx++)
    {
        if (s[idx] != s[length -1- idx])
        {
            return false;
        }
    }

    return answer;
}
