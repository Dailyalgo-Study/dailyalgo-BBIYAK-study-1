    import java.util.*;

    public class Solution {
        public boolean solution(int n) {
            // 1.주어진 수를 반으로 나누자.
            // 2. 반으로 나눠진 두개의 수를 비교하자.
            // 3. 만약 주어진 수의 자리가 홀수라면 2로 나눈 후 몫 + 1을 하여 가운데 수를 빼주자.
            boolean answer = true;

            ArrayList<Integer> list = new ArrayList<Integer>();
            
            while (n > 0) {
                list.add(n % 10);
                n = n / 10;
            }

            if (list.size() % 2 == 1) {
                    list.remove(list.size() / 2);
            }

            for(int i = 0; i < list.size() / 2; i++) {
                if (!list.get(i).equals(list.get(list.size() - i - 1))) return false;
            }

            return answer;
        }
    }
