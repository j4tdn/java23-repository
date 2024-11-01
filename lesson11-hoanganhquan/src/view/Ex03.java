package view;

import bean.Deck;
import bean.Dictionary;

public class Ex03 {
	
	public static void main (String[] args) {
		
		 Deck deck = new Deck();

	       
		 deck.shuffle();

		 deck.dealCards(4);
		
	}

}
