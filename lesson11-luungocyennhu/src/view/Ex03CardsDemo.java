package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Card;

public class Ex03CardsDemo {

	public static void main(String[] args) {
		
		List<Card> cards = new ArrayList<>();
		String[] type = {"Cơ", "Rô", "Chuồn", "Bích"};
		String[] rankCard = {"2", "3", "4", "5", "6", "7", "8", "9", 
				"10", "J", "Q", "K", "A"
		};
		
		for(String t: type) {
			for(String r: rankCard) {
				cards.add(new Card(t, r));
			}
		}
		System.out.println("  - Tạo thành công !");
		printf("  - Bộ bài", cards);
		
		
		System.out.println("   - Kiểm thử:");
		Set<Card> cardSet = new HashSet<>(cards);
        if (cardSet.size() == 52) {
            System.out.println("   --> Không có lá bài trùng nhau !");
        } else {
            System.out.println("   --> Có lá bài trùng nhau !");
        }
		
        Collections.shuffle(cards);
		printf("\n  - Xáo trộn bài", cards);
		
		System.out.println("\n   - Chia bài:");
		dealCards(cards);
	}
	
	private static void printf(String prefix, List<Card> cd) {
		System.out.println(prefix + " --> {");
		for(Card c: cd) {
			System.out.println(c);
		}
		System.out.println("}\n");
	}
	
	private static void dealCards(List<Card> cd) {
		List<List<Card>> listCard = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			listCard.add(new ArrayList<>(cd.subList(i * 13, (i+1)*13)));
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Người " + (i + 1) + ": " + listCard.get(i));
		}
	}
}
