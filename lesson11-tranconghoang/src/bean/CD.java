package bean;

import java.util.Objects;

public class CD {

	private Integer id;
	private String model;
	private String singer;
	private Integer numOfSongs;
	private Double salesPrice;
	
	public CD() {
	}

	public CD(Integer id, String model, String singer, Integer numOfSongs, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.singer = singer;
		this.numOfSongs = numOfSongs;
		this.salesPrice = salesPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Integer getNumOfSongs() {
		return numOfSongs;
	}

	public void setNumOfSongs(Integer numOfSongs) {
		this.numOfSongs = numOfSongs;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof CD))
			return false;
		CD that = (CD)o;
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "CD [id=" + id + ", model=" + model + ", singer=" + singer + ", numOfSongs=" + numOfSongs
				+ ", salesPrice=" + salesPrice + "]";
	}
}
