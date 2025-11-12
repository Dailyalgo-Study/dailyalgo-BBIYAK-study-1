# 07 피보나치 수 2

## 1. 문제 정보

- [데일리알고 - 피보나치 수 2](https://dailyalgo.kr/ko/problems/209)

## 2. 소요 시간

- 10분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

- 문제에서 요구하는 것은 n번째 피보나치 수 자체가 아니라, 재귀 호출 과정에서 fibo(1)과 fibo(2)가 각각 몇 번 호출되는지를 세는 것이다
- 따라서 실제로 피보나치 값을 구하는 것보다 재귀 호출 시점에 호출 횟수를 카운트하는 방식으로 접근해야 한다.

### ⚙️ 구현 로직의 동작 과정

1. count1, count2 두 개의 전역 변수를 선언하여 각각 fibo(1)과 fibo(2)가 호출된 횟수를 저장한다.
2. fibo(n)이 호출될 때,
    - n이 1이면 count1++
    - n이 2이면 count2++
    - n이 3 이상이면 fibo(n-1) + fibo(n-2)를 재귀 호출한다.
3. 최종적으로 solution 함수에서는 fibo(n)을 실행한 뒤, [count1, count2] 형태의 배열을 반환한다.

```
public class Solution {
    static int count1 = 0;
    static int count2 = 0;

    public int[] solution(int n) {
        fibo(n);
        int[] answer = {count1, count2};
        return answer;
    }

    private int fibo(int n) {
        if (n == 1) {
            count1++;
            return 1;
        } else if (n == 2) {
            count2++;
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
```

### ✅ 엣지 케이스에 대한 고려 사항

- n이 1일 경우, fibo(1)만 호출되므로 [1, 0]이 아닌 [0, 1]이 되어야 한다는 점에 주의한다.
- n이 2일 경우, fibo(2)만 한 번 호출되므로 [0, 1]을 반환해야 한다.

## 4. 어려웠던 점 및 해결 과정

- 처음에는 단순히 피보나치 수를 계산하는 문제라고 생각했지만, 호출 횟수를 세야 한다는 점에서 전역 변수 사용이 필수적이었다.
- 호출 순서와 카운트 로직이 헷갈릴 수 있으므로 base case(n=1, n=2)에서 정확히 한 번씩만 증가하도록 주의했다.

## 5. 궁금한 점

- 없습니다.