public class Solution {
    public double solution(int n) {
        return sqrt(0.0, n+1.0, n);
    }

    private double sqrt(double left, double right, int target){
        if(round(left) == round(right)){
            return round(left);
        }

        double mid = (left + right) / 2;
        
        if(mid * mid <= target){
            return sqrt(mid, right, target);
        } else {
            return sqrt(left, mid, target);
        }
    }

    private double round(double x){
        return Math.round(x * 1000.0) / 1000.0;
    }
}