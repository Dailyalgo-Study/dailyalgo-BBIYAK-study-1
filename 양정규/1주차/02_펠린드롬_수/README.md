# 02. 팰린드롬 수

## 1. 문제 정보

- [데일리알고 - 팰린드롬 수](https://dailyalgo.kr/problems/158)

## 2. 소요 시간

- 30분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

> 문제를 어떻게 이해했고, 어떤 접근 방법을 떠올렸는지 설명합니다.
>
> 숫자를 뒤집어도 값이 같은지 확인합니다.
>
> 숫자를 문자열로 변환 후 한글자씩 원소로 담고 반전시킨 리스트를 다시 문자열로 변환 후 비교합니다.

### ⚙️ 구현 로직의 동작 과정

> 구현한 코드가 어떤 방식으로 동작하는지, 각 단계별로 설명합니다.
>
> 1. n을 문자열(numberToString)로 변환합니다.
> 2. 변환된 문자열을 한글자씩 리스트(numberList)에 담습니다.
> 3. for문을 이용해 numberList의 첫번째 문자를 다른 리스트(reversedNumberList)의 마지막 위치에 입력합니다.
> 4. numberList와 reversedNumberList의 일치 여부에 따라 true,false를 반환합니다.

### ✅ 엣지 케이스에 대한 고려 사항

> 문제 해결 시 고려해야 할 특수한 경우들과 그에 대한 처리 방법을 설명합니다.

## 4. 어려웠던 점 및 해결 과정

> numberList == reversedNumberList는 동일한 주소값인지 확인하는 코드로서 올바른 비교를 위해 Arrays.equals(numberList, reversedNumberList)로 변경하여
> 비교하였습니다.

## 5. 궁금한 점

>