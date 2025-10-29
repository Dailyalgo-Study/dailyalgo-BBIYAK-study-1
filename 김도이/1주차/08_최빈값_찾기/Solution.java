import java.util.*;

public class Solution {
    public int solution(int[] numbers) {
        // 1. HashMap 생성
        HashMap<Integer, Integer> map = new HashMap<>( ); // 기본 capacity:16, load factor:0.75
        // 2. numbers[] 전체를 도는 반복문
        for (int n: numbers) {
            // 3. if (V putIfAbsent(K key, V value)) : 기존 데이터에 key가 없으면  key와 value를 저장
            // if (!map.containsKey(n)) {  // 해당 숫자가 맵에 존재하지 않으면,
            //     map.putIfAbsent(n, 1);  // n을 키로, 값은 1로 한번은 전부 등록하게 함
            //     System.out.println(n+":"+map.get(n));   // 현재 요소 n의 작업이 되었는지 확인 위해, 키:값 출력
            // }
            // else {  // 해당 숫자가 이미 맵에 존재하면,
            //     map.replace(n, map.get(n)+1);   // 해당 숫자를 키로 이전값+1 처리해 저장한다.
            //     System.out.println(n+":"+map.get(n));   // +1 되었는지 확인 위해 키:값 출력
            // }
            map.put(n, map.getOrDefault(n, 0)+1);
            System.out.println(n+":"+map.get(n));
        }
        // 4. 반복문 다 돌고,
        // 5. map에 value값(빈도)이 동일한 숫자가 여럿이면,
        int maxFreq = Collections.max(map.values());
        System.out.println("maxFreq = "+maxFreq);

        // 6. 그 중에서 가장 작은 수를 한번에 뽑을 수 있는 자료구조(TreeSet or PriorityQueue)에 저장해서, 추출
        TreeSet<Integer> set = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {  // maxFreq 최빈횟수 값인 애를 찾으면
                set.add(entry.getKey());    // 중복 없이 저장가능한 set에 key값인 숫자를 저장한다(알아서 정렬되며 저장됨)
                System.out.println(set);
            }
        }

        return set.first(); // set의 첫번째를 뽑으면 그게 최소값
    }
}