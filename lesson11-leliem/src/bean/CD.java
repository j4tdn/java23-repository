package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class CD {

	private Integer id;
	private String type;
	private String singer;
	private Integer numberOfSong;
	private BigDecimal price;
	
	public CD() {
	}

	public CD(Integer id, String type, String singer, Integer numberOfSong, BigDecimal price) {
		super();
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.numberOfSong = numberOfSong;
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
	
	public Integer getNumberOfSong() {
		return numberOfSong;
	}

	public void setNumberOfSong(Integer numberOfSong) {
		this.numberOfSong = numberOfSong;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CD)) {
			return false;
		}
		CD other = (CD) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", type=" + type + ", singer=" + singer + ", numberOfSong=" + numberOfSong + ", price="
				+ price + "]";
	}


	
	
	
	
	
}
	