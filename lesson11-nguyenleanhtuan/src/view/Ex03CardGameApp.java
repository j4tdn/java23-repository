package view;

import java.util.List;
import bean.Card;
import model.Deck;

public class Ex03CardGameApp {
	
	public static void main(String[] args) {
		Deck deck = new Deck();

		deck.shuffle();

		List<List<Card>> danhSachNguoiChoi = deck.chiaBai(3); //Nhập số người chơi

		for (int i = 0; i < danhSachNguoiChoi.size(); i++) {
			System.out.println("Bài của người chơi " + (i + 1) + ":");
			for (Card card : danhSachNguoiChoi.get(i)) {
				System.out.println(card);
			}
			System.out.println();
		}
	}
}
