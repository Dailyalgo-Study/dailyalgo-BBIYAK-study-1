import java.util.*;

public class Solution {
    public int solution(int[] sides) {
        // 중복 제거 (set 이용)
        // Set<Integer> set = new HashSet<>();
        // for (int n: sides) set.add(n);  // 이 부분이 많은 시간을 잡아먹을 거라고 생각했는데 테스트케이스 실행된 거 보니 아닌가보다

        // 1. 정렬
        // List<Integer> list = new ArrayList<>(sides);
        // Collections.sort(list);
        // Arrays.sort(sides);
        // System.out.println(sides);

        // 2. 최소 둘레 찾기
        int minPerimeter = Integer.MAX_VALUE;   // 0이 항상 더 작기 때문에 절대 갱신되지 않으므로 0으로 초기화하면 안됨

        // 3. 모든 서로 다른 세 원소 조합 탐색
        for (int i=0; i<sides.length-2; i++) {
            for (int j=i+1; j<sides.length-1; j++) {
                for (int k=j+1; k<sides.length; k++) {
                    int a = sides[i];
                    int b = sides[j];
                    int c = sides[k];

                    // 삼각형 조건: 두 변의 합이 나머지 한 변보다 커야 함
                    if (a+b>c && a+c>b && b+c>a) {
                        int perimiter = a+b+c;
                        if (perimiter < minPerimeter) {
                            minPerimeter = perimiter;
                        }
                        // minPerimeter = Math.min(minPerimeter, perimiter);   // 둘 중 작은 값으로 최소둘레 갱신
                    }
                }
            }
        }
        return minPerimeter;
    }
}