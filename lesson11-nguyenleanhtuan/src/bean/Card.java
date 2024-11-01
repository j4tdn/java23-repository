package bean;

public class Card {

	 private String loaiBai;
	 private String thuTu;
	 
	 public Card() {
	}
	 

	public Card(String loaiBai, String thuTu) {
		super();
		this.loaiBai = loaiBai;
		this.thuTu = thuTu;
	}



	public String getLoaiBai() {
		return loaiBai;
	}

	public void setLoaiBai(String loaiBai) {
		this.loaiBai = loaiBai;
	}

	public String getThuTu() {
		return thuTu;
	}

	public void setThuTu(String thuTu) {
		this.thuTu = thuTu;
	}

	@Override
	public String toString() {
		return "Card [loaiBai=" + loaiBai + ", thuTu=" + thuTu + "]";
	}
	 
	 
}
