class Solution {
    public int solution(int[] sides) {
        int n = sides.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){ 
                for(int k = j + 1; k < n; k++){
                    int a = sides[i], b = sides[j], c = sides[k];
                    if(a + b > c && a + c > b && b + c > a){
                        int sum = a + b + c;
                        if(sum < min) min = sum;
                    }
                }
            }
        }
        return min;
    }
}