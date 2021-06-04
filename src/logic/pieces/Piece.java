package logic.pieces;

import logic.players.Player;

public abstract class Piece {

    public enum FigureType {
        KING, QUEEN, BISHOP, KNIGHT, ROOK, PAWN
    }
    public enum FigureColor {
        WHITE, BLACK
    }

    private FigureType figureType;
    private FigureColor figureColor;

    private Player owner;

    Piece(FigureType type, FigureColor color) {
        this.figureType = type;
        this.figureColor = color;
    }

    Piece(Player player, FigureType type, FigureColor color) {
        this.owner = player;
        this.figureType = type;
        this.figureColor = color;
    }

    public void setFigureColor(FigureColor figureColor) {
        this.figureColor = figureColor;
    }

    public void setFigureType(FigureType figureType) {
        this.figureType = figureType;
    }

    public FigureColor getFigureColor() {
        return figureColor;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public Player getOwner() {
        return owner;
    }
}
