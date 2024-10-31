package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.CD;
import bean.Card;
import bean.Word;

public class DataModel {

	public DataModel() {
	}
	
	// Ex02: Tạo danh sách đĩa CD
	public static List<CD> mockCDs() {
		return List.of(
			new CD(1, "Pop", "Vo Anh Tuan", 10, 15.99),
			new CD(2, "Rock", "Rin Rin", 8, 12.50),
			new CD(3, "Jazz", "Yoasobi", 5, 20.00),
			new CD(4, "Classical", "Mr.Dam", 12, 18.75),
			new CD(5, "Hip-Hop", "Tranh Than", 15, 22.30)
		);
	}

	// Ex03: Tạo danh sách các lá bài (52 lá bài và không trùng nhau)
	private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	
    public static List<Card> generateCards() {
        List<Card> deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }
    
    // Ex04: Tạo danh sách từ vựng
    public static List<Word> generateWords(){
    	return List.of(
    		new Word("apple", "quả táo", "noun", "Một loại trái cây"),
            new Word("run", "chạy", "verb", "Khi đôi chân chuyển động với tốc độ nhanh"),
            new Word("beautiful", "đẹp", "adjective", "Cách nhìn tích cực với một sự vật, hiện tượng")
    	);
    }
    
    // Ex05: Tạo danh sách các khoản chi tiêu
    public static Map<String, Double> mockSpending() {
        return new HashMap<>(Map.of(
        	"Ăn uống", 300000.0,
        	"Giải trí", 600000.0,
            "Mua sắm quần áo", 700000.0,
            "Điện thoại", 1500000.0,
            "Đi lại", 200000.0,          
            "Tiền thuê nhà", 500000.0
        ));
    }
    
}
