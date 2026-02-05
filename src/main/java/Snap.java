public class Snap extends CardGame {
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
        return deckOfCards.removeLast();
    }

    // compare values of last two cards to end game
    // cardA.getCardValue == lastCard.getCardValue
    // if true, "You win!" and end game
    protected boolean compareCardValues(Card prevCard, Card currCard) {

        //            previousCard = dealtCard;
        //        System.out.println("dealt card:" + dealtCard);
        //        System.out.println("prev card:" + previousCard);
        //        Card newDealtCard = dealCard();
        //        System.out.println("new card:" + newDealtCard);
        ////        System.out.println(dealCard());

        return prevCard.getCardValue() == currCard.getCardValue();
    }
}
