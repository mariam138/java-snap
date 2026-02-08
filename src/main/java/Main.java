import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws InterruptedException {

        Snap snap = new Snap("snap");
        boolean game = true;

        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out, true);
        //                System.out.printf("Hello user! Do you want to play %s?\ny/n\n", snap.nameOfGame);
        //                String input = scanner.next();
        //                if (input.equals("y")) {
        //                    System.out.println("Let's play!");
        //                    scanner.next();
        //                } else if (input.equals("n")) {
        //                    System.out.println("Goodbye!");
        //                    scanner.close();
        //                }
        System.out.printf("Hello! Let's play %s!\n", snap.nameOfGame);
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

        System.out.printf("Player 1: %s\n", playerOne.getPlayerName());
        System.out.printf("Player 2: %s\n", playerTwo.getPlayerName());
        System.out.println("Let's play!");
        Thread.sleep(2000);
        snap.shuffleDeck();
        System.out.println("The deck has been shuffled!\n");

        while (game) {
            System.out.println("Press enter to deal a card.");
            String userKey = scanner.nextLine();
            boolean turn = snap.playTurn();

            if (userKey.isEmpty() && turn) {
                Thread.sleep(500);
                printWriter.println("\uD83C\uDCCF SNAP \uD83C\uDCCF");
                System.out.println("You win!");
                game = false;
            }
        }
    }
}
