package bean;

import java.util.Objects;

public class CDs {
	private Integer id;
	private String type;
	private String singer;
	private Integer songNumber;
	private Double price;
	
	public CDs() {
	}

	public CDs(Integer id, String type, String singer, Integer songNumber, Double price) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.songNumber = songNumber;
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

	public Integer getSongNumber() {
		return songNumber;
	}

	public void setSongNumber(Integer songNumber) {
		this.songNumber = songNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof CDs that)) {
			return false;
		}
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "CDs [id=" + id + ", type=" + type + ", singer=" + singer + ", songNumber=" + songNumber + ", price="
				+ price + "]";
	}
	
}
