package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void dealCards(int numPlayers) {
        if (numPlayers != 4) {
            System.out.println("This game requires exactly 4 players.");
            return;
        }

        List<List<Card>> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new ArrayList<>());
        }

        for (int i = 0; i < cards.size(); i++) {
            players.get(i % numPlayers).add(cards.get(i));
        }

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (Card card : players.get(i)) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
	
}
