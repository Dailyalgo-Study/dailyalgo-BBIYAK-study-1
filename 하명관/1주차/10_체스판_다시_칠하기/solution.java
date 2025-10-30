import java.io.*;
import java.util.*;

public class Solution {
    static int N, M;
    static char[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        int answer = Integer.MAX_VALUE;

        for (int sy = 0; sy <= N - 8; sy++) {
            for (int sx = 0; sx <= M - 8; sx++) {
                int repaintW = countIfStartWith(sx, sy, 'W'); 
                int cost = Math.min(repaintW, 64 - repaintW);
                answer = Math.min(answer, cost);
            }
        }

        System.out.println(answer);
    }

    static int countIfStartWith(int sx, int sy, char start) {
        int cnt = 0;
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                char expected = ((x + y) % 2 == 0) ? start : opposite(start);
                if (board[sy + y][sx + x] != expected) cnt++;
            }
        }
        return cnt;
    }

    static char opposite(char c) {
        return (c == 'W') ? 'B' : 'W';
    }
}