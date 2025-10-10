#include <string>

using namespace std;

string solution(int year) {
    if (year % 400 == 0) {
        return "YES";
    } else if (year % 100 == 0) {
        return "NO";
    } else if (year % 4 == 0) {
        return "YES";
    } else {
        return "NO";
    }
}

