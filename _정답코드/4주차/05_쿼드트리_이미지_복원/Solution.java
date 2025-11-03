public class Solution {
    public static int[][] answer = new int[8][8];
    public static String comp;
    public static int idx = 0;

	public int[][] solution(String compressed) {
        comp = compressed;
        decode(0, 0, 8);
		return answer;
	}

    private void decode(int x, int y, int n){
        if( comp.charAt(idx) != '(' ){
            int value = Integer.parseInt(comp.charAt(idx)+"");
            
            for(int i=x; i<x+n; i++){
                for(int j=y; j<y+n; j++){
                    answer[i][j] = value;
                }
            }
            
            idx ++;
        } else {
            idx ++; // 여는 괄호 생략
            
            decode(x, y, n/2);
            decode(x, y+n/2, n/2);
            decode(x+n/2, y, n/2);
            decode(x+n/2, y+n/2, n/2);
            
            idx ++; // 닫는 괄호 생략
        }
    }
}

