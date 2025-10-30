import java.util.*;

public class Solution {
    public String solution(String hangul) {
        String[][] longWords = {
            {"여덟", "8"}, {"여섯", "6"}, {"다섯", "5"},
            {"일곱", "7"}, {"하나", "1"}, {"아홉", "9"}
        };

        String[][] shortWords = {
            {"공", "0"}, {"영", "0"}, {"일", "1"}, {"이", "2"}, {"삼", "3"},
            {"사", "4"}, {"오", "5"}, {"육", "6"}, {"칠", "7"}, {"팔", "8"},
            {"구", "9"}, {"둘", "2"}, {"셋", "3"}, {"넷", "4"}
        };

        String result = hangul;

        for (String[] pair : longWords) {
            if (result.contains(pair[0])) {
                result = result.replace(pair[0], pair[1]);
            }
        }

        for (String[] pair : shortWords) {
            if (result.contains(pair[0])) {
                result = result.replace(pair[0], pair[1]);
            }
        }

        return result;
    }
}