package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Deck {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>(52);

        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                deck.add(new Card(r.getValue(), s));
            }
        }

        for (Card card : deck) {
            System.out.println(card);
        }
        Collections.shuffle(deck);
        for (Card card : deck) {
            System.out.println(card);
        }
        System.out.println(Rank.TWO.getValue());
    }

}