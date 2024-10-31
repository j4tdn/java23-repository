package bean;

import java.util.Objects;

public class Card {

	private String suit;
	private String rank;
	
	public Card() {
	}

	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if(!(o instanceof Card that)) {
			return false;
		}
		
		return getRank() == that.getRank();
		
		
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}
	
}