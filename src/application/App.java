package application;

import java.util.Scanner;

import model.chess.ChessMatch;
import model.chess.ChessPiece;
import model.chess.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");   
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedChessPiece = chessMatch.performChessPiece(source, target);
        }

        
        
    }
}