package Chess.pieces;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessPiece;
import Chess.enums.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "C";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        p.setValues(position.getRow() - 1, position.getColumn() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() - 2);
        }

        p.setValues(position.getRow() - 2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }

        p.setValues(position.getRow() - 2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }

        p.setValues(position.getRow() - 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }

        p.setValues(position.getRow() + 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
            p.setColumn(p.getColumn() + 1);
        }

        p.setValues(position.getRow() + 2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
            p.setColumn(p.getColumn() - 1);
        }

        p.setValues(position.getRow() + 2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
            p.setColumn(p.getColumn() - 1);
        }

        p.setValues(position.getRow() + 1, position.getColumn() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
            p.setColumn(p.getColumn() + 1);
        }

        return mat;
    }
}
