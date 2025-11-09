package Chess.pieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.enums.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }
}
