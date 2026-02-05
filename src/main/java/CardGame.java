import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    private ArrayList<Card> deckOfCards;
    private String nameOfGame;

    // spade, club, heart, diamond
    private static final String[] SUITS = {"\u2660", "\u2663", "\u2665", "\u2666"};

    //    Assign numeric values to the cards using enum
    private enum CardValue {
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
//    We don't pass in a deck of cards as a param, we just want to create the deck when a game is instantiated
    public CardGame(String name) {
        this.nameOfGame = name;
        this.deckOfCards = new ArrayList<>(52);
//        Loop through each card of a suit to assign its value based on the enum
//        enum has 12 elements so we set i < 13
        for (int i = 0; i < 13; i++) {
            CardValue value = CardValue.values()[i];
//            For each value we then assign it to a card instance alongside the suit, then add it to the deck
            for (int j = 0; j < 4; j++) {
                Card card = new Card(SUITS[j], value);
                deckOfCards.add(card);
            }
        }

    }

//    Takes card from top of deck and returns it
    protected Card dealCard() {
        return deckOfCards.getLast();
    }

//    Sorts the deck in ascending number order based on the card value
    protected ArrayList<Card> sortDeckInNumberOrder() {
       deckOfCards.sort(Comparator.comparing(Card::getCardValue));
       return deckOfCards;
    }

    // Sorts deck based on suits
    protected ArrayList<Card> sortDeckIntoSuits() {
        deckOfCards.sort(Comparator.comparing(Card::getSuit));
        return deckOfCards;
    }

    protected ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

}