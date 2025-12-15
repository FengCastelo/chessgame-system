package Chess.pieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.enums.Color;

public abstract class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "C";
    }
}
