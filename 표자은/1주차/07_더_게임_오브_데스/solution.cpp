#include <string>
#include <vector>
#include <iostream>
using namespace std;

struct Node
{
    int key;
    Node* next;
    
    Node(): key(-1), next(nullptr) {}
};

int solution(vector<int> target, int k) {
	int answer = 0;
    int ntarget = target.size();

    vector<Node> vecN(ntarget);
    for (int i=1; i<ntarget+1; i++)
    {
        vecN[i-1].key = i;
        vecN[i-1].next = &vecN[target[i-1]-1];
    }

    Node currNode = *vecN[0].next;
    for (int i=1; i<k; i++)
    {
        //cout << currNode.key << endl;
        currNode = *(currNode.next); 
        //cout << currNode.key << endl;
    }

	return currNode.key;
}
