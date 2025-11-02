#include <string>
#include <vector>


using namespace std;

int solution(vector<int> sides) {
    int answer = 0;

    for (int idx = 0; idx < sides.size(); idx++)
    {

        for (int idx2 = idx + 1; idx2 < sides.size(); idx2++)
        {

            for (int idx3 = idx2 + 1; idx3 < sides.size(); idx3++)
            {

                if (sides[idx] + sides[idx2] > sides[idx3] && sides[idx2] + sides[idx3] > sides[idx] && sides[idx3] + sides[idx] > sides[idx2])
                {
                    if (answer <= 0)
                    {
                        answer = sides[idx] + sides[idx2] + sides[idx3];
                    }
                    else if (answer > sides[idx] + sides[idx2] + sides[idx3])
                    {
                        answer = sides[idx] + sides[idx2] + sides[idx3];
                    }

                }

            }
        }
    }




    return answer;
}
