import java.util.ArrayList;

public class CardGame {
    ArrayList<Card> cards = new ArrayList<>(52);
    String nameOfGame;

    // We pass in the name of game to be played when creating a new card game instance
    public CardGame(String name) {
        this.nameOfGame = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
