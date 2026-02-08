import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import static java.awt.event.KeyEvent.VK_ENTER;

public class Main {
    static void main(String[] args) {

        Snap snap = new Snap("snap");
        boolean game = true;

        Scanner scanner = new Scanner(System.in);
        //                System.out.printf("Hello user! Do you want to play %s?\ny/n\n", snap.nameOfGame);
        //                String input = scanner.next();
        //                if (input.equals("y")) {
        //                    System.out.println("Let's play!");
        //                    scanner.next();
        //                } else if (input.equals("n")) {
        //                    System.out.println("Goodbye!");
        //                    scanner.close();
        //                }
        System.out.printf("Hello user! Let's play %s!\n", snap.nameOfGame);

        //        TimerTask timerTask = new TimerTask() {
        //            @Override
        //            public void run() {
        //                snap.shuffleDeck();
        //                System.out.println(snap.deckOfCards);
        //                System.out.println("\nPress enter to take your turn.");
        //            }
        //        };
        //        Timer timer = new Timer();
        //        timer.schedule(timerTask, 1500);
        snap.shuffleDeck();
        System.out.println("The deck has been shuffled!\n");
        while (game) {
            System.out.println("Press enter to deal a card.");
            String userKey = scanner.nextLine();
            boolean turn = snap.playTurn();

            if (userKey.isEmpty() && turn) {
                System.out.println("Snap!");
                System.out.println("You win!");
                game = false;
            }
        }
    }
}
