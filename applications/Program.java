package applications;

import boardgame.Position;

//javac -d bin applications/Program.java boardgame/Position.java
//java -cp bin applications.Program
public class Program {
    public static void main(String[] args) {

        Position x = new Position(3, 5);
        System.out.println(x);
    }
}