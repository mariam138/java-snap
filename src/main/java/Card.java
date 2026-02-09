public class Card {
    private String suit;
    private CardValue cardValue;

    protected Card(String suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }


    public CardValue getCardValue() {
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
                '}' + '\n';
    }
}
