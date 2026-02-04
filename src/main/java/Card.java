public class Card {
    private String suit;
    private CardGame.CardValue cardValue;

    public Card(String suit, CardGame.CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }


    public CardGame.CardValue getCardValue() {
        return cardValue;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", cardValue=" + cardValue +
                '}';
    }
}
