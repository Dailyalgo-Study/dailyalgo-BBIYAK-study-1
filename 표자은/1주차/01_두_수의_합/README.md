# 01. 두 수의 합

## 1. 문제 정보
- [데일리알고 - 두 수의 합](https://dailyalgo.kr/problems/149)

## 2. 소요 시간
- 2시간

## 3. 풀이 설명
### 💡 아이디어 도출 과정
> 문제를 어떻게 이해했고, 어떤 접근 방법을 떠올렸는지 설명합니다.

조합으로 백트래킹 재귀, 가지치기

### ⚙️ 구현 로직의 동작 과정
> 구현한 코드가 어떤 방식으로 동작하는지, 각 단계별로 설명합니다.

조건에 맞는 조합

### ✅ 엣지 케이스에 대한 고려 사항
> 문제 해결 시 고려해야 할 특수한 경우들과 그에 대한 처리 방법을 설명합니다.

시간 초과 -> 가지지치 더 할게 있나?

## 4. 어려웠던 점 및 해결 과정

조합 재귀 코드를 보며 내 코드가 뭐가 다른지 확인함. 내 코드만 보고서는 뭐가 틀린지 잘 모르겠다.

## 5. 궁금한 점
time out  뜨는게 몇개 있다.

    int n = numbers.size();
    for (int i=startIdx; i<n; i++)
    {
        nsum += numbers[i];
        nelem += 1;

        if (nsum > m)   // pruning
        {
            nsum -= numbers[i];
            nelem -= 1;
            continue;
        } 
        
        cout << "idx " << i << endl;
        elemsum(numbers, ++i, nelem, nsum, m, answer);  // 여기서 오류 발생

        nsum -= numbers[i];
        nelem -= 1;
    }
 vs
    int n = numbers.size();
    for (int i=startIdx+1; i<n; i++)
    {
        nsum += numbers[i];
        nelem += 1;

        if (nsum > m)   // pruning
        {
            nsum -= numbers[i];
            nelem -= 1;
            continue;
        } 

        cout << "idx " << i << endl;
        elemsum(numbers, i, nelem, nsum, m, answer);

        nsum -= numbers[i];
        nelem -= 1;
    }
}
이런 경우 오류를 쉽게 찾는 방법, 이거 오류 찾느라 시간을 다 썼습니다.