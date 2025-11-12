#include <string>
#include <vector>

using namespace std;

double solution(int n) {
    double answer = 0;

    double root = sqrt(n);
    answer = round(root * 1000) / 1000.0; 

    return answer;
}
