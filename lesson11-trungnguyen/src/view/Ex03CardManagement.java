package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;
import model.CardDataModel;

public class Ex03CardManagement {

	public static void main(String[] args) {
		
		List<Card> cards = CardDataModel.generateCards();
		
		shuffle(cards);
		
        List<List<Card>> hands = divideCardsBy4(cards);
        
        for (int i = 0; i < hands.size(); i++) {
            System.out.println("Bài người chơi " + (i + 1) );
            for (Card card : hands.get(i)) {
                System.out.println(card);
            }
            System.out.println();
        }

	}
	
	public static void shuffle(List<Card> cards) {
		Collections.shuffle(cards);
	}
	
	public static List<List<Card>> divideCardsBy4(List<Card> cards) {
		List<List<Card>> hands = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			hands.add(new ArrayList<>(cards.subList(i * 13 , (i+1) * 13)));
		}
		return hands;
	}
}
