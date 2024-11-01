package bean;

import java.util.Objects;

public class CD {
	
	private Integer id;
	private String type;
	private String singer;
	private Integer numberOfSongs;
	private Double price;
	
	public CD() {
	}

	public CD(Integer id, String type, String singer, Integer numberOfSongs, Double price) {
		super();
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.numberOfSongs = numberOfSongs;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Integer getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(Integer numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		return Objects.equals(id, other.id) && Objects.equals(numberOfSongs, other.numberOfSongs)
				&& Objects.equals(price, other.price) && Objects.equals(singer, other.singer)
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", type=" + type + ", singer=" + singer + ", numberOfSongs=" + numberOfSongs
				+ ", price=" + price + "]";
	}
	
}
