#include <string>
#include <vector>
#include <iostream>
using namespace std;

vector<int> solution(vector<int> numbers) {
    int n = numbers.size();
    //cout << "size " << n << endl;
    for (int i = n - 1; i > 0; i--)
    {
        for (int j = 0; j < i; j++)
        {
            //cout << "change index " << j << " " << j+1 << endl;
            if (numbers[j] < numbers[j + 1])
            {
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
            }
        }
        //cout << endl;
    }

    return numbers;
}
