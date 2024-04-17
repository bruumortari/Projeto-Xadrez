package applications;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

//javac -d bin applications/Program.java boardgame/Position.java
//java -cp bin applications.Program ----> para executar
public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}