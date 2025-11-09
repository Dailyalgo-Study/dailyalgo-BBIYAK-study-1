public class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for (int i = 0; i < sides.length - 2; i++) {
            for (int j = i + 1; j < sides.length - 1; j++) {
                for (int k = j + 1; k < sides.length; k++) {
                    if ((sides[i] + sides[j] > sides[k]) && (sides[i] + sides[k] > sides[j]) && (sides[j] + sides[k] > sides[i])) {
                        int min = sides[i] + sides[j] + sides[k];
                        if (answer == 0) {
                            answer = min;
                        } else if (answer > min) {
                            answer = min;
                        }
                    }
                }
            }
        }
        return answer;
    }
}