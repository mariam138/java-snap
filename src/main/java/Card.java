public class Card {
   private String suit;
//    String symbol;
//    int value;
    private CardGame.CardValue cardValue;

    public Card(String suit, CardGame.CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
//        this.symbol = symbol;
//        this.value = value;

    }

//    @Override
//    public String toString() {
//        return "Card{" +
//                "suit='" + suit + '\'' +
//                ", symbol='" + symbol + '\'' +
//                ", value=" + value +
//                '}';
//    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", cardValue=" + cardValue +
                '}';
    }
}
