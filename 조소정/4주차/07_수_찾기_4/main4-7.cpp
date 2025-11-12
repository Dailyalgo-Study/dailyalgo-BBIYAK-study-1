#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int target) {
    int answer = 0;
    int gap = 300000;
    int left = 0;
    int right = numbers.size() - 1;

    while (left <= right) 
    {
        int mid = (left + right) / 2;
        int compare;

        if (numbers[mid] >= target) 
        {
            compare = numbers[mid] - target;
        }
        else 
        {
            compare = target - numbers[mid];
        }

        if (numbers[mid] == target) 
        {
            return numbers[mid];
        } 

        if (compare < gap) 
        {
            gap = compare;
            answer = numbers[mid];
        }
        else if (compare == gap && numbers[mid] > answer) {
            answer = numbers[mid];
        }
        
        
        if (numbers[mid] < target) 
        {
            left = mid + 1; 

        }
        else
        {
            right = mid - 1; 

        }
    }
   
    return answer;
}
