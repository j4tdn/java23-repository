package bean;

import java.util.Objects;

public class CD {

	private int id;
	private String cdType;
	private String singer;
	private int numberOfSong;
	private double price;
	
	public CD() {
	}

	public CD(int id, String cdType, String singer, int numberOfSong, double price) {
		this.id = id;
		this.cdType = cdType;
		this.singer = singer;
		this.numberOfSong = numberOfSong;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCdType() {
		return cdType;
	}

	public void setCdType(String cdType) {
		this.cdType = cdType;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberOfSong() {
		return numberOfSong;
	}

	public void setNumberOfSong(int numberOfSong) {
		this.numberOfSong = numberOfSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if(!(o instanceof CD that)) {
			return false;
		}
		
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", cdType=" + cdType + ", singer=" + singer + ", numberOfSong=" + numberOfSong
				+ ", price=" + price + "]";
	}
	
}