#include <string>
#include <vector>
#include <cmath>
#include <algorithm>
#include <iostream>
using namespace std;

int solution(int n, int m) {
    int sn = sqrt(n);
    int sm = sqrt(m);
    cout << "n " << n << " m " << m << endl;
    cout << "sn " << sn << " sm " << sm << endl;

    if (sn * sn == n && sm * sm == m)
    {
        return sm - sn + 1;
    }
    else if (sn * sn == n)
    {
        return sm - sn + 1;
    }
    else if (sm * sm == m)
    {
        return sm - sn;
    }
    else
    {
        return sm - sn;
    }
}
