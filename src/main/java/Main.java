import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static void main(String[] args) {

        Snap snap = new Snap("snap");

        // Ask user if they want to play snap
        // y - start game
        // n - exit game
        // start game set up
        // shuffle deck
        // game
        // when user presses enter, deal first card - dealCard()
        // a card is dealt each turn
        // Compare just dealt card and card before by their cardValue
        // If the value matches, tell player they have won
        // end the game

        // while game is running (game = true)
        // when user presses enter in the terminal, playTurn() should be called which:
        // dealCard();
        // set dealCard() to currCard
        // set initial prevCard state to null;
        // then call compareCardValues() with currCard and prevCard as arguments
        // if false, continue game
        // prevCard = currCard;
        // currCard is reset to dealCard() written above
        // if true, end game -> return game = false;
// while loop written in Main to incorporate scanner
// return value will be used in while loop in main to either continue or end game

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
        System.out.printf("Hello user! Let's play %s!", snap.nameOfGame);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
//                snap.shuffleDeck();
//                System.out.println(snap.deckOfCards);
                System.out.println("\nPress enter to take your turn.");
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 1500);
        snap.shuffleDeck();


    }
}
