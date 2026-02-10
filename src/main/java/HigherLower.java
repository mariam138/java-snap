import java.util.Objects;

public class HigherLower extends CardGame {
    /*
    - one player game
    - shuffle the cards
    - deal a card
    - user must then guess if the next card is higher or lower
    - if user is correct, the next card is dealt and this continues
    - if user is incorrect, the game finishes and the user has lost
     */
    private int correctGuessCount = 0;

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

    protected String compareCardValues(Card currCard) {
        String cardIs = null;
        Card nextCard = deckOfCards.getLast();

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

    protected void playTurn(String userGuess, Player player) {
        Card currCard = dealCard();
        System.out.println(currCard);

        String cardIs = compareCardValues(currCard);
        boolean isUserCorrect = compareUserInput(cardIs, userGuess);

        if (isUserCorrect) {
            ++correctGuessCount;
            player.setPlayerWon(true);
        } else {
            player.setPlayerWon(false);
            correctGuessCount = 0;
        }
    }
}
