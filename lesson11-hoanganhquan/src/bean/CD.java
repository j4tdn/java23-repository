package bean;

import java.util.Objects;

public class CD {
	
	private Integer id;
	private String type;
	private String singer;
	private Integer songs;
	private Double price;
	
	public CD() {
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

	public Integer getSongs() {
		return songs;
	}

	public void setSongs(Integer songs) {
		this.songs = songs;
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
		return Objects.equals(id, other.id) && Objects.equals(price, other.price)
				&& Objects.equals(singer, other.singer) && Objects.equals(songs, other.songs)
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", type=" + type + ", singer=" + singer + ", songs=" + songs + ", price=" + price + "]";
	}
	
	
	
	
}
