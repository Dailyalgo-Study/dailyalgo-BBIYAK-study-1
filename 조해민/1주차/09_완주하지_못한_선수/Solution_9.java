class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        for(int i = 0; i < participant.length; i++) {
            boolean list = false;
            
            for (int j = 0; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    completion[j] = null;
                    
                    list = true;
                    
                    break;
                }
            }
            
            if(!list) {
                answer = participant[i];
                
                break;
            }
        }
        return answer;
    }
}