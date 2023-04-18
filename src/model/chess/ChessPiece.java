package model.chess;

import model.boardgame.Position;

import model.boardgame.Board;
import model.boardgame.Piece;
import model.chess.enums.Color;

public abstract class ChessPiece extends Piece {
    
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece (Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }
}
