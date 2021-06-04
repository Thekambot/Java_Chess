package logic.board;

import logic.pieces.Piece;

public class Tile {

    private Piece piece;

    public Tile() {
        this.piece = null;
    }
    public Tile(Piece piece) {
        this.piece = piece;
    }

    public boolean removeFigure() {
        if (this.piece == null)
            return false;

        this.piece = null;
        return true;
    }

    public boolean setFigure(Piece piece) {
        if (this.piece != null)
            this.removeFigure();

        this.piece = piece;
        return true;
    }

    public Piece getFigure() {
        return piece;
    }

}
