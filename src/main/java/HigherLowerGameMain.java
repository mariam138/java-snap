import java.util.Scanner;

public class HigherLowerGameMain {
    static void main(String[] args) throws InterruptedException {
        HigherLower higherLower = new HigherLower("higher or lower");
        boolean game = true;

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
            Card currCard = higherLower.dealCard();
            System.out.println(currCard);
//            higherLower.playTurn();
//            break;
        }
    }
}
