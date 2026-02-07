public class Snap extends CardGame {
    public Snap(String name) {
        super(name);
    }

    Card prevCard = null;

    // compare values of last two cards to end game
    // if true, "You win!" and end game
    protected boolean compareCardValues(Card prevCard, Card currCard) {
        if (prevCard == null) {
            return false;
        }
        return prevCard.getCardValue() == currCard.getCardValue();
    }

    protected boolean playTurn() {
        Card currCard = dealCard();
        System.out.println(currCard);

        boolean result = compareCardValues(prevCard, currCard);
        if (!result) {
            prevCard = currCard;
        }

        return result;
    }
}
