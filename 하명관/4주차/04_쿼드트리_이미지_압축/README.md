# 09. 쿼드트리 이미지 압축

## 1. 문제 정보

- [데일리알고 - 쿼드트리 이미지 압축](https://dailyalgo.kr/ko/problems/217)

## 2. 소요 시간

- 40분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

- 현재 영역이 모두 동일한 값(0 또는 1)이라면 그대로 반환하고, 아니라면 4개의 영역으로 나눈 후 각각 재귀적으로 처리해야 한다.
- 쿼드트리의 순서는 항상 왼쪽 위 → 오른쪽 위 → 왼쪽 아래 → 오른쪽 아래로 고정되어 있다.
- 따라서, compress(x, y, size) 형태로 함수를 정의하고,
    - (x, y)는 현재 영역의 시작 좌표,
    - size는 현재 영역의 한 변의 길이를 의미하도록 하면 재귀 구조가 간단해진다.

### ⚙️ 구현 로직의 동작 과정

1. 재귀 함수 정의
    - compress(x, y, size) : (x, y)를 시작으로 하는 size × size 구역을 압축한다.
2. 기저 조건 (Base Case)
    - 구역 내 모든 값이 같으면 그 값을 문자열로 반환한다.
3. 분할 단계
    - 구역 내 값이 섞여 있다면, 4개의 하위 구역으로 분할하여 각각 compress를 호출한다.
    - 호출 순서는 반드시 왼쪽 위 → 오른쪽 위 → 왼쪽 아래 → 오른쪽 아래 순서로 해야 한다.
    - 각 결과를 이어붙인 후, 전체를 괄호로 감싼 문자열을 반환한다.
4. 최종 결과
    - 전체 이미지(8×8)를 compress(0, 0, 8)로 호출한 결과를 반환한다.

```java
public class Solution {
    private static int[][] img;

    public String solution(int[][] image) {
        img = image;
        return compress(0, 0, image.length);
    }

    private String compress(int x, int y, int size) {
        if (isSame(x, y, size)) {
            return String.valueOf(img[x][y]);
        }

        int newSize = size / 2;

        String topLeft = compress(x, y, newSize);
        String topRight = compress(x, y + newSize, newSize);
        String bottomLeft = compress(x + newSize, y, newSize);
        String bottomRight = compress(x + newSize, y + newSize, newSize);

        return "(" + topLeft + topRight + bottomLeft + bottomRight + ")";
    }

    private boolean isSame(int x, int y, int size) {
        int first = img[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (img[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}
```

### ✅ 엣지 케이스에 대한 고려 사항

- 모든 원소가 0 또는 1로 동일한 경우 → "0" 혹은 "1"만 반환되어야 함.
- 섞여 있는 경우 괄호 구조가 중첩되더라도 정확한 순서로 이어붙어야 함.
- size가 1이 되어도 정상 동작해야 함 (즉, 최소 단위까지 분할 가능).

## 4. 어려웠던 점 및 해결 과정

- 문제 이해가 어려워서 AI를 사용해서 풀었습니다.

## 5. 궁금한 점

- 분할 정복에 대해 더 공부해봐야 할 것 같습니다.