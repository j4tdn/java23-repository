package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import bean.Card;

public class Ex03DealingCards {
	public enum Type {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K, A
    }

    public static void main(String[] args) {
        Random rand = new Random();
        List<Card> cards = getListCard(); 

        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        List<Card> player4 = new ArrayList<>();

        while (!cards.isEmpty()) {
            for (int i = 0; i < 4 && !cards.isEmpty(); i++) {
                int r = rand.nextInt(cards.size());
                switch (i) {
                    case 0: player1.add(cards.get(r)); break;
                    case 1: player2.add(cards.get(r)); break;
                    case 2: player3.add(cards.get(r)); break;
                    case 3: player4.add(cards.get(r)); break;
                }
                cards.remove(r); 
            }
        }

        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);
        System.out.println("Player 3: " + player3);
        System.out.println("Player 4: " + player4);
    }

    private static List<Card> getListCard() {
        List<Card> cards = new ArrayList<>();

        Rank[] ranks = Rank.values();
        Type[] types = Type.values();

        for (Rank rank : ranks) {
            for (Type type : types) {
                cards.add(new Card(rank, type)); 
            }
        }
        return cards;
    }
	
}
