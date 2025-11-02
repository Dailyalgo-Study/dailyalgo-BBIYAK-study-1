#include <string>
#include <vector>

using namespace std;


int solution(vector<int> target, int k) {
    int answer = 0;

    int n = 0;
    for (int idx = 0; idx < k; idx++)
    {
       
        answer = target[n];
        n = target[n]-1;
  
    }


    return answer;
}
