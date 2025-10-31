import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
    int score;
    int id;

    public Person(int score, int id) {
        this.score = score;
        this.id = id;
    }
}

public class Solution {
    public String[] solution(int[] scores) {
        int count = scores.length;
        String grade = "";
        String[] answer = new String[count];
        List<Person> list = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            list.add(new Person(scores[i], i + 1));
        }

        list.sort(
                Comparator
                        .comparingInt((Person p) -> p.score)
                        .reversed()
                        .thenComparing(p -> p.id)
        );

        for (int i = 0; i < count; i++) {
            if (i < count / 3) {
                grade = "A";
            } else if (i < (count / 3) * 2) {
                grade = "B";
            } else {
                grade = "C";
            }
            answer[list.get(i).id - 1] = grade;
        }
        return answer;
    }
}