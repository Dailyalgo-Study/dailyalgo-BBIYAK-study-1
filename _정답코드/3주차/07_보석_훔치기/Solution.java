import java.util.*;

public class Solution {

    private static Map<String,Integer> jewel_count = new HashMap<>();
    private static String[] all_jewels = {"Diamond", "Ruby", "Emerald", "Sapphire", "Gold"};

    public int solution(String[] jewels) {
        for(String jewel : all_jewels){
            jewel_count.put(jewel, 0);
        }

        int n = jewels.length;
        int left = 0, right = 4;

        for(int i=0; i<5; i++){
            String jewel = jewels[i];
            jewel_count.put(jewel, jewel_count.get(jewel) + 1);
        }

        int answer = n;

        while(left < n){
            boolean contain = containAllJewels();

            if( !contain && right < n-1) {
                String added_jewel = jewels[right+1];
                jewel_count.put(added_jewel, jewel_count.get(added_jewel) + 1);
                right ++;
            } else {
                if(contain) {
                    int window = right - left + 1;
                    if(window < answer){
                        answer = window;
                    }
                }
                
                String removed_jewel = jewels[left];
                jewel_count.put(removed_jewel, jewel_count.get(removed_jewel) - 1);
                left ++;
            }
        }

        return answer;
    }

    private boolean containAllJewels(){
        for(String jewel : all_jewels){
            if(jewel_count.get(jewel) == 0){
                return false;
            }
        }
        return true;
    }
}
