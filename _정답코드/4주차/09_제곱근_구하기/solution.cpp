#include <cmath>
using namespace std;

double round_val(double x){
    return round(x * 1000.0) / 1000.0;
}

double sqrt_func(double left, double right, int target){
    if(round_val(left) == round_val(right)){
        return round_val(left);
    }
    
    double mid = (left + right) / 2.0;
    if(mid * mid <= target){
        return sqrt_func(mid, right, target);
    } else {
        return sqrt_func(left, mid, target);
    }
}

double solution(int n) {
    return sqrt_func(0.0, n+1.0, n);
}

