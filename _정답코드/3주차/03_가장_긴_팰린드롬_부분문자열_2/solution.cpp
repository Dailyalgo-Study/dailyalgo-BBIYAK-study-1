#include <string>
using namespace std;

string textGlob;
int lenGlob;

int getMaxPalinSize(int left, int right) {
    while (left - 1 >= 0 && right + 1 < lenGlob && textGlob[left - 1] == textGlob[right + 1]) {
        left--;
        right++;
    }
    return right - left + 1;
}

int solution(string text) {
    textGlob = text;
    lenGlob = text.size();
    int answer = 0;

    for (int i = 0; i < lenGlob; i++) {
        int temp = getMaxPalinSize(i, i);
        if (temp > answer) {
            answer = temp;
        }
    }

    for (int i = 0; i < lenGlob - 1; i++) {
        if (text[i] == text[i + 1]) {
            int temp = getMaxPalinSize(i, i + 1);
            if (temp > answer) {
                answer = temp;
            }
        }
    }

    return answer;
}

