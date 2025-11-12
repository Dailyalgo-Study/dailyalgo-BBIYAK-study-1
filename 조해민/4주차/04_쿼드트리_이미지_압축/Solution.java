package dailyalgo_study_1;

public class Solution {

    public String solution(int[][] img) {
        return compress(img, 0, 0, img.length);
    }

    private String compress(int[][] img, int x, int y, int size) {
        if (zeroOrOne(img, x, y, size)) {
            return String.valueOf(img[y][x]);
        }

        int dividedSize = size / 2;
        
        String result = "(";

        int[][] dxdy = {{0, 0}, {dividedSize, 0}, {0, dividedSize}, {dividedSize, dividedSize}};

        for (int i = 0; i < 4; i++) {
            int dx = dxdy[i][0];
            int dy = dxdy[i][1];
            
            result += compress(img, x + dx, y + dy, dividedSize);
        }

        result += ")";
        
        return result;
    }

    private boolean zeroOrOne(int[][] img, int x, int y, int size) {
        int value = img[y][x];
        
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (img[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}