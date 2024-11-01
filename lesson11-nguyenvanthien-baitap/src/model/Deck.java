package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = { "Cơ", "Rô", "Chuồn", "Bích" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

        // Tạo bộ bài 52 lá
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Phương thức xáo bài
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Phương thức chia bài cho 4 người chơi
    public List<List<Card>> deal(int numberOfPlayers) {
        List<List<Card>> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new ArrayList<>());
        }

        for (int i = 0; i < cards.size(); i++) {
            players.get(i % numberOfPlayers).add(cards.get(i));
        }

        return players;
    }
}
