package Chess.Exceptions;

import BoardGame.Exceptions.BoardException;

public class ChessException extends BoardException {
    public ChessException(String msg) {
        super(msg);
    }
}
