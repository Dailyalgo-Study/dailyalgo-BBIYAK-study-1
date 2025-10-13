#include <vector>
#include <string>
using namespace std;
bool solution(int n) {
    string s = to_string(n);
    string rev;
    for(int i = s.size() - 1; i >= 0; --i) rev.push_back(s[i]);
    return s == rev;
}