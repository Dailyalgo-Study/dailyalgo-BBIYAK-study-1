# 10. 쿼드트리 이미지 복원

## 1. 문제 정보

- [데일리알고 - 쿼드트리 이미지 복원](https://dailyalgo.kr/ko/problems/218)

## 2. 소요 시간

- 40분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

- 쿼드트리 이미지 압축 문제의 역과정이다.
- 입력으로 주어지는 문자열은 쿼드트리 압축 결과이며, 이를 해석해서 8×8 이차원 배열 형태의 이미지로 복원해야 한다.
- 즉, (1(011(1101))(0111)0) 같은 문자열을 읽으면서
    - "0" → 모두 0으로 채워진 구역
    - "1" → 모두 1로 채워진 구역
    - "(" → 4분할 구조 시작
    - ")" → 4분할 구조 끝
        
        로 인식해야 한다.
        
- 압축과 반대로, 재귀적으로 문자열을 해석하며 해당 좌표 범위를 채워 넣는 구조가 필요하다.

### ⚙️ 구현 로직의 동작 과정

1. 전역 변수와 인덱스 포인터 정의
    - 문자열을 한 글자씩 읽어야 하므로, static int idx를 두어 현재 탐색 위치를 전역적으로 관리한다.
2. 재귀 복원 함수 정의
    - decompress(x, y, size) : (x, y) 좌표부터 size×size 영역을 복원한다.
    - 현재 문자가 '0' 또는 '1'이면 해당 영역을 전부 그 값으로 채운다.
    - '('이면 4개의 하위 영역으로 재귀적으로 복원한다.
        - 순서: 왼쪽 위 → 오른쪽 위 → 왼쪽 아래 → 오른쪽 아래
        - 4개 영역을 채운 뒤 ')' 문자를 만나면 한 단계 복원이 종료된다.
3. 최종 복원 결과 반환
    - 복원된 int[][] img를 반환한다.

```java
public class Solution {
    private static int[][] img;
    private static String input;
    private static int idx;

    public int[][] solution(String compressed) {
        img = new int[8][8];
        input = compressed;
        idx = 0;
        decompress(0, 0, 8);
        return img;
    }

    private void decompress(int x, int y, int size) {
        char c = input.charAt(idx++);

        // 현재 영역이 모두 같은 값인 경우
        if (c == '0' || c == '1') {
            int val = c - '0';
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    img[i][j] = val;
                }
            }
            return;
        }

        // 4분할된 경우 '(' 이후 4개의 영역 복원
        int newSize = size / 2;
        decompress(x, y, newSize);                     // 왼쪽 위
        decompress(x, y + newSize, newSize);           // 오른쪽 위
        decompress(x + newSize, y, newSize);           // 왼쪽 아래
        decompress(x + newSize, y + newSize, newSize); // 오른쪽 아래
        idx++; // ')' 스킵
    }
}
```

### ✅ 엣지 케이스에 대한 고려 사항

- 괄호의 순서가 정확해야 하므로 idx++ 처리 위치를 잘못 두면 복원이 어긋난다.
- 문제에서 크기가 항상 8×8로 고정되어 있으므로 size는 항상 8에서 시작한다.

## 4. 어려웠던 점 및 해결 과정

- 영역을 나눠 재귀를 하는 부분이 어려웠다.

## 5. 궁금한 점

- 마찬가지로 재귀 문제를 더 풀어봐야겠다.