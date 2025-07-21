//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class GuessGame {
    int secretNumber;

    public guessGame() {
        Random randomNumber = new Random();
        this.secretNumber = randomNumber.nextInt(100) + 1;
    }

    public boolean checkGuess(int userGues) {

        if (userGuess == secretNumber) {
            return true;
        } else {
            return false;
        }
    }
}