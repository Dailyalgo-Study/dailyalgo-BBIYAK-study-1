# 03. 중앙값 찾기

## 1. 문제 정보

- [데일리알고 - 중앙값 찾기](https://dailyalgo.kr/ko/problems/178)

## 2. 소요 시간

- 3분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

- 이 문제는 정렬 후 중앙값을 찾으면된다.

### ⚙️ 구현 로직의 동작 과정

```java
		Arrays.sort(numbers);
        int answer = numbers[numbers.length / 2];
		return answer;
```

### ✅ 엣지 케이스에 대한 고려 사항

- 정수 배열의 길이가 홀수가 아닌 경우면 중앙값이 number.length / 2  + 1 이 될 수 있다.

## 4. 어려웠던 점 및 해결 과정

- 없습니다.

## 5. 궁금한 점

- 없습니다.