package Chess.pieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.enums.Color;

public abstract class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "P";
    }

    
}
