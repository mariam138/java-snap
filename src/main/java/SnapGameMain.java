import java.io.PrintWriter;
import java.util.Scanner;

public class SnapGameMain {
    static void main(String[] args) throws InterruptedException {

        Snap snap = new Snap("snap");
        boolean game = true;

        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out, true);

        System.out.printf("Hello! Let's play %s!\n", snap.getNameOfGame());
        Thread.sleep(1000);
        System.out.println("This is a two player game.");
        Thread.sleep(1000);
        System.out.println("Player 1, please enter your name:");
        String nameOne = scanner.nextLine();
        System.out.println("Player 2, please enter your name:");
        String nameTwo = scanner.nextLine();

        // Initialise new player instances for game
        Player playerOne = new Player(nameOne);
        Player playerTwo = new Player(nameTwo);

        System.out.printf("Player 1: %s\n", playerOne.getPlayerName().toUpperCase());
        System.out.printf("Player 2: %s\n", playerTwo.getPlayerName().toUpperCase());
        System.out.println("Let's play!");
        Thread.sleep(2000);
        snap.shuffleDeck();
        System.out.println("The deck has been shuffled!\n");

        int turnNumber = 0;
        Player currentPlayer;
        Thread.sleep(1000);

        while (game) {
            turnNumber++;
            // Assign current player based on turn number
            currentPlayer = (turnNumber % 2 == 0) ? playerTwo : playerOne;

            System.out.printf("%s's TURN:\n", currentPlayer.getPlayerName().toUpperCase());
            System.out.println("Press enter to deal a card.");

            // Use helper method to check that enter key has been pressed
            waitForEnter(scanner);
            boolean snapOccurred = snap.playTurn();

            if (snapOccurred) {
                Thread.sleep(500);
                System.out.printf(
                        "%s, write 'SNAP' to win!\n",
                        currentPlayer.getPlayerName().toUpperCase());
                // Calculate elapsed time that user took to enter "snap"
                // Then compare elapsed time to 2 seconds to determine whether user has won
                long startTime = System.currentTimeMillis();
                String snapInput = scanner.nextLine();
                long elapsedTime = System.currentTimeMillis() - startTime;
                if (elapsedTime <= 2000 && snapInput.equalsIgnoreCase("snap")) {
                    printWriter.printf(
                            "\uD83C\uDCCF %s WINS \uD83C\uDCCF \n",
                            currentPlayer.getPlayerName().toUpperCase());
                    currentPlayer.setPlayerWon(true);

                } else {
                    System.out.printf(
                            "Sorry, %s lost :( \n",
                            currentPlayer.getPlayerName().toUpperCase());
                    if (currentPlayer.equals(playerOne)) {
                        playerTwo.setPlayerWon(true);
                        System.out.printf(
                                "\uD83C\uDCCF %s WINS \uD83C\uDCCF",
                                playerTwo.getPlayerName().toUpperCase());
                    } else {
                        playerOne.setPlayerWon(true);
                        System.out.printf(
                                "\uD83C\uDCCF %s WINS \uD83C\uDCCF",
                                playerOne.getPlayerName().toUpperCase());
                    }
                }
                game = false;
            }
        }

        System.out.println("Would you like to play again? (y/n)");
        String playAgain = scanner.nextLine();

        switch (playAgain) {
            case "y":
                turnNumber = 0;
                currentPlayer = null;
                snap.shuffleDeck();
                System.out.println("The deck has been shuffled!\n");
                game = true;
                Thread.sleep(1000);
                break;
            case "n":
                System.out.println("Goodbye!");
                scanner.close();
                break;
            default:
                System.out.println("Invalid input. Please enter y/n");
        }
    }

    //    Waits for user to press "Enter" before breaking loop and entering the rest of the main game
    private static void waitForEnter(Scanner scanner) {
        while (true) {
            String userKey = scanner.nextLine();
            if (userKey.isEmpty()) {
                return;
            }
            System.out.println("Invalid input. Please press 'enter' to deal a card.");
        }
    }
}
