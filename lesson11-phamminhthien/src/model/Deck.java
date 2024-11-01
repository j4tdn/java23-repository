package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;

public class Deck {
	private static List<Card> cards ;
	public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public List<Card> deal(int numberOfCards) {
		List<Card> dealtCards = new ArrayList<>();
		
		for(int i=0; i<numberOfCards; i++) {
			if(!cards.isEmpty()) {
				dealtCards.add(cards.remove(0)); // chia bài (dealtCards) và đồng thời xóa lá bài đầu tiên từ ds
			}
		}
		return dealtCards;
	}
	
	public List<Card> getCards() {
        return cards;
    }
}
