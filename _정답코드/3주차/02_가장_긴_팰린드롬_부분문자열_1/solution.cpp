#include <string>
using namespace std;

string textGlob;

bool isPalin(int left, int right) {
    int n = right - left + 1;
    
    for (int i = 0; i < n; i++) {
        if (textGlob[left + i] != textGlob[right - i]) {
            return false;
        }
    }

    return true;
}

int solution(string text) {
    textGlob = text;
    int n = text.size();
    int answer = 0;

    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            if (isPalin(i, j) && answer < (j - i + 1)) {
                answer = j - i + 1;
            }
        }
    }

    return answer;
}

