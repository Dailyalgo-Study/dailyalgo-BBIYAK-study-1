# 06. 두 수의 합 4

## 1. 문제 정보

- [데일리알고 - 두수의 합 4](https://dailyalgo.kr/ko/problems/195)

## 2. 소요 시간

- 15분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

- 투 포인터 left(왼쪽 끝), right(오른쪽 끝)을 두고, numbers[left] + numbers[right]의 합을 target과 비교하며 포인터를 이동시킨다.
    - 합이 target보다 작으면 더 큰 수를 만들기 위해 left++
    - 합이 target보다 크면 더 작은 수를 만들기 위해 right--
    - 합이 target과 같으면 결과 후보로 저장
- 여러 쌍이 있을 수 있으므로 두 수의 차이가 최소인 쌍을 반환한다.

### ⚙️ 구현 로직의 동작 과정

1. left = 0, right = numbers.length - 1로 초기화 및 필요한 변수 선언
    
    ```java
            int left = 0, right = numbers.length - 1;
            int minDiff = Integer.MAX_VALUE;
            int[] answer = {-1, -1}
    ```
    
2. while문으로 left < right 동안 반복
3. 투 포인터를 활용해 sum이 target과 일치하는  지 확인, 만약 두수의 차이가 더 작은 경우도 있을 수 있기에 확인
    
    ```java
            while (left < right) {
                int sum = numbers[left] + numbers[right];
    
                if (sum == target) {
                    int diff = numbers[right] - numbers[left];
                    if (diff < minDiff) {
                        minDiff = diff;
                        answer[0] = numbers[left];
                        answer[1] = numbers[right];
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
    ```
    

### ✅ 엣지 케이스에 대한 고려 사항

## 4. 어려웠던 점 및 해결 과정

- 여러 두 수의 합중 가장 차이가 적은 경우의 로직이 어려웠음.

## 5. 궁금한 점

- 없습니다.