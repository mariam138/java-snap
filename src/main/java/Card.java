import java.util.ArrayList;

public class Card {
    String[] suit = {"\u2660", "\u2663", "\u2665", "\u2666"};
    String[] symbol = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    int value;

//    ArrayList<suit> suits = new ArrayList<>();


    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }
}
