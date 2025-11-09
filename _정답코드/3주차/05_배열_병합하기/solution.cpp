#include <vector>
using namespace std;

vector<int> solution(vector<int> arr1, vector<int> arr2) {
    int len1 = arr1.size();
    int len2 = arr2.size();
    int idx1 = 0, idx2 = 0;
    vector<int> answer;

    while (idx1 < len1 && idx2 < len2) {
        if (arr1[idx1] < arr2[idx2]) {
            answer.push_back(arr1[idx1]);
            idx1++;
        } else {
            answer.push_back(arr2[idx2]);
            idx2++;
        }
    }

    while (idx1 < len1) {
        answer.push_back(arr1[idx1]);
        idx1++;
    }

    while (idx2 < len2) {
        answer.push_back(arr2[idx2]);
        idx2++;
    }

    return answer;
}

