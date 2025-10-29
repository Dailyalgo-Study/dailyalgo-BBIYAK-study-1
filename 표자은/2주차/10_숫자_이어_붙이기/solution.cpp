#include <string>
#include <vector>
#include <iostream>
using namespace std;

string solution(vector<int> numbers) {
    string answer = "";
    vector<string> snumbers;
    for (int n : numbers)
    {
        string sn = to_string(n);
        snumbers.push_back(sn);
    }
    sort(snumbers.begin(), snumbers.end(), [](string a, string b) {
        int as = a.size();
        int bs = b.size();
        string atemp = a;
        if (as > bs)
        {
            for (int i = 0; i < as - bs; i++) b += "0";
        }
        else
        {
            for (int i = 0; i < as - bs; i++) a += "0";
        }
        if (a == b)
        {
            if (as > bs) return b > a;
            else a > b;
        }
        return a > b;
        //return a[0] > b[0];
        });
    for (string sn : snumbers)
    {
        answer += sn;
    }
    answer = to_string(stoi(answer));
    return answer;
}
