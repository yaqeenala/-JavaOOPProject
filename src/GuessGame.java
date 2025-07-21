//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class GuessGame {
    int secretNumber;

    public guessGame() {
        Random randomNumber = new Random();
        this.secretNumber = randomNumber.nextInt(100) + 1;
    }

    public boolean checkGuess(int userGuess) {

        if (userGuess == secretNumber) {
            return true;
        } else {
            return false;
        }
    }

    public void start() {
        Scanner scanner = new Scanner();
        int tries = 0;
        for (tries < 5; tries++ ) {
            System.out.println("Guess the number: ");
            int userGuess = scanner.nextInt();
            if (userGuess == secretNumber) {
                System.out.println("You got it ");
                return;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low, try again ");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high, try again ");
            }

        }
        System.out.println("the correct answer was " + secretNumber);

    }
}