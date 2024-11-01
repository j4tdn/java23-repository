package bean;

public class Card {
	private String suit; // Bích, chuồng, rô,..
    private String rank; // 2,3,.. J, Q, K
    
    public Card() {
	}

	public Card(String suit, String rank) {
		super();
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
	public String toString() {
		return "\nCard [suit=" + suit + ", rank=" + rank + "]";
	}
    
}
