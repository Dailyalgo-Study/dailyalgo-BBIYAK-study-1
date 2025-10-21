# **09. 완주하지 못한 선수**

## **1. 문제 정보**

- [프로그래머스 - 완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/42576)

## **2. 소요 시간**

- 10분 (해시 집계 + 1회 순회)

## **3. 풀이 설명**

### **💡 아이디어 도출 과정**

> 문제를 어떻게 이해했고, 어떤 접근 방법을 떠올렸는지 설명합니다.
> 

참가자 명단 participant와 완주자 명단 completion이 주어지고, 딱 한 명만 완주하지 못했습니다.

동명이인이 있을 수 있으므로 이름별 등장 횟수를 정확히 관리해야 합니다.

HashMap<String, Integer>로 이름 빈도를 참가자에서 +1, 완주자에서 -1 해주면, 최종적으로 값이 1로 남는 이름이 완주하지 못한 선수입니다.

### **⚙️ 구현 로직의 동작 과정**

> 구현한 코드가 어떤 방식으로 동작하는지, 각 단계별로 설명합니다.
> 
1. 이름 빈도 집계(+1)

```
Map<String, Integer> map = new HashMap<>();
for (String name : participant) {
    map.put(name, map.getOrDefault(name, 0) + 1);
}
```

1. 완주자 차감(-1)

```
for (String name : completion) {
    map.put(name, map.get(name) - 1);
}
```

1. 정답 탐색 (남은 1 찾기)

```
String answer = "";
for (Map.Entry<String, Integer> m : map.entrySet()) {
    if (m.getValue() > 0) {
        answer = m.getKey();
        break;
    }
}
return answer;
```

- 시간복잡도: O(N), 해시맵 이용

### **✅ 엣지 케이스에 대한 고려 사항**

> 문제 해결 시 고려해야 할 특수한 경우들과 그에 대한 처리 방법을 설명합니다.
> 
- **동명이인**: 동일 이름이 여러 번 등장해도 +1/-1 집계로 정확히 처리됩니다.
- **이름 길이/문자**: 소문자 알파벳만, 길이 1~20 → 해시 키로 안전.
- **참가자 수가 1명인 경우**: completion은 빈 배열이 되고, 유일 참가자가 정답.

## **4. 어려웠던 점 및 해결 과정**

해시맵 순회 시 “값이 1인 항목”을 곧바로 반환하도록 단순화했습니다.

## **5. 궁금한 점**

- Map을 이용하지 않고 다른 풀이 방법이 있는지 궁금합니다.