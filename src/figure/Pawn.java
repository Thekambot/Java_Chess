package figure;

import chess.Player;
import icons.FigureImage;

import java.awt.*;

public class Pawn extends Figure {


    Pawn(FigureType type, FigureColor color) {
        super(type, color);
    }

    Pawn(Player player, FigureType type, FigureColor color) {
        super(player, type, color);
    }
}
