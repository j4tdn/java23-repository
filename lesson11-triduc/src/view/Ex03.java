package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03 {
	public static void main(String[] args) {
		List<Card> cards = DataModel.mockDataCards();

		CollectionUtils.generate("Cards: ", cards);

		// demo 4 người
		int players = 4;
		System.out.println("Number of player: " + players);

		for (List<Card> playerCards : shuffleCards(cards, players)) {
			CollectionUtils.generate("Card for player: ", playerCards);
		}
	}

	private static List<List<Card>> shuffleCards(List<Card> cards, Integer numberOfPlayers) {
		List<List<Card>> rs = new ArrayList<>(numberOfPlayers);
		Collections.shuffle(cards);
		for (int i = 0; i < numberOfPlayers; i++) {
			int count = 13 * (i + 1);
			List<Card> cardForPlayer = new ArrayList<>();
			for (int j = 13 * i; j < count; j++) {
				cardForPlayer.add(cards.get(j));
			}
			rs.add(cardForPlayer);
		}
		return rs;
	}
}
