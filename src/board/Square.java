package board;

import figure.Figure;

import java.awt.*;

public abstract class Square {

    private Figure figure;
    private Color color;

    public Square() {
        this.figure = null;
    }

    public Square(Figure figure) {
        this.figure = figure;
    }

    public boolean removeFigure() {
        if (this.figure == null)
            return false;

        this.figure = null;
        return true;
    }

    public boolean setFigure(Figure figure) {
        if (this.figure != null)
            this.removeFigure();

        this.figure = figure;
        return true;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
