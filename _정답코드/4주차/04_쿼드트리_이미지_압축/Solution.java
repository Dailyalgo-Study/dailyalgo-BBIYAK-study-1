public class Solution {
    private static int[][] img_glob;

	public String solution(int[][] img) {
        img_glob = img;
		return encode(0,0,8);
	}

    public String encode(int x, int y, int n){
        int count_zero = 0;
        for(int i=x; i<x+n; i++){
            for(int j=y; j<y+n; j++){
                if (img_glob[i][j] == 0){
                    count_zero ++;
                }
            }
        }
        if (count_zero == 0){
            return "1";
        }
        if (count_zero == n*n){
            return "0";
        }
        return "("
            + encode(x,y,n/2)
            + encode(x,y+n/2,n/2)
            + encode(x+n/2,y,n/2)
            + encode(x+n/2,y+n/2,n/2)
            + ")";
    }
}

