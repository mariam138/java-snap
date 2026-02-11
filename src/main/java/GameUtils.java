import java.util.Scanner;

public class GameUtils {

    private GameUtils() {
    }

    //    While loop to ask user if they want to play again before game exits
    private static boolean askToPlayAgain(Scanner scanner) {
        System.out.println("Would you like to play again? (y/n)");

        while (true) {
            String playAgain = scanner.nextLine();
            switch (playAgain) {
                case "y":
                    return true;
                case "n":
                    System.out.println("Goodbye!");
                    return false;

                default:
                    System.out.println("Invalid input. Please enter y/n");
            }
        }
    }
}
