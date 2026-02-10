import java.util.Scanner;

public class HigherLowerGameMain {
    static void main(String[] args) throws InterruptedException {
        HigherLower higherLower = new HigherLower("higher or lower");
        boolean game = true;

        // Custom colours for terminal text
        // Declaring ANSI_RESET so that we can reset the colour
        final String ANSI_RESET = "\u001B[0m";
        // Set colour to yellow
        final String ANSI_YELLOW = "\u001B[33m";

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hello! Let's play %s!\n", higherLower.getNameOfGame());
        Thread.sleep(1000);
        System.out.println("This is a one-player game.");
        Thread.sleep(1000);
        System.out.println("Player, please enter your name:");
        String name = scanner.nextLine();

        Player player = new Player(name);

        System.out.printf("Okay %s, let's play higher or lower!\n", player.getPlayerName());
        Thread.sleep(2000);

        higherLower.shuffleDeck();
        System.out.println("The deck has been shuffled!");
        Thread.sleep(1000);

        while (game) {
            System.out.printf("Current streak: %d\n", higherLower.getCorrectGuessCount());
            System.out.println(" ");
            Thread.sleep(1000);
            Card currCard = higherLower.dealCard();
            System.out.println(ANSI_YELLOW + currCard + ANSI_RESET);

            System.out.println("Is the next card higher or lower?");
            System.out.println("Enter either 'higher' or 'lower': ");
            String guess = scanner.nextLine().toLowerCase();

            boolean result = higherLower.playTurn(guess, player, currCard);

            if (result) {
                System.out.println("Correct!");
            } else {
                System.out.printf(
                        "Sorry, wrong guess. The next card is %s.\n", higherLower.compareCardValues(currCard));
                System.out.println(" ");
                System.out.println(ANSI_YELLOW + higherLower.nextCard + ANSI_RESET);
                System.out.println("Game over :(");
                Thread.sleep(500);
                game = false;
            }
        }
    }
}
