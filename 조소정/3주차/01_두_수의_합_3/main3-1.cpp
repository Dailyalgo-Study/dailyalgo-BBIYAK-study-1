#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int target) {
	int answer = 0;
    int front = 0;
    int end = numbers.size()-1;
   while(front<end)
    {
        if(numbers[front]+numbers[end]<target)
        {
            front++;
        }
        else if(numbers[front]+ numbers[end] == target)
        {
            if(numbers[front]==numbers[end])
            {
                int n = end - front +1;
                answer += n*(n-1)/2;
                break;
            }
            answer++;
            front++;
            end--;
        }
        else 
        {
            end--;
        }
    }
	return answer;
}
