import java.util.ArrayList;
import java.util.Arrays;

public class Card {
    String suit;
    String symbol;
    int value;

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }
}
