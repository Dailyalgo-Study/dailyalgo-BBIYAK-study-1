#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers) {


    for(int idx = 0; idx<numbers.size(); idx++)
    {
        for(int idx2=0; idx2<numbers.size()-idx-1; idx2++)
        {
            if(numbers[idx2]<numbers[idx2+1])
            {
                int temp = numbers[idx2+1];
                numbers[idx2+1] = numbers[idx2];
                numbers[idx2] = temp;
            }
        }
    }


	return numbers;
}
