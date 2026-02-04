import java.util.ArrayList;

public class CardGame {
    private ArrayList<Card> deckOfCards;
    private String nameOfGame;

    // We pass in the name of game to be played when creating a new card game instance
    public CardGame(ArrayList<Card> cards, String name) {
        this.deckOfCards = new ArrayList<>(52);
        this.nameOfGame = name;
    }

}

// public enum CardValue
//{
//  TWO(2),
//  THREE(3),
//  FOUR(4),
//  FIVE(5),
//  SIX(6),
//  SEVEN(7),
//  EIGHT(8),
//  NINE(9),
//  TEN(10),
//  JACK(11),
//  QUEEN(12),
//  KING(13),
//  ACE(14); }