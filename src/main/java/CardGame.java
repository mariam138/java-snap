import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    protected ArrayList<Card> deckOfCards;
    private final String nameOfGame;
    private int noOfPlayers;

    // spade, club, heart, diamond
    private static final String[] SUITS = {"\u2660", "\u2663", "\u2665", "\u2666"};

    // Deck of cards created on game instantiation
    protected CardGame(String name) {
        this.nameOfGame = name;
        this.deckOfCards = new ArrayList<>(52);
        createDeck();
    }

    protected void createDeck() {
        // Clear previously instantiated deckOfCards list
        deckOfCards.clear();
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
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public ArrayList<Card> getDeckOfCards() {
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

    protected void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }
}
