public class Snap extends CardGame{
    public Snap(String name) {
        super(name);
    }

    // Ask user if they want to play snap
        // y - start game
        // n - exit game
    // start game set up
        // shuffle deck
    // game
        // when user presses enter, deal first card - dealCard()
        // a card is dealt each turn
        // Compare just dealt card and card before by their cardValue
        // If the value matches, tell player they have won
        // end the game

    // Deals out last card from deck, and then makes sure to remove it from deckOfCards
    @Override
    protected Card dealCard() {
        Card lastCard = deckOfCards.getLast();
        deckOfCards.remove(lastCard);
        return lastCard;
    }

}
