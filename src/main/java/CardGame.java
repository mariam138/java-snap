import java.util.ArrayList;

public class CardGame {
    ArrayList<Card> cards = new ArrayList<>(52);
    String nameOfGame;

    //    We pass in the card deck and name of game to be played when creating a new card game instance
    public CardGame(ArrayList<Card> cards, String name) {
        this.cards = cards;
        this.nameOfGame = name;
    }
}
