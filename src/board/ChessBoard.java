package board;

public class ChessBoard {

    private final int WIDTH = 8;
    private final int HEIGHT = 8;

    private Square[][] board;

    private void fillSquareArray() {

        boolean whiteSquare = true;

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {

                if (whiteSquare) {
                    board[i][j] = new WhiteSquare();
                    whiteSquare = false;
                } else {
                    board[i][j] = new BlackSquare();
                    whiteSquare = true;
                }
            }
            whiteSquare = !whiteSquare;
        }
    }

    public ChessBoard() {
        this.board = new Square[HEIGHT][WIDTH];
        fillSquareArray();
    }

    public Square getSquare(int x, int y) {
        return board[y][x];
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }
}
