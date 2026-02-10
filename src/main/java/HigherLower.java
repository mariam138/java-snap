import java.util.Objects;

public class HigherLower extends CardGame {
    private int correctGuessCount = 0;
    private Card nextCard = deckOfCards.getLast();

    protected HigherLower(String name) {
        super(name);
        setNoOfPlayers(1);
    }

    public int getCorrectGuessCount() {
        return correctGuessCount;
    }

    public void setCorrectGuessCount(int correctGuessCount) {
        this.correctGuessCount = correctGuessCount;
    }

    public Card getNextCard() {
        return nextCard;
    }

    @Override
    protected Card dealCard() {
        if (deckOfCards.isEmpty()) {
            createDeck();
            shuffleDeck();
        }
        return super.dealCard();
    }

    protected String compareCardValues(Card currCard) {
        String cardIs = null;

        if (nextCard.getCardValue().compareTo(currCard.getCardValue()) > 0) {
            cardIs = "higher";

        } else if (nextCard.getCardValue().compareTo(currCard.getCardValue()) < 0) {
            cardIs = "lower";
        } else if (nextCard.getCardValue().compareTo(currCard.getCardValue()) == 0) {
            cardIs = "equal";
        }
        return cardIs;
    }

    protected boolean compareUserInput(String cardIs, String userInput) {
        boolean isUserCorrect;
        isUserCorrect = Objects.equals(userInput, cardIs);
        return isUserCorrect;
    }

    protected boolean playTurn(String userGuess, Player player, Card currCard) {

        String cardIs = compareCardValues(currCard);
        boolean isUserCorrect = compareUserInput(cardIs, userGuess);

        if (isUserCorrect) {
            ++correctGuessCount;
            player.setPlayerWon(true);
        } else {
            player.setPlayerWon(false);
            setCorrectGuessCount(0);
        }
        return isUserCorrect;
    }
}
