package model.chess;

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
    
}
