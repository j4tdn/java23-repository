package bean;

import java.util.Objects;

public class Card {

	private String type;
	private String level;
	
	public Card() {
	}

	
	public Card(String type, String level) {
		super();
		this.type = type;
		this.level = level;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public int hashCode() {
		return Objects.hash(level, type);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(level, other.level) && Objects.equals(type, other.type);
	}


	@Override
	public String toString() {
		return "Card [type=" + type + ", level=" + level + "]";
	}


	
	
	
}
