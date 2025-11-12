# 08. 하노이 타워 2

## 1. 문제 정보

- [데일리알고 - 하노이 타워 2](https://dailyalgo.kr/ko/problems/214)

## 2. 소요 시간

- 25분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

- 핵심 아이디어는 n개의 원판을 한 번에 옮기는 문제”를 n-1개의 원판을 옮기는 문제로 쪼개는 것이다. (
- 원판 n개를 start → end로 옮기려면 다음 단계를 수행한다.
    1. 위에 있는 n-1개의 원판을 start → mid로 이동
    2. 가장 큰 원판(맨 아래)을 start → end로 이동
    3. 나머지 n-1개의 원판을 mid → end로 이동

이 세 단계를 재귀적으로 반복하면 전체 이동 순서를 구할 수 있다.

### ⚙️ 구현 로직의 동작 과정

1. 재귀 함수 정의
    - hanoi(n, start, mid, end) : n개의 원판을 start에서 end로 옮긴다.
    - n이 1일 경우, 원판 1개를 직접 이동시킨다 → [1, start, end]
2. 재귀 호출
    - hanoi(n-1, start, end, mid) : 상단 n-1개를 보조 기둥으로 이동
    - [n, start, end] : 가장 큰 원판을 목표 기둥으로 이동
    - hanoi(n-1, mid, start, end) : 보조 기둥에 있는 원판들을 최종 기둥으로 이동
3. 리스트에 이동 과정 저장
    - 각 이동은 [원판 크기, 출발 기둥, 도착 기둥] 형태로 저장한다.
4. 결과 반환
    - 모든 재귀 호출이 완료되면 이동 순서를 담은 리스트를 반환한다.

```java
import java.util.*;

public class Solution {
    private static List<int[]> result;

    public int[][] solution(int n) {
        result = new ArrayList<>();
        hanoi(n, 1, 2, 3);
        int[][] answer = new int[result.size()][3];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    private void hanoi(int n, int start, int mid, int end) {
        if (n == 1) {
            result.add(new int[]{1, start, end});
            return;
        }
        hanoi(n - 1, start, end, mid);
        result.add(new int[]{n, start, end});
        hanoi(n - 1, mid, start, end);
    }
}
```

### ✅ 엣지 케이스에 대한 고려 사항

- n=1일 때는 재귀가 더 진행되지 않아야 하며, [1, 1, 3] 한 단계만 수행해야 한다

## 4. 어려웠던 점 및 해결 과정

- 처음에는 mid(보조 기둥)의 역할이 헷갈렸지만, 목표 기둥을 제외한 나머지 하나가 항상 보조 기둥임을 알고 나서 규칙이 명확해졌다.
- 각 이동 과정을 배열 [n, start, end]로 저장하는 방식이 직관적이지만, 재귀 호출 순서가 꼬이지 않도록 함수 호출 순서를 정확히 지키는 것이 중요했다.

## 5. 궁금한 점

- n이 커질수록 시간복잡도가 올라갈것같은데 괜찮을까요