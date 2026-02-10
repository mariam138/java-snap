import java.util.ArrayList;

public class Snap extends CardGame {
    private Card prevCard = null;
    private final ArrayList<Card> deckOfCards = getDeckOfCards();

    // Custom colours for terminal text
    // Declaring ANSI_RESET so that we can reset the colour
    public static final String ANSI_RESET = "\u001B[0m";
    // Set colour to pink
    public static final String ANSI_PINK = "\u001B[35m";

    protected Snap(String name) {
        super(name);
        setNoOfPlayers(2);
    }

    //    Checks if deck of cards is empty when dealing a card
    //    If empty, re-assign internal deckOfCards to new 52-deck and shuffle
    //    Edge-case for in case snap hasn't happened in first shuffle
    @Override
    protected Card dealCard() {
        if (deckOfCards.isEmpty()) {
            createDeck();
            shuffleDeck();
        }
        return super.dealCard();
    }

    // Compares values of cards to declare snap
    protected boolean compareCardValues(Card prevCard, Card currCard) {
        if (prevCard == null) {
            return false;
        }
        return prevCard.getCardValue() == currCard.getCardValue();
    }

    protected boolean playTurn() {
        Card currCard = dealCard();
        System.out.println(ANSI_PINK + currCard + ANSI_RESET);

        boolean result = compareCardValues(prevCard, currCard);
        if (!result) {
            prevCard = currCard;
        }

        return result;
    }
}
