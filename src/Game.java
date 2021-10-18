import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to hang-man!\nLet's play..");
        for (int i = 0; i < 10; i++) {
            System.out.println("Please type a character-guess:");
            String inputCharGuessString = scanner.next();
            char[] charArrayOfGuess = inputCharGuessString.toCharArray();
            GameMode gameOne = new GameMode();
            gameOne.matchCharacterWithString(charArrayOfGuess[i],"abe");
        }
    }
    static Scanner scanner = new Scanner(System.in);
}
