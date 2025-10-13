#include <vector>
#include <string>
#include <map>
using namespace std;

string solution(string hangul_numbers) {
    map<string, string> hangul_to_digit = {
        {"공", "0"}, {"하나", "1"}, {"둘", "2"}, {"셋", "3"}, {"넷", "4"},
        {"다섯", "5"}, {"여섯", "6"}, {"일곱", "7"}, {"여덟", "8"}, {"아홉", "9"},
        {"영", "0"}, {"일", "1"}, {"이", "2"}, {"삼", "3"}, {"사", "4"},
        {"오", "5"}, {"육", "6"}, {"칠", "7"}, {"팔", "8"}, {"구", "9"}
    };
    
    string result = hangul_numbers;
    
    for (auto pair : hangul_to_digit) {
        size_t pos = 0;
        while ((pos = result.find(pair.first, pos)) != string::npos) {
            result.replace(pos, pair.first.length(), pair.second);
            pos += pair.second.length();
        }
    }
    
    return result;
}