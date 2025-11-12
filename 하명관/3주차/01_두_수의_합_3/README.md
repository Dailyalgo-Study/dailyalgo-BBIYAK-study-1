# 01. 두 수의 합 3

## 1. 문제 정보

- [데일리알고 - 두 수의 합 3](https://dailyalgo.kr/ko/problems/194)

## 2. 소요 시간

- 10분

## 3. 풀이 설명

### 💡 아이디어 도출 과정

- 각 원소를 순회하면서, 현재 원소와 더했을 때 target이 되는 수가 이전에 몇 번 나왔는지를 세면 된다.

### ⚙️ 구현 로직의 동작 과정

- HashMap<Integer, Integer>를 선언하여 숫자별 등장 횟수를 기록한다.
- numbers 배열을 순회하면서 need = target - num을 계산한다. map에 need가 존재하면, 해당 수가 등장한 횟수만큼 count에 더한다. 현재 num을 map에 추가하거나, 기존 등장 횟수를 1 증가시킨다.
    
    ```java
            for (int num : numbers) {
                int need = target - num;
                if (map.containsKey(need)) {
                    count += map.get(need);
                }
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
    ```
    

### ✅ 엣지 케이스에 대한 고려 사항

- 모든 숫자가 동일한 경우

## 4. 어려웠던 점 및 해결 과정

- 각 숫자의 등장 횟수를 누적하며 계산하는 HashMap으로 접근하여 해결했다.

## 5. 궁금한 점

- 없습니다.