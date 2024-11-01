package model;

import java.util.ArrayList;
import java.util.List;

import bean.Card;

public class CardDataModel {
	 
	 private static final String[] TYPES = {"Hearts", "Diamonds", "Clubs", "Spades"};
	 private static final String[] LEVELS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

		public static List<Card> generateCards() {
			List<Card> cards = new ArrayList<>();
			for (String type : TYPES) {
				for (String level : LEVELS) {
					cards.add(new Card(type, level));
				}
			}
			return cards;
		}
	}
