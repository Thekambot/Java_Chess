package game.gui.icons;

import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FigureIcons {

    private static final String IMG_PATH = "Img\\chess.png";
    private static final int FIGURE_SIZE = 200;

    public enum FigureType {

        KING(0 * FIGURE_SIZE),
        QUEEN(1 * FIGURE_SIZE),
        BISHOP(2 * FIGURE_SIZE),
        KNIGHT(3 * FIGURE_SIZE),
        ROOK(4 * FIGURE_SIZE),
        PAWN(5 * FIGURE_SIZE);

        int imageOffset;

        FigureType(int value) {
            imageOffset = value;
        }
    }

    public enum FigureColor {

        WHITE(0 * FIGURE_SIZE),
        BLACK(1 * FIGURE_SIZE);

        int imageOffset;

        FigureColor(int value) {
            imageOffset = value;
        }
    }

    public static Image getFigureImage(@NotNull FigureType type, @NotNull FigureColor color) throws IOException {

        BufferedImage sprite = ImageIO.read(new File(IMG_PATH));

        int xPosition = type.imageOffset, yPosition = color.imageOffset;
        return sprite.getSubimage(xPosition, yPosition, FIGURE_SIZE, FIGURE_SIZE);
    }
}
