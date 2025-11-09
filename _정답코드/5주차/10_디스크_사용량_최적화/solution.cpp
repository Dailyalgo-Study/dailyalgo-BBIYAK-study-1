#include <vector>
using namespace std;

vector<int> mems_glob;
long long limit_glob;

long long getBackup(int x){
    long long sum = 0LL;
    for(int m : mems_glob){
        if(m > x){
            sum += (m - x);
        }
    }
    return sum;
}

int binary_search(int left, int right){
    if(left == right){
        return left;
    }
    
    int mid = (left + right) / 2;
    if(getBackup(mid) <= limit_glob){
        return binary_search(left, mid);
    } else {
        return binary_search(mid+1, right);
    }
}

int solution(long long limit, vector<int> mems) {
    limit_glob = limit;
    mems_glob = mems;
    
    return binary_search(0, 1000000);
}

