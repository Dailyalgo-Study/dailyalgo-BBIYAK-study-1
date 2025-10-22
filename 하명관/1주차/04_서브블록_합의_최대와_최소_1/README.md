# 04. 서브블록 합의 최대와 최소 1

## 1. 문제 정보

- [데일리알고 - 서브블록 합의 최대와 최소 1](https://dailyalgo.kr/problems/161)

## 2. 소요 시간

- 60분 (누적합 풀이)

## 3. 풀이 설명

### 💡 아이디어 도출 과정

> 문제를 어떻게 이해했고, 어떤 접근 방법을 떠올렸는지 설명합니다.
> 

이 문제는 이중 배열에서 인접한 두 배열에서 각각 같은 위치에 있는 요소 2개씩 뽑아 총 4개의 수를 더해서 최소값과 최대값을 구해아 하는 문제이다.

처음 생각한 방법은 이중 반복문을 사용하여 답을 구하는 풀이를 생각했습니다.  하지만 제한사항을 보면 입력값이 많기 때문에 시간 초과가 발생할 수 있다고 생각했습니다. 

- `n`, `m`은 2 이상 1,000 이하의 자연수입니다.
- `array`의 각 원소는 -10,000 이상 10,000 이하의 정수입니다.

그럼에도 불구하고 먼저 이중 반복문을 사용해보겠습니다.

### ⚙️ 구현 로직의 동작 과정

> 구현한 코드가 어떤 방식으로 동작하는지, 각 단계별로 설명합니다.
> 
1. 주어진 배열에 연속된 배열 2개와 같은 위치에 요는 요소들을 모두 더해서 값을 기록하자.
2. 서브 블록의 위치를 옮기면서 값이 최소값보다 작으면 최소값을 업데이트 하고 최대합보다 합이 크면 최대 합을 업데이트 하자.
3. 모든 경우의 수를 검색하면 끝.

```java
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; j ++) {
                int sum = array[i][j] + array[i][j + 1] + array[i + 1][j] + array[i + 1][j + 1];

                if (sum > max) {
                    max = sum;
                } 
                
                if (sum < min) {
                    min = sum;
                }
            }
        }
```

제출을 하게 되면 시간초과가 발생이 된다.

![image.png](attachment:d7181d4b-d8f5-4013-b75e-4f36c8d38105:image.png)

생각이 나는 다른 문제 풀이 방법으로는 구간합 방식을 이용하는 것이다.

구간 합 방식을 응용해서 문제를 풀이하면 효율적으로 알고리즘을 풀 수 있을 것 같다.

**누적합을 이용한 풀이**

누적합을 이차원 배열에 저장하면 아래 처럼 저장이 된다.

![image.png](attachment:4ff7da61-2ed5-408f-9866-6fe136188bfc:image.png)

위 누적합 이차원 배열에서 내가 원하는 구간의 합을 구하는 방법은 총 누적합에서 내가 원하는 구간을 제외하고 나머지 부분의 누적합을 빼면 된다.

```java
public class Solution {
	public int[] solution(int[][] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = array.length;
        int m = array[0].length;
        int sum = 0;
				int[][] S = new int [n + 1][m + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                S[i][j] = array[i - 1][j - 1] + S[i][j - 1] + S[i - 1][j] - S[i - 1][j - 1];
            }
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < m + 1; j++) {
                sum = S[i][j]  - S[i][j - 2] - S[i - 2][j] + S[i - 2][j - 2];

                if (sum < min) min = sum;
                if (sum > max) max = sum;
            }
        }

        int[] answer = {max, min};

		return answer;
	}
}

```

### ✅ 엣지 케이스에 대한 고려 사항

> 문제 해결 시 고려해야 할 특수한 경우들과 그에 대한 처리 방법을 설명합니다.
> 

음수의 경우를 생각해야 한다. 또한 원소의 값이 1,000,000,000 처럼 매우 크다면 int 범위를 초과하는 오버플로우가 생길수도 있다.

## 4. 어려웠던 점 및 해결 과정

처음 BruteForce로 문제를 풀이할때는 어렵지 않았지만 시간초과가 발생하였기에 누적합으로 문제를 풀때 정확한 공식을 모르다 보니 엣지케이스에 대한 조건문을 작성하며 어지러운 코드를 작성했다.

```java
public class Solution {
	public int[] solution(int[][] array) {
        // 구간 합을 이용해 구간 합을 구한 후 부분 구간 합을 구하면 된다.
        // S[i][j] - S[i][j - 2] - S[j - 2][i] + S[i - 2][j - 2] == 부분 구간 합
        // 서브 블록의 위치를 옮기면서 값이 최소값보다 작으면 최소값을 업데이트 하고 최대합보다 합이 크면 최대 합을 업데이트 하자.
        // 모든 경우의 수를 검색하면 끝.		
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = array.length;
        int m = array[0].length;
        int[][] S = new int[n][m];
        int sum = 0;
        S[0][0] = array[0][0];

        for (int i = 1; i < n; i++) {
            S[i][0] = S[i - 1][0] + array[i][0];
        }

        for (int j = 1; j < m; j++) {
            S[0][j] = S[0][j - 1] + array[0][j];
        }
        
        // i는 행, j는 열, n은 세로, m은 가로
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                S[i][j] = S[i][j - 1] + S[i - 1][j] + array[i][j] - S[i - 1][j - 1];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (i == 1 && j == 1) {
                    sum = S[i][j];
                } else if (i == 1) {
                    sum = S[i][j] - S[i][j -2];
                } else if (j == 1) {
                    sum = S[i][j] - S[i -2][j];
                } else {
                    sum = S[i][j] - S[i][j - 2] - S[i - 2][j] + S[i - 2][j - 2];
                }

                if (sum > max) max = sum;
                if (sum < min) min = sum;
            }
        }

        // for (int[] a : S) {
        //     for (int b : a) {
        //         System.out.print(b);
        //         System.out.print(", ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(max);
        // System.out.println(min);

        int[] answer = {max, min};
		return answer;
	}
}

```

## 5. 궁금한 점

이 문제가 누적합으로 풀었을 때 더 시간 효율이 좋은지 모르겠습니다. 누적합으로 풀이하는 방법이 더 효율적일까요?