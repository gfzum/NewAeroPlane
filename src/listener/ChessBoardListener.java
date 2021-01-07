package listener;

import   model.ChessBoard;
import   model.ChessBoardLocation;
import   model.ChessPiece;

public interface ChessBoardListener extends Listener {
    void onChessPiecePlace(ChessBoardLocation location, ChessPiece piece);

    void onChessPieceRemove(ChessBoardLocation location);

    void onChessBoardReload(ChessBoard board);
}
