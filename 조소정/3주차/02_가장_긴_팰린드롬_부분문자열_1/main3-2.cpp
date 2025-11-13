#include <string>
#include <vector>

using namespace std;

int solution(string text) {
	int answer = 0;

    for(int idx = 0; idx<text.size(); idx++)
    {
        for(int idx2 = idx; idx2<text.size(); idx2++)
        {
            bool check = true;
            int front = idx;
            int end = idx2;
            while(front<end)
            {
                if(text[front]!=text[end])
                {
                    check = false;
                    break;
                }
                front++;
                end--;
            }

            if(check)
            {
                
                if(idx2 - idx+1 > answer)
                {
                    answer = idx2-idx+1;
                }
            }
        }
    }

	return answer;
}