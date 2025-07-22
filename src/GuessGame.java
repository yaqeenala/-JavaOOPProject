//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private int secretNumber;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.play();

        System.out.println("Do you want to play again?");
        String playAgain = game.scanner.next();

        while (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y")) {
            game.play();
            System.out.println("Do you want to play again?");
            playAgain = game.scanner.next();
        }

        System.out.println("Thanks for playing!");
    }

    public void play() {
        guessGame();
        start();
    }

    public void guessGame() {
        Random randomNumber = new Random();
        secretNumber = randomNumber.nextInt(100) + 1;
    }

    public boolean checkGuess(int userGuess) {
        return userGuess == secretNumber;
    }

    public void start() {
        for (int tries = 0; tries < 5; tries++) {
            System.out.println("Guess the number (1-100): ");
            int userGuess = scanner.nextInt();

            if (checkGuess(userGuess)) {
                System.out.println("You got it!");
                return;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }
        }

        System.out.println("The correct answer was: " + secretNumber);
    }
}
