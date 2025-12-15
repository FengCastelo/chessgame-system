package Chess.pieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.enums.Color;

public abstract class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
