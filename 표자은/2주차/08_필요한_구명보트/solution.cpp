#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(int limit, vector<int> people) {
    int answer = 0;
    // �����ϰ�
    sort(people.begin(), people.end());
    auto sit = people.begin();
    auto eit = people.end() - 1;
    //cout << *eit << endl;
    // �׻� �� �հ� �� ���� ¦������ �Ǵ°� ����
    while (sit < eit)
    {
        if (*sit + *eit <= limit)
        {
            answer++;
            //cout << *sit << " " << *eit << endl;
            sit++;
            eit--;
        }
        else
        {
            answer++;
            //cout << *eit << endl;
            eit--;
        }
    }
    if (sit == eit)
    {
        answer++;
        //cout << "sit=eit " << *sit;
    }
    return answer;
}
