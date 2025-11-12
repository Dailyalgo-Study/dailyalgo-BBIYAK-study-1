#include <string>
#include <vector>

using namespace std;

bool solution(vector<int> numbers, int target) {
    int left = 0;
    int right = numbers.size() - 1;

    while (left <= right) 
    {
        int mid = (left + right) / 2;

        if (numbers[mid] == target) 
        {
            return true;
        } 
        else if (numbers[mid] < target) 
        {
            left = mid + 1; 
        } 
        else 
        {
            right = mid - 1; 
        }
    }

    return false;  
}