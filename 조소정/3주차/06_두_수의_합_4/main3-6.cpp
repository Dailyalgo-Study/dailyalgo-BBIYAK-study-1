#include <vector>
using namespace std;

vector<int> solution(vector<int> numbers, int target) {
    int left = 0;                      
    int right = numbers.size() - 1;   
    vector<int> answer = {-1, -1};     
    int minDiff = 2001;               

    
    while (left < right) {
        int sum = numbers[left] + numbers[right]; 

        if (sum == target) 
        {
            int diff = numbers[right] - numbers[left]; 
          
            if (diff < minDiff) {
                minDiff = diff;
                answer[0] = numbers[left];
                answer[1] = numbers[right];
            }
            left++;
        }
        else if (sum < target) 
        {
            left++;
        }
        else 
        {
        
            right--;
        }
    }

    return answer;
}