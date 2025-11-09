public class Main {

    public static void main(String[] args) {

        String[][] array1 = {
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"}
        };

        String[][] array2 = {
                {"B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B"},
                {"W", "B", "B", "B", "B", "B", "B", "B", "W", "B", "B", "B", "B"},
                {"W", "B", "W", "B", "W", "B", "W", "B", "W", "B", "W", "B", "B"},
                {"B", "B", "B", "W", "B", "W", "B", "W", "B", "W", "B", "W", "B"},
                {"W", "B", "W", "B", "W", "B", "B", "B", "W", "B", "W", "B", "B"},
                {"W", "B", "B", "W", "B", "W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "B", "W", "B", "W", "B", "B", "B", "W", "B", "W", "B", "B"},
                {"B", "B", "B", "W", "B", "W", "W", "W", "W", "W", "B", "W", "B"},
                {"B", "B", "W", "B", "W", "B", "W", "B", "W", "B", "W", "B", "B"},
                {"B", "B", "B", "W", "B", "W", "B", "W", "B", "W", "B", "W", "B"}
        };
        int result = solution(array1);
        System.out.println(result);
    }

    public static int solution(String[][] array) {
        int rowCount = array.length;
        int columnCount = array[0].length;

        int answer = 0;

        int whiteChessBoardWrongColorCount = 0;
        int blackChessBoardWrongColorCount = 0;

        StringBuilder whiteChessBoard = new StringBuilder();
        StringBuilder blackChessBoard = new StringBuilder();

        int chessBoardCount = (rowCount - 7) * (columnCount - 7);
        String[] chessBoard = new String[chessBoardCount];
        int boardIndex = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    whiteChessBoard.append("W");
                    blackChessBoard.append("B");
                }
                if ((i + j) % 2 == 1) {
                    whiteChessBoard.append("B");
                    blackChessBoard.append("W");
                }
            }
        }

        for (int i = 0; i <= rowCount - 8; i++) {
            for (int j = 0; j <= columnCount - 8; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        sb.append(array[i + k][j + l]);
                    }
                }
                chessBoard[boardIndex] = sb.toString();
                boardIndex++;
            }
        }

        for (int j = 0; j < chessBoardCount; j++) {
            for (int i = 0; i < whiteChessBoard.length(); i++) {
                if (whiteChessBoard.charAt(i) != chessBoard[j].charAt(i)) {
                    whiteChessBoardWrongColorCount++;
                }
                if (blackChessBoard.charAt(i) != chessBoard[j].charAt(i)) {
                    blackChessBoardWrongColorCount++;
                }
                answer = Math.min(whiteChessBoardWrongColorCount, blackChessBoardWrongColorCount);
            }
            whiteChessBoardWrongColorCount = 0;
            blackChessBoardWrongColorCount = 0;
        }
        return answer;
    }
}
