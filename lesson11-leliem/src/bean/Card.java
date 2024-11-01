package bean;

import java.util.Objects;

public class Card {

	private String type;
	private String rank;
	
	public Card() {
	}

	public Card(String type, String rank) {
		super();
		this.type = type;
		this.rank = rank;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Card)) {
			return false;
		}
		Card other = (Card) obj;
		return Objects.equals(rank, other.rank) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Card [type=" + type + ", rank=" + rank + "]";
	}
	


}
