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
    }
}
