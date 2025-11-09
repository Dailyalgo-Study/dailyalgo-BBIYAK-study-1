public class Solution {
    public int solution(int[] target, int k) {
        // 1. 반복문을 k회 돌며,
        int pickedUser = 0; // 지목당한 마지막 유저번호 갱신할 변수 선언

        for (int i=0; i<k; i++) {
            // 2. 첫 반복회차만(1번유저부터 시작해야 하므로, if (i==0)) pickedUser=target[i]
            if (i==0) {
                pickedUser = target[i];
                // System.out.println(i+1+"번유저의 선택 -> "+target[i]+"번유저");
            }
            // 3. 다음 반복문부터는, pickedUser=target[pickedUser-1]로 지목유저번호 계속 갱신
            else { // i==1~k-1까지
                pickedUser = target[pickedUser-1];
                // System.out.println(pickedUser+"번유저의 선택 -> "+target[pickedUser-1]+"번유저");
            }
        }
        // 4. 반복문이 끝난 후 pickedUser가 마지막 지목당한 유저번호
        return pickedUser;
    }
}