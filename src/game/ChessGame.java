package game;

import logic.board.ChessBoard;
import game.gui.BoardPanel;
import game.gui.GameFrame;

public class ChessGame {

    public static void main(String[] args) {

        GameFrame frame = new GameFrame();
        frame.setBounds(10, 10, 64 * 8 + 16, 64 * 8 + 38);
        frame.setResizable(false);

        ChessBoard chessBoard = new ChessBoard();
        BoardPanel panel = new BoardPanel(chessBoard);

        frame.add(panel);
        frame.setVisible(true);
    }
}
