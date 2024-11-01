package view;

import java.util.List;

import bean.Card;
import model.Deck;

public class Ex03CardGame {

	public static void main(String[] args) {
        Deck deck = new Deck(); 
        deck.shuffle(); 

        int numberOfPlayers = 4;
        int cardsPerPlayer = 5; 
        for (int i = 0; i < numberOfPlayers; i++) {
            List<Card> playerCards = deck.deal(cardsPerPlayer); // Chia bài
            System.out.println("Người chơi " + (i + 1) + ": " + playerCards +"\n");
        }
    }
}
