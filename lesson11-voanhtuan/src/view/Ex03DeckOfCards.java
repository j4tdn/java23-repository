package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;
import model.DataModel;

public class Ex03DeckOfCards {

	public static void main(String[] args) {
		List<Card> deck = DataModel.generateCards();
		
		// Thực hiện xào bài
		Collections.shuffle(deck);
		
		// Chia bài cho 4 người chơi
		List<List<Card>> players = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            players.add(
            		new ArrayList<>(
            				deck.subList(i * 13, (i + 1) * 13)));
        }
        
        // In ra danh sách bài của mỗi người chơi.
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Player " + (i + 1) + ": ");
            for (Card card : players.get(i)) {
                System.out.println(card);
            }
            System.out.println();
        }

	}
	
}
