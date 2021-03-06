package game;

import board.ChessBoard;
import sun.font.TrueTypeFont;

import javax.swing.*;
import java.awt.*;

public class ChessGame {

    public static void main(String[] args) {

        ChessFrame frame = new ChessFrame();
        frame.setBounds(10, 10, 64 * 8 + 16, 64 * 8 + 38);
        frame.setResizable(false);

        ChessBoard chessBoard = new ChessBoard();
        BoardPanel panel = new BoardPanel(chessBoard);

        frame.add(panel);
        frame.setVisible(true);
    }
}
