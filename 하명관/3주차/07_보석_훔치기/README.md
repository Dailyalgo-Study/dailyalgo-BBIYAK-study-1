# 07. 보석 훔치기

## 1. 문제 정보

- [데일리알고 - 보석 훔치기](https://dailyalgo.kr/ko/problems/205)

## 2. 소요 시간

- 20분

## 3. 풀이 설명

- 목표: "Diamond", "Ruby", "Emerald", "Sapphire", "Gold" 다섯 가지 보석이 모두 포함된 가장 짧은 연속 구간의 길이를 구한다.
- 즉, 문자열 배열 내에서 모든 종류의 보석이 한 번 이상 포함된 최소 길이 구간을 찾는 문제.
- 이런 형태는 전형적인 슬라이딩 윈도우(Sliding Window) 문제이다. 최소 길이 구간이기 때문에

### 💡 아이디어 도출 과정

1. left, right 두 포인터를 이용해 윈도우를 확장 및 축소한다.
2. 현재 윈도우 내의 보석 종류 개수를 HashMap으로 관리한다.
3. 다섯 가지 보석이 모두 포함되면 → 왼쪽 포인터(left)를 이동시켜 윈도우를 최소화한다.
4. 윈도우가 유효할 때마다 길이를 비교해 최소값을 갱신한다.

### ⚙️ 구현 로직의 동작 과정

1. 왼쪽(left), 오른쪽(right) 포인터 초기화
    
    ```java
            Map<String, Integer> map = new HashMap<>();
    
            int left = 0, minLength = Integer.MAX_VALUE;
            int count = 0; 
    ```
    
2. right 확장 → 보석 추가, 모든 보석 포함 시 → left 이동하며 최소 구간 갱신
    
    ```java
            for (int right = 0; right < jewels.length; right++) {
                String jewel = jewels[right];
                map.put(jewel, map.getOrDefault(jewel, 0) + 1);
    
                if (map.get(jewel) == 1) count++;
    
                while (count == 5) {
                    minLength = Math.min(minLength, right - left + 1);
    
                    String leftJewel = jewels[left];
                    map.put(leftJewel, map.get(leftJewel) - 1);
                    if (map.get(leftJewel) == 0) count--; 
                    left++;
                }
            }
    ```
    

### ✅ 엣지 케이스에 대한 고려 사항

## 4. 어려웠던 점 및 해결 과정

- 모든 구간을 탐색하면 효율적이지 않기에 슬라이딩 윈도우 와 투 포인터 풀이 방식을 사용했음.
- 최소 구간을 탐색하는 방식이 어려웠음.

## 5. 궁금한 점

- map  자료구조를 활용해서 푼 방법이 좋은 방법인지 궁금합니다.