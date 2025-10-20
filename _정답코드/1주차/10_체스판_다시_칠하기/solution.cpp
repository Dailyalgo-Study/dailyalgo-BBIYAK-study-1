#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

int solution(int n, int m, vector<string> board) {
    int minRepaint = 64;
    
    for (int startRow = 0; startRow <= n - 8; startRow++) {
        for (int startCol = 0; startCol <= m - 8; startCol++) {
            int repaintW = 0; // 'W'로 시작하는 패턴
            int repaintB = 0; // 'B'로 시작하는 패턴
            
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    char current = board[startRow + i][startCol + j];
                    
                    // 'W'로 시작하는 체스판 패턴
                    char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B';
                    if (current != expectedW) repaintW++;
                    
                    // 'B'로 시작하는 체스판 패턴
                    char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W';
                    if (current != expectedB) repaintB++;
                }
            }
            
            minRepaint = min(minRepaint, min(repaintW, repaintB));
        }
    }
    
    return minRepaint;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    int n, m;
    cin >> n >> m;
    
    vector<string> board(n);
    for (int i = 0; i < n; i++) {
        cin >> board[i];
    }
    
    cout << solution(n, m, board) << endl;
    
    return 0;
}

