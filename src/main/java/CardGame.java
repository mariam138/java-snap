import java.util.ArrayList;

public class CardGame {
    private ArrayList<Card> deckOfCards;
    private String nameOfGame;

    // We have 4 suits
    // For each suit, we need to create 13 cards from 2 - A
    // We add all of these cards together to create a deck of 52

    // spade, club, heart, diamond
    private static final String[] SUITS = {"\u2660", "\u2663", "\u2665", "\u2666"};
    private static final String[] SYMBOLS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final int[] VALUES = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public enum CardValue {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        J(11),
        Q(12),
        K(13),
        A(14);

        private int cardValue;
        private CardValue(int value) {
            this.cardValue = value;
        }

        public int getCardValue() {
            return cardValue;
        }
    }

    // We pass in the name of game to be played when creating a new card game instance
    public CardGame(ArrayList<Card> cards, String name) {
        this.nameOfGame = name;
        this.deckOfCards = new ArrayList<>(52);


    }

}