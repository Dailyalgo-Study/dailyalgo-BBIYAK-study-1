# 02. 카운팅 정렬 2

## 1. 문제 정보

- [데일리알고 - 카운팅 정렬 2](https://dailyalgo.kr/ko/problems/177)

## 2. 소요 시간

- 

## 3. 풀이 설명

### 💡 아이디어 도출 과정

1. 이번 문제는 오름차순 정렬만 하면 됩니다.
2. 제한 조건은
    - `numbers`의 길이는 1 이상 100,000 이하입니다.
    - `numbers`의 각 원소는 -1,000 이상 1,000 이하의 정수입니다.

### ⚙️ 구현 로직의 동작 과정

- Arrays.sort 메서드를 사용하면 바로 풀이가 끝난다.
    
    ```java
    import java.util.*;
    
    public class Solution {
    	public int[] solution(int[] numbers) {
    		Arrays.sort(numbers);
    		return numbers;
    	}
    }
    ```
    
- 하지만 이렇게 푸는 방법이 아니라 다른 방법으로 풀이를 하는 것이 공부가 된다고 생각하여 찾아봤다.
- 찾아 보니 데이터 범위가 제한적이고 많은 데이터가 있을 때 빠른 성능을 갖고 있는 카운팅 정렬이 있다고 한다.
- 카운팅 정렬을 이용한 풀이
    - 숫자들의 등장 횟수를 저장하는 배열
        - -1000~1000이 데이터의 범위이므로 20001 크기 필요.
        - `int[] count = new int[2001];`
    - 정렬된 결과를 저장하는 배열
        - `int[] answer = new int[numbers.length];`
    - numbers 값들을 count 배열에 누적
        
        ```java
                for (int num : numbers) {
                    count[num + 1000] += 1;
                }
        ```
        
    - count 배열을 누적합 형태로 변경
        
        ```java
                for (int i = 1; i < 2001; i++) {
                    count[i] += count[i - 1];
                }
        ```
        
    - numbers 배열을 뒤에서 부터 탐색하여 정렬 수행
        
        ```java
                for (int num : numbers) {
                    answer[count[num + 1000] - 1] = num;
                    count[num + 1000] -= 1;
                }
        
        ```
        

### ✅ 엣지 케이스에 대한 고려 사항

## 4. 어려웠던 점 및 해결 과정

- 카운팅 정렬 알고리즘에서 누적합을 이용한 풀이 과정이 이해가 어려웠음.

## 5. 궁금한 점

- 누적합 풀이가 완벽히 이해가 되지 않습니다. 예시를 보고 검색해봐도 어렵습니다.