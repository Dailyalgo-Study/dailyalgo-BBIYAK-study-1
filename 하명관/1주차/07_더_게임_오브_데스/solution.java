import java.util.*;

public class Solution {
    // target[i] : (i+1)번이 지목할 사람 번호
    public int solution(int[] target, int k) {
        int cur = 1; // 항상 1번에서 시작
        for (int step = 0; step < k; step++) {
            cur = target[cur - 1]; // 다음 지목자로 이동
        }
        return cur; // k번째 지목된 사람
    }

}