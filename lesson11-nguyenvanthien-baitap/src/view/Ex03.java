package view;

import java.util.List;

import bean.Card;
import model.Deck;

public class Ex03 {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle(); // Xáo bài

        // Chia bài cho 4 người chơi
        List<List<Card>> players = deck.deal(4);

        // Hiển thị bài của mỗi người chơi
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Người chơi " + (i + 1) + " có bài:");
            for (Card card : players.get(i)) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
