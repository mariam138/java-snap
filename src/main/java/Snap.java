public class Snap extends CardGame {
    public Snap(String name) {
        super(name);
    }
    Card prevCard = null;
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

    // while game is running (game = true)
    // when user presses enter in the terminal, playTurn() should be called which:
    // dealCard();
    // set dealCard() to currCard
    // set initial prevCard state to null;
    // then call compareCardValues() with currCard and prevCard as arguments
    // if false, continue game
    // prevCard = currCard;
    // currCard is reset to dealCard() written above
    // if true, end game -> return game = false;
// while loop written in Main to incorporate scanner
// protected boolean playTurn() should include the following logic only:
    // Card currCard = dealCard();
    // Card prevCard;
    // compareCardValues(prevCard, currCard)
    // if false
    // prevCard = currCard
    // return true or false from compareCardValues()
// return value will be used in while loop in main to either continue or end game

    // compare values of last two cards to end game
    // cardA.getCardValue == lastCard.getCardValue
    // if true, "You win!" and end game
    protected boolean compareCardValues(Card prevCard, Card currCard) {
        return prevCard.getCardValue() == currCard.getCardValue();
    }

//    protected Card playTurn() {
//        Card currCard = dealCard();
//        return currCard;
//    }

    protected boolean playTurn() {
        Card currCard = dealCard();

       boolean result = compareCardValues(prevCard, currCard);
       if (!result) {
           prevCard = currCard;
       }

       return result;
    }
}



