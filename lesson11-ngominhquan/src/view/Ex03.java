package view;

import bean.Deck;

public class Ex03 {
	
	public static void main(String[] args) {
		
		 // Tạo bộ bài mới
        Deck deck = new Deck();

        // Xáo bài
        deck.shuffle();

        // Chia bài cho 4 người chơi
        deck.dealCards(4);
    }
		
}


