#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers) {

    // for(int idx =0; idx<numbers.size(); idx++)
    // {
    //     int min = idx;
    //     for(int idx2 = idx+1; idx2<numbers.size(); idx2++)
    //     {
    //         if(numbers[idx2]<numbers[min])
    //         {
    //             min = idx2;
    //         }
    //     }

    //     int temp = numbers[min];
    //     numbers[min]=numbers[idx];
    //     numbers[idx]=temp;
    // }

    sort(numbers.begin(),numbers.end());
	return numbers;
}
