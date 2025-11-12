# 07. 피보나치 수 2

## 1. 문제 정보
- [데일리알고 - 피보나치 수 2](https://dailyalgo.kr/ko/problems/209)

## 2. 소요 시간
- 10분

## 3. 풀이 설명
### 💡 아이디어 도출 과정

### ⚙️ 구현 로직의 동작 과정

### ✅ 엣지 케이스에 대한 고려 사항

## 4. 어려웠던 점 및 해결 과정
void fibo12(int n)
{
    if (n == 1) {
        answer[0]++;
        return;
    }
    if (n == 2) {
        answer[1]++;
        return;
    }
    fibo12(n - 1);
    fibo12(n - 2);
}

void 함수이지만 기저사례에서 return을 해줘야하는것을 깜빡했다.

## 5. 궁금한 점

