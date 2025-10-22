public class Solution {
    public String solution(String hangul_numbers) {
        // 1. hangul_numbers 중 '영,하,둘,셋,넷,다,여,일,여,아' 로 시작하는 글자를 먼저 치환
        hangul_numbers = hangul_numbers.replace("영", "0");
        hangul_numbers = hangul_numbers.replace("하나", "1");
        hangul_numbers = hangul_numbers.replace("둘", "2");
        hangul_numbers = hangul_numbers.replace("셋", "3");
        hangul_numbers = hangul_numbers.replace("넷", "4");
        hangul_numbers = hangul_numbers.replace("다섯", "5");
        hangul_numbers = hangul_numbers.replace("여섯", "6");
        hangul_numbers = hangul_numbers.replace("일곱", "7");
        hangul_numbers = hangul_numbers.replace("여덟", "8");
        hangul_numbers = hangul_numbers.replace("아홉", "9");
        System.out.println(hangul_numbers);
        // 2. 남은 문자열 중 '공,일,이,삼,사,오,육,칠,팔,구' 도 마저 치환
        //replace([기존문자],[바꿀문자])
        hangul_numbers = hangul_numbers.replace("공", "0");
        hangul_numbers = hangul_numbers.replace("일", "1");
        hangul_numbers = hangul_numbers.replace("이", "2");
        hangul_numbers = hangul_numbers.replace("삼", "3");
        hangul_numbers = hangul_numbers.replace("사", "4");
        hangul_numbers = hangul_numbers.replace("오", "5");
        hangul_numbers = hangul_numbers.replace("육", "6");
        hangul_numbers = hangul_numbers.replace("칠", "7");
        hangul_numbers = hangul_numbers.replace("팔", "8");
        hangul_numbers = hangul_numbers.replace("구", "9");
        System.out.println(hangul_numbers);

        return hangul_numbers;
    }
}