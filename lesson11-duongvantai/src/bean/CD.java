package bean;

import java.util.Objects;

public class CD {
	private Integer id;
	private  String typeCD;
	private String singer;
	private Integer numberSong;
	private Double salesPrice;
	public CD(Integer id, String typeCD, String singer, Integer numberSong, Double salesPrice) {
		super();
		this.id = id;
		this.typeCD = typeCD;
		this.singer = singer;
		this.numberSong = numberSong;
		this.salesPrice = salesPrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeCD() {
		return typeCD;
	}
	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Integer getNumberSong() {
		return numberSong;
	}
	public void setNumberSong(Integer numberSong) {
		this.numberSong = numberSong;
	}
	public Double getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
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
		return "CD [id=" + id + ", typeCD=" + typeCD + ", singer=" + singer + ", numberSong=" + numberSong
				+ ", salesPrice=" + salesPrice + "]";
	}
}
