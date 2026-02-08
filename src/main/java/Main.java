import java.util.Scanner;

public class Main {
    static void main(String[] args) throws InterruptedException {

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

        snap.shuffleDeck();
        System.out.println("The deck has been shuffled!\n");

        while (game) {
            System.out.println("Press enter to deal a card.");
            String userKey = scanner.nextLine();
            boolean turn = snap.playTurn();

            if (userKey.isEmpty() && turn) {
                Thread.sleep(500);
                System.out.println("Snap!");
                System.out.println("You win!");
                game = false;
            }
        }
    }
}
