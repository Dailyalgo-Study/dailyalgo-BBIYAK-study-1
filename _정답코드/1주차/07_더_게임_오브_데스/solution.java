class Solution {
    public int solution(int[] target, int k) {
        int current = 1;
        for (int i = 0; i < k; i++) {
            current = target[current - 1];
        }
        return current;
    }
}