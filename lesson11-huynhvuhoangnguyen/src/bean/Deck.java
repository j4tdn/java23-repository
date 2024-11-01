package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Deck {

	private List<Card> cards;
	
	public Deck() {
		Set<Card> cardSet = new HashSet<>();
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		for(String suit : suits) {
			for(String rank : ranks) {
				cardSet.add(new Card(suit, rank));
			}
		}
		
		cards = new ArrayList<>(cardSet);
	}
	
	public List<Card> getCards() {
		return cards;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public List<Card> deal(int numberOfPlayers, int numbersOfCards) {
		List<Card> playersCards = new ArrayList<>();
		for(int i = 0; i < numberOfPlayers; i++) {
			List<Card> hand = new ArrayList<>();
			for(int j = 0; j < numbersOfCards; j++) {
				hand.add(cards.remove(0));
			}
			playersCards.addAll(hand);
		}
		return playersCards;
	}

	@Override
	public String toString() {
		return "Deck [cards=" + cards + "]";
	}
	
}