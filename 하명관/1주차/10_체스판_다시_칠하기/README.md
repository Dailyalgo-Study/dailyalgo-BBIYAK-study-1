# **10. 체스판 다시 칠하기**

## **1. 문제 정보**

- [백준 - 체스판 다시 칠하기](https://www.acmicpc.net/problem/1018)

## **2. 소요 시간**

- 25분

## **3. 풀이 설명**

### **💡 아이디어 도출 과정**

> 문제를 어떻게 이해했고, 어떤 접근 방법을 떠올렸는지 설명합니다.
> 

원본 보드(N×M)에서 가능한 모든 8×8 부분 보드를 검사합니다.

8×8 체스판은 두 가지 시작 패턴뿐입니다:

- 왼쪽 위가 W로 시작하는 패턴
- 왼쪽 위가 B로 시작하는 패턴

어떤 8×8 구간에 대해 “W 시작”으로 칠해야 하는 칸 수를 cnt라 하면, B 시작으로 칠해야 하는 칸 수는 64 - cnt 입니다(서로 완전히 반대 패턴) 따라서 min(cnt, 64 - cnt)가 그 구간의 최소 칠하기 수.

모든 시작 좌표에 대해 위 값을 계산하고 최소값을 정답으로 선택.

### **⚙️ 구현 로직의 동작 과정**

> 구현한 코드가 어떤 방식으로 동작하는지, 각 단계별로 설명합니다.
> 
1. **입력 파싱**: N, M과 보드 문자열 N줄을 읽어 char[][] board에 저장.
2. **모든 8×8 시작점 순회**: 시작 좌표 (sy, sx)를 0 ≤ sy ≤ N-8, 0 ≤ sx ≤ M-8 범위로 순회.
3. **필요 칠하기 수 계산**:
    - “W 시작” 기준으로 8×8 전체를 보며,
        
        (x + y)의 짝홀에 따라 기대 색을 W/B 번갈아 계산하고 불일치 개수 cntW 집계.
        
    - 해당 구간 최소 비용은 min(cntW, 64 - cntW).
4. **전체 최소 갱신**: 모든 구간 중 최소값을 정답으로 출력.

### **✅ 엣지 케이스에 대한 고려 사항**

```java
import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < M; j++) board[i][j] = line.charAt(j);
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
```

> 문제 해결 시 고려해야 할 특수한 경우들과 그에 대한 처리 방법을 설명합니다.
> 

## **4. 어려웠던 점 및 해결 과정**

- 처음엔 W 시작과 B 시작 두 번 모두 계산하려 했으나, 64 - cnt임을 떠올려 한 번만 계산하도록 최적화하여 코드와 시간을 단순화했습니다.

## **5. 궁금한 점**

- 더 단순한 풀이가 있는 지 궁금합니다.