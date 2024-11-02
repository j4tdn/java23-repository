package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import bean.CD;
import bean.Card;
import bean.Word;

public class DataModel {
	private DataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<CD> mockData() {
		return List.of(new CD(01, "Song", "Adele", 5, BigDecimal.valueOf(50d)),
				new CD(02, "Dance", "Bdele", 3, BigDecimal.valueOf(40d)),
				new CD(03, "Say", "Cdele", 4, BigDecimal.valueOf(20d)),
				new CD(04, "Sing and Song", "Adele", 3, BigDecimal.valueOf(70d)));
	}

	public static List<Card> mockDataCards() {
		List<String> types = List.of("Bích", "Chuồng", "Rô", "Cơ");
		List<String> values = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");

		List<Card> cards = new ArrayList<Card>();

		for (String type : types) {
			for (String value : values) {
				cards.add(new Card(type, value));
			}
		}

		return cards;
	}

	public static List<Word> mockDataWords() {
		return List.of(new Word("Chào", "OK", "ok", "ok"), new Word("Hi", "Hello", "ok", "ok"),
				new Word("Wassup", "Abc", "ok", "ok"), new Word("Ok y", "OK", "ok", "ok"));
	}
}
