import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    protected ArrayList<Card> deckOfCards;
    private String nameOfGame;

    // spade, club, heart, diamond
    private static final String[] SUITS = {"\u2660", "\u2663", "\u2665", "\u2666"};

    // We pass in the name of game to be played when creating a new card game instance
    // We don't pass in a deck of cards as a param, we just want to create the deck when a game is instantiated
    public CardGame(String name) {
        this.nameOfGame = name;
        this.deckOfCards = createDeck();
    }

    protected ArrayList<Card> createDeck() {
        ArrayList<Card> deckOfCards = new ArrayList<>(52);
        // Loop through each card of a suit to assign its value based on the enum
        // enum has 12 elements so we set i < 13
        for (int i = 0; i < 13; i++) {
            CardValue value = CardValue.values()[i];
            // For each value we then assign it to a card instance alongside the suit, then add it to the
            // deck
            for (int j = 0; j < 4; j++) {
                Card card = new Card(SUITS[j], value);
                deckOfCards.add(card);
            }
        }
        return deckOfCards;
    }

    //    Takes card from top of deck and returns it
    protected Card dealCard() {
        return deckOfCards.removeLast();
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
