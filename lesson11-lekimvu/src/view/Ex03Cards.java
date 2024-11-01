package view;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import bean.Card;
import utils.MultiUlti;

public class Ex03Cards {

	public static void main(String[] args) {
	List<Card> cards = new LinkedList<>();

		var mockGenres = genres();
        var mockValues = values();
        for(var genre : mockGenres) {
        	for(var value : mockValues) {
        		cards.add(new Card(genre,value));
        	}
        }
			MultiUlti.printf2("Danh sách các lá bài:", cards);
			MultiUlti.generate("Số lượng lá bài: ", cards.size());
			
			
					MultiUlti.generate("Player 1:",  playersCards(13, cards) );
					MultiUlti.generate("Player 2:",  playersCards(13, cards) );
					MultiUlti.generate("Player 3:",  playersCards(13, cards) );
					MultiUlti.generate("Player 4:",  playersCards(13, cards) );

			
		}
	
	public static List<Card> playersCards(int number,List<Card> cards){
		Collections.shuffle(cards);
		List<Card> player = new LinkedList<>();
		for(var card : cards ){
			player.add(card);
			if(player.size() == number) {
        break;
			}
	}
		return player;
	
}
		
		public static List<String > genres(){
			return List.of("cơ","rô","chuồn","bích");
			
		}
		
		public static List<String > values(){
			return List.of("xì","2","3","4","5","6","7","8","9","10","J","Q","K");
			
		}
		
}