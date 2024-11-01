package bean;

import java.util.Objects;

public class CD {
	private int CdId;
	private String CdType;
	private String Singer;
	private int NumberOfSongs;
	private double Price;
	
	public CD() {
	}
	
	public CD(int cdId, String cdType, String singer, int numberOfSongs, double price) {
		super();
		CdId = cdId;
		CdType = cdType;
		Singer = singer;
		NumberOfSongs = numberOfSongs;
		Price = price;
	}

	public int getCdId() {
		return CdId;
	}

	public void setCdId(int cdId) {
		CdId = cdId;
	}

	public String getCdType() {
		return CdType;
	}

	public void setCdType(String cdType) {
		CdType = cdType;
	}

	public String getSinger() {
		return Singer;
	}

	public void setSinger(String singer) {
		Singer = singer;
	}

	public int getNumberOfSongs() {
		return NumberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		NumberOfSongs = numberOfSongs;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof CD)) {
			return false;
		}
		CD that = (CD)o;
		return getCdId() == that.getCdId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getCdId());
	}
	
	@Override
	public String toString() {
		return "CD [CdId=" + CdId + ", CdType=" + CdType + ", Singer=" + Singer + ", NumberOfSongs=" + NumberOfSongs
				+ ", Price=" + Price + "]";
	}
}
