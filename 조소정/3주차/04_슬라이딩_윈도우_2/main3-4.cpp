#include <vector>
using namespace std;

vector<int> solution(vector<int> numbers, int window) {
    vector<int> result;
    int n = numbers.size();

    if (n < window) return result; 

    int sum = 0;

   
    for (int i = 0; i < window; i++)
    {
        sum += numbers[i];
    }
    result.push_back(sum);

   
    for (int i = window; i < n; i++) 
    {
        sum -= numbers[i - window]; 
        sum += numbers[i];          
        result.push_back(sum);
    }

    return result;
}