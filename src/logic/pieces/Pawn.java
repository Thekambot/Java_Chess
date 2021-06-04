package logic.pieces;

import logic.players.Player;

public class Pawn extends Piece {


    Pawn(FigureType type, FigureColor color) {
        super(type, color);
    }

    Pawn(Player player, FigureType type, FigureColor color) {
        super(player, type, color);
    }
}
