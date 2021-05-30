package game;

import board.ChessBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class BoardPanel extends JPanel {

    private final int SQUARE_SIZE = 64;

    private ChessBoard board;

    public BoardPanel(ChessBoard board) {
        setPreferredSize(new Dimension(SQUARE_SIZE * 8, SQUARE_SIZE * 8));
        this.board = board;
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for (int i = 0; i < board.getHEIGHT(); i++) {
            for (int j = 0; j < board.getWIDTH(); j++) {

                Rectangle2D square = new Rectangle2D.Double(j * SQUARE_SIZE, i * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);

                g2d.setColor(board.getSquare(j, i).getColor());
                g2d.fill(square);
            }
        }
    }
}
