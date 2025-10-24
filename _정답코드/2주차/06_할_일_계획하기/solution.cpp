#include <string>
#include <vector>

using namespace std;

bool cmp(vector<int> a, vector<int> b){
    return a[1] < b[1];
}

int solution(vector<vector<int>> tasks) {

    sort(tasks.begin(), tasks.end(), cmp);

    int count = 0;
    int current_time = 0;

    for(auto task : tasks){
        if(current_time <= task[0]){
            current_time = task[1];
            count += 1;
        }
    }
    return count;
}

