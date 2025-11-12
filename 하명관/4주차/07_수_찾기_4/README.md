# 07. 수 찾기 4

## 1. 문제 정보

- [데일리알고 - 수 찾기 4](https://dailyalgo.kr/ko/problems/228)

## 2. 소요 시간

- 25분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

- 배열이 오름차순으로 정렬되어 있으므로, 특정 수 target을 빠르게 찾기 위해 이진 탐색(Binary Search) 을 사용할 수 있다.
- target이 배열에 존재하면 그대로 반환하면 된다.
- 존재하지 않으면,
    - target이 들어갈 위치를 찾은 뒤(insertion point),
    - 그 앞과 뒤에 있는 원소 중 target과의 절대값 차이가 작은 쪽을 선택한다.
    - 만약 차이가 같다면 **더 큰 수**를 반환한다.

### ⚙️ 구현 로직의 동작 과정

1. 이진 탐색으로 탐색 범위 결정
    - left = 0, right = numbers.length - 1
    - while (left <= right) 루프를 돌며 mid = (left + right) / 2
    - numbers[mid] == target → target 반환
    - numbers[mid] < target → left = mid + 1
    - numbers[mid] > target → right = mid - 1
2. 탐색 후 후보 결정
    - 탐색이 끝나면 left는 target보다 큰 첫 번째 값의 인덱스,
        
        right는 target보다 작은 마지막 값의 인덱스가 된다.
        
    - 따라서 두 후보는 numbers[left]와 numbers[right].
    - 경계값(left 또는 right가 범위를 벗어나는 경우)을 고려해야 한다.
3. 절대값 비교 후 반환
    - 두 후보의 차이를 비교해서 더 작은 차이를 가진 값을 선택한다.
    - 같으면 더 큰 값을 반환한다.

```java
public class Solution {
    public int solution(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                return target;
            }
            if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 후보 값 결정
        int leftVal = (right >= 0) ? numbers[right] : Integer.MIN_VALUE;
        int rightVal = (left < numbers.length) ? numbers[left] : Integer.MAX_VALUE;

        // 범위에 따라 처리
        if (leftVal == Integer.MIN_VALUE) return rightVal;
        if (rightVal == Integer.MAX_VALUE) return leftVal;

        int diffL = Math.abs(target - leftVal);
        int diffR = Math.abs(target - rightVal);

        if (diffL < diffR) return leftVal;
        if (diffL > diffR) return rightVal;
        return Math.max(leftVal, rightVal);
    }
}
```

### ✅ 엣지 케이스에 대한 고려 사항

- target이 배열의 최솟값보다 작은 경우 → 첫 번째 원소 반환
- target이 배열의 최댓값보다 큰 경우 → 마지막 원소 반환
- 중복 원소가 많은 경우에도 정확히 하나의 값만 반환해야 함
- 차이가 같을 경우 큰 수 선택 로직 반드시 구현

## 4. 어려웠던 점 및 해결 과정

- 일반적인 이진 탐색과 달리 근사값을 반환해야 하므로, 탐색 종료 후 left와 right의 의미를 정확히 이해해야 했다.

## 5. 궁금한 점

- 이 문제처럼 근사값을 찾는 경우가 이진 탐색을 사용하는 문제 유형으로 알고 있습니다. 맞을까요?