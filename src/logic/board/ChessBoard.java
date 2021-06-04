package logic.board;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {

    private final int WIDTH = 8;
    private final int HEIGHT = 8;

    private final Map<TileCoordinate, Tile> board;

    private void fillBoardMap(Map<TileCoordinate, Tile> map) {

        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= WIDTH; j++) {

                map.put(new TileCoordinate(j, i), new Tile());
            }
        }
    }

    public ChessBoard() {
        this.board = new HashMap<TileCoordinate, Tile>();
        fillBoardMap(this.board);
    }

    public Tile getSquare(TileCoordinate coordinate) {
        return board.get(coordinate);
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }
}
