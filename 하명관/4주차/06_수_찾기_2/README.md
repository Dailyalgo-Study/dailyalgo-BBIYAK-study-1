# 06. 수 찾기 2

## 1. 문제 정보

- [데일리알고 - 수 찾기 2](https://dailyalgo.kr/ko/problems/226)

## 2. 소요 시간

- 15분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

- 문제의 핵심은 내림차순으로 정렬된 배열에서 특정 값이 존재하는지 빠르게 판단하는 것이다.
- 단순 반복문으로 찾으면 O(N) 시간이 걸리지만, numbers의 길이가 최대 1,000,000이므로 이진 탐색(Binary Search) 을 사용해야 한다.
- 단, 배열이 내림차순으로 정렬되어 있으므로, 일반적인 오름차순 이진 탐색과 비교 조건을 반대로 설정해야 한다.

### ⚙️ 구현 로직의 동작 과정

1. 이진 탐색 초기화
    - 시작 인덱스 left = 0, 끝 인덱스 right = numbers.length - 1
2. 탐색 반복
    - 중간 인덱스 mid = (left + right) / 2
    - numbers[mid] == target이면 true 반환
    - 배열이 내림차순이므로
        - numbers[mid] < target이면 → right = mid - 1
        - numbers[mid] > target이면 → left = mid + 1
3. 탐색 종료
    - left가 right보다 커지면 배열에 target이 없으므로 false 반환

```java
public class Solution {
    public boolean solution(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                return true;
            }
            if (numbers[mid] < target) {
                right = mid - 1;  
            } else {
                left = mid + 1;   
            }
        }

        return false;
    }
}
```

### ✅ 엣지 케이스에 대한 고려 사항

- 배열 길이가 1인 경우 ([5], target=5) → 반드시 단일 값 비교 처리
- 배열 내 중복 값 존재 ([4,4,4], target=4) → 중복이어도 true 반환
- target이 가장 크거나 작은 경우 (target = 10 또는 target = -10) → 경계 인덱스에서 정상 작동해야 함

## 4. 어려웠던 점 및 해결 과정

- 오름차순 기준의 이진 탐색 로직을 그대로 사용하면 결과가 뒤바뀜.

## 5. 궁금한 점

- 문제를 보고 이진탐색을 활용한 문제인지 구별하는 방법이 궁금합니다.