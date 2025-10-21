# **08. 최빈값 찾기**

## **1. 문제 정보**

- [데일리알고 - 최빈값 찾기](https://dailyalgo.kr/problems/171)

## **2. 소요 시간**

- 20분

## **3. 풀이 설명**

### **💡 아이디어 도출 과정**

> 문제를 어떻게 이해했고, 어떤 접근 방법을 떠올렸는지 설명합니다.
> 
- 각 숫자의 등장 횟수(빈도) 를 빠르게 세면 최빈값을 쉽게 구할 수 있습니다.
- HashMap<Integer, Integer> 로 각 숫자와 등장 횟수를 기록 한 후 가장 큰 빈도를 가진 숫자를 찾고, 동률일 때는 더 작은 수를 선택합니다.

### **⚙️ 구현 로직의 동작 과정**

> 구현한 코드가 어떤 방식으로 동작하는지, 각 단계별로 설명합니다.
> 
1. **빈도 집계**

```
Map<Integer, Integer> map = new HashMap<>();
for (int num : numbers) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```

1. 각 원소를 순회하며 map.getOrDefault 메서드를 사용하여 등장 횟수를 누적합니다.
2. 최빈값 선정 (같은 값이라면 더 작은 수를 answer에 업데이트합니다.)

```
int answer = Integer.MAX_VALUE;
int maxCount = 0;

for (Map.Entry<Integer, Integer> m : map.entrySet()) {
    int num = m.getKey();
    int count = m.getValue();

    if (count > maxCount || (count == maxCount && num < answer)) {
        maxCount = count;
        answer = num;
    }
}
```

최종 선택된 answer를 반환합니다.

> 시간복잡도: **O(n)**
> 

### **✅ 엣지 케이스에 대한 고려 사항**

> 문제 해결 시 고려해야 할 특수한 경우들과 그에 대한 처리 방법을 설명합니다.
> 
- **단일 원소 배열**: 예) [7] → 최빈값 7 (정상 동작)
- **음수/0 포함**: 범위 내 값 그대로 해시 집계 가능
- **동률 다수**: 동률이면 **가장 작은 수**를 반환하는 로직으로 해결
- **큰 입력(n=100,000)**: 맵 기반 O(n)으로 충분히 통과

## **4. 어려웠던 점 및 해결 과정**

동률 처리 기준(가장 작은 수)을 놓치기 쉬운데, 비교 조건을 count > maxCount || (count == maxCount && num < answer) 로 분리해 명확히 해결했습니다.

초기 answer 값을 Integer.MAX_VALUE로 두어 첫 비교 시 자연스럽게 갱신되도록 했습니다.

## **5. 궁금한 점**

해시 맵을 이용하지 않고 더 좋은 풀이가 있을까요?