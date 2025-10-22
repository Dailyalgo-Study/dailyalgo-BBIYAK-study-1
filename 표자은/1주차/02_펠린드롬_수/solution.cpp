#include <string>
#include <vector>
#include <iostream>

using namespace std;

bool solution(int n) {
    bool answer = true;

    string str = to_string(n);
    int nstr = str.size();
    cout << str << endl;
    for (int i = 0; i < nstr / 2 + 1; i++)
    {
        if (str[i] != str[nstr - i - 1]) return false;
    }
    return answer;
}
