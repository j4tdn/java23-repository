package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;


public class Ex03PlayingCard {
	public static void main(String[] args) {
		List<Card> cards = new ArrayList<>();
		String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String [] ranks = {"2", "3", "4","5", "6","7","8","9","10", "J" ,"Q","K","A"};

		for(String suit :suits) {
			for(String rank : ranks) {
				cards.add(new Card(suit, rank));
			}
		}
		// xao bai 
		shuffle(cards);
		System.out.println("Danh Sach moi nguoi choi");
		dealCards(cards);

	}
	private static void shuffle(List <Card> deck) {
		Collections.shuffle(deck);
	}
	private static void dealCards(List<Card> cards){
		List<List<Card>> playerCards = new ArrayList<>();
		for(int i = 0 ; i < 4; i++) {
			playerCards.add(new ArrayList<Card>());
		}
		for(int i = 0 ; i < 4; i++) {
			playerCards.get(i % 4).add(cards.get(i));
		}
		for(int i = 0 ; i < 4; i++) {
			System.out.println("Player " + (i + 1) + "s cards: ");
			for(Card card : playerCards.get(i)) {
				System.out.println(cards);
			}
			System.out.println();
		}
	}
}