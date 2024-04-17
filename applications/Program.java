package applications;

import boardgame.Board;
import boardgame.Position;

//javac -d bin applications/Program.java boardgame/Position.java
//java -cp bin applications.Program
public class Program {
    public static void main(String[] args) {

        Board board = new Board(8, 8);
    }
}