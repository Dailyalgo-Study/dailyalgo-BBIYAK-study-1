public class Solution {
    private static int[] mems_glob;
    private static long limit_glob;

    public int solution(long limit, int[] mems) {
        limit_glob = limit;
        mems_glob = mems;

        return binary_search(0, 1000000);
    }

    private long getBackup(int x){
        long sum = 0L;
        for(int m : mems_glob){
            if(m > x){
                sum += (m - x);
            }
        }
        return sum;
    }

    private int binary_search(int left, int right){
        if(left == right){
            return left;
        }

        int mid = (left + right) / 2;
        if(getBackup(mid) <= limit_glob){
            return binary_search(left, mid);
        } else {
            return binary_search(mid+1, right);
        }
    }
}

