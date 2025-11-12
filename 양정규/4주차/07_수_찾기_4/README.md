# 07. 수 찾기 4

## 1. 문제 정보

- [데일리알고 - 수 찾기 4](https://dailyalgo.kr/ko/problems/228)

## 2. 소요 시간

- 30분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

> target과 같은 numbers의 원소값이 있는지 찾아낸다.
>
> 없다면 target과 가장 근접한 수 그 중 가장 큰 수를 반환한다.
>
> 이진탐색으로 numbers의 양 끝 인덱스부터 시작하여 target에 접근한다.

### ⚙️ 구현 로직의 동작 과정

> 1. numbers[mid]가 target과 같다면 numbers[mid]를 반환한다. (mid = left + (right - left) / 2)
> 2. numbers[mid]와 target의 크기 비교를 통해 왼쪽,오른쪽 인덱스를 재설정한다.
> 3. while문 종료후 target이 numbers의 첫번째 원소보다 작다면 numbers[0]을 반환한다.
> 4. target이 numbers의 마지막 원소보다 크다면 numbers[count-1](count = numbers.length)을 반환한다.
> 5. diffLeft(numbers[left]-target), diffRight(target-numbers[right]) 두 값의 차이에 따라 조건에 맞는 numbers[left] 혹은 numbers[right]
     를 반환한다.

### ✅ 엣지 케이스에 대한 고려 사항

> target값이 numbers의 최대,최소값 범위를 벗어난 경우 numbers의 첫원소 또는 마지막 원소를 반환한다.

## 4. 어려웠던 점 및 해결 과정

## 5. 궁금한 점


