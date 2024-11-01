package view;

import java.util.ArrayList;
import java.util.List;

import bean.Card;
import bean.Deck;

public class Ex03CardsDealer {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck);
		
		int numbersOfPlayers = 4;
		int cardsPerPlayers = 13;
		
		List<List<Card>> playerHand = new ArrayList<>();
		
		for(int i = 0; i < numbersOfPlayers; i++) {
			List<Card> hand = new ArrayList<>();
			for(int j = 0; j < cardsPerPlayers; j++) {
				hand.add(deck.getCards().remove(0));
			}
			playerHand.add(hand);
		}
		
		for(int i = 0; i < playerHand.size(); i++) {
			System.out.println("Player " + (i + 1) + "'s hand: " + playerHand.get(i));
		}
		
	}
	
}