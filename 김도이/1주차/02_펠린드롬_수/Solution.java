import java.util.*;

public class Solution {
    public boolean solution(int n) {
        // 0. n을 문자로 변환한 후,
        String str = Integer.toString(n);
        // System.out.println(str);
        // 0-1. 하나씩 분리해 각 배열의 요소에 저장한다. (문자열 메소드 필요할듯)
        char[] arr = str.toCharArray();
        // System.out.println(arr);

        // 1. 배열 길이가 1이면, return answer; 조기리턴(?)
        if (arr.length == 1) return true;
        // else if (arr.length % 2 ==0) return false;  // 짝수개의 숫자면 팰린드롬일 리 없으니 false 반환

        // 1-1. 시작점(left=0), 끝점(right=arr.length-1)을 두고, left가 right보다 작을 동안에만 반복
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            // 3. arr[left]!=arr[right] 두 수가 다르면, answer = false; 처리한다.
            if (arr[left] != arr[right]) return false;

            left++;     // left는 +1씩 증가
            right--;    // right는 -1씩 감소 (둘이 짝이 맞을 때 까지만 while문을 돈다.)
        }
        // 짝을 다 돌고, 마지막 가운데 숫자 하나가 남았을 때까지 계산이 온다면,
        return true;
    }
}