import java.lang.Math;
import java.util.*;

public class Solution {
    public int solution(int n, int m) {
        int answer = 0; // 완전제곱수의 개수 (++처리할거)
        // System.out.println("n의제곱근="+Math.floor(Math.sqrt(n)));
        // System.out.println("m의제곱근="+Math.floor(Math.sqrt(m)));

        // 1. n의제곱근(올림) <= 완전제곱수(x^2) 개수찾기 <= m의제곱근(소수점버림)
        for(double i=Math.ceil(Math.sqrt(n)); i<=Math.floor(Math.sqrt(m)); i++) {
            // System.out.println("i="+i+", i*i="+i*i);
            answer++;
        }
        return answer;
    }
}