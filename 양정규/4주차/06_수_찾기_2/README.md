# 06. 수 찾기 2

## 1. 문제 정보

- [데일리알고 - 수 찾기 2](https://dailyalgo.kr/ko/problems/226)

## 2. 소요 시간

- 20분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

> numbers 원소값 중에 target이 있는지 확인한다.
>
> 이진탐색으로 numbers의 양 끝 인덱스부터 시작하여 target에 접근한다.

### ⚙️ 구현 로직의 동작 과정

> 1. numbers[mid]가 target과 같다면 true를 반환한다. (mid = left + (right - left) / 2)
> 2. numbers[mid]와 target의 크기 비교에 따라 왼쪽,오른쪽 인덱스를 재설정한다.
> 3. target이 없다면 false를 반환한다.

### ✅ 엣지 케이스에 대한 고려 사항

## 4. 어려웠던 점 및 해결 과정

## 5. 궁금한 점


