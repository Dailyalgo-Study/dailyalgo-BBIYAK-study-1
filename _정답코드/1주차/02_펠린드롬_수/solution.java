class Solution {
    public boolean solution(int n) {
        String s = Integer.toString(n);
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}