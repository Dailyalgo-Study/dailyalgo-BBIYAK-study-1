#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

string solution(string hangul_numbers) {
    unordered_map<string, string> hangul_to_digit = {
        {"공", "0"}, {"하나", "1"}, {"둘", "2"}, {"셋", "3"}, {"넷", "4"},
        {"다섯", "5"}, {"여섯", "6"}, {"일곱", "7"}, {"여덟", "8"}, {"아홉", "9"},
        {"영", "0"}, {"일", "1"}, {"이", "2"}, {"삼", "3"}, {"사", "4"},
        {"오", "5"}, {"육", "6"}, {"칠", "7"}, {"팔", "8"}, {"구", "9"}
    };

    vector<string> hangul_numbers_key = vector<string>();
    hangul_numbers_key.push_back("일곱");
    for ( auto [k, v] : hangul_to_digit ) {
        if ( k == "일곱" ) {
            continue;
        }
        hangul_numbers_key.push_back(k);
    }
    
    for ( const string& hangul : hangul_numbers_key) {
        while(hangul_numbers.find(hangul) != string::npos ) {
            hangul_numbers.replace(hangul_numbers.find(hangul), hangul.length(), hangul_to_digit[hangul]);
        }
    }

	return hangul_numbers;
}
