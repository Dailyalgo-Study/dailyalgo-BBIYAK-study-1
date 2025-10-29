# 04. 문자열 정렬

## 1. 문제 정보
- [데일리알고 - 문자열 정렬](https://dailyalgo.kr/ko/problems/182)

## 2. 소요 시간
- 30분

## 3. 풀이 설명
### 💡 아이디어 도출 과정
string 끼리의 sort

### ⚙️ 구현 로직의 동작 과정
sort

### ✅ 엣지 케이스에 대한 고려 사항

## 4. 어려웠던 점 및 해결 과정
string끼리 sort 된다는걸 항상 까먹고 헷갈려서 디버깅을 해봄 하나의 string 안에서도 sort 해보고, 
여러 string 끼리도 해보고

## 5. 궁금한 점
1. 알파벳끼리도 순서가 있는게 조금 헷갈립니다. string 끼리 순서가 있는것도 잘 안와닿는것 같아요 ㅠㅠ.
머리로는 알겠는데 이해가 좀 안되는 느낌
2. 다음의 코드에서 
for (string w: words)
{
    cout << w << " ";
}
cout << endl;
for (string w: words)
{
    sort(w.begin(), w.end());
    cout << w << " ";
}
cout << endl;
for (string w: words)
{
    cout << w << " ";
}
cout << endl;

결과가 다음과 같이 나옵니다.
bus car air zebra bus boat 
bsu acr air aberz bsu abot 
bus car air zebra bus boat 
sort는 메모리상에서 이뤄져서 비가역적으로 바뀌는 줄 알았는데
gpt한테 물어보니 for (string w: words)가 call by value라 안바뀌는거라고 하더라구요.
이런 경우 그냥 많이 하면서 아는 수밖에 없는건가요? 항상 헷갈립니다.

3. 번외인데 코딩테스트 하루 전에 뭘 하는게 좋을지 궁금합니다.

