public enum CardValue {
    // Assign numeric values to cards
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    J(11),
    Q(12),
    K(13),
    A(14);

    private int cardValue;

    private CardValue(int value) {
        this.cardValue = value;
    }

    public int getCardValue() {
        return cardValue;
    }
}
