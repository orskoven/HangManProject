import java.util.ArrayList;
import java.util.Scanner;

public class GameMode {
    private char charGuess;
    private ArrayList<Character> charGuessArray = new ArrayList<Character>();
    private String wordToBeGuessed;
    private char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public GameMode(String wordToBeGuessed) {
        this.wordToBeGuessed = wordToBeGuessed;
    }
    public void matchCharacterWithString(){
        char[] charArrayOfGuess = new char[wordToBeGuessed.length()];
        System.out.println("Hello and welcome to hang-man!\nLet's play..");
        char[] wordToCharArray = wordToBeGuessed.toCharArray();
        for (int i = 0; charGuessArray.size() == wordToBeGuessed.length();i++) {
            System.out.println("Please type a character-guess:");
            String inputCharGuessString = scanner.next();
            charArrayOfGuess = inputCharGuessString.toCharArray();
            if (inputCharGuessString == charArrayOfGuess[i]){
                this.charGuessArray.set(i,charGuessing);
                i++;
            } else {
                this.charGuessArray.set(i,'_');
                i--;
            }

        }
        System.out.println(charGuess);

    }
    static Scanner scanner = new Scanner(System.in);
}
