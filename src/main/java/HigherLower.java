import java.util.ArrayList;

public class HigherLower extends CardGame {
    /*
    - one player game
    - shuffle the cards
    - deal a card
    - user must then guess if the next card is higher or lower
    - if user is correct, the next card is dealt and this continues
    - if user is incorrect, the game finishes and the user has lost
     */
    private Card prevCard = null;
    private final ArrayList<Card> deckOfCards = getDeckOfCards();

    protected HigherLower(String name) {
        super(name);
        setNoOfPlayers(1);
    }

    @Override
    protected Card dealCard() {
        if (deckOfCards.isEmpty()) {
            createDeck();
            shuffleDeck();
        }
        return super.dealCard();
    }
}
