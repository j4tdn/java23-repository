package bean;

import java.util.Objects;

public class Card {

	private String typeCard;
	private String rank;
	
	public Card() {
	}

	public Card(String typeCard, String rank) {
		this.typeCard = typeCard;
		this.rank = rank;
	}

	public String getTypeCard() {
		return typeCard;
	}

	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) {
        	return true;
        }
        if (!(o instanceof Card that)) {
			return false;
		}
        return getTypeCard().equals(that.getTypeCard()) && getRank().equals(that.getRank());
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeCard) + Objects.hash(rank);
    }

	@Override
	public String toString() {
		return "Card [" + typeCard + ", " + rank + "]";
	}
	
	
}
