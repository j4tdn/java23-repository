package inheritance.cclass;

public class TextBook extends Book {
	private Boolean isNew;
	private Double discount;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}
	// this: dai dien cho doi tuong, o nho hien tai o heap khi goi ham non static
	//       khi thua ke tu cha, cac ham, thuoc tinh cua cha nam trong con
	//     ==> goi duoc cac ham cua chinh no va cha
	// super: dung de goi den cac thuoc tinh, ham(constructor, getter, setter) non static

	public TextBook(Integer id, String name, Double salesPrice, String publisher, Boolean isNew, Double discount) {
		super(id, name, salesPrice, publisher);
		this.isNew = isNew;
		this.discount = discount;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString () {
		return  "TextBook [id=" + getId() + ", name=" + getName() + ", salesPrice=" + getSalesPrice()
		+ ", publisher=" + getPublisher() + ","
		+ ", isNew=" + getIsNew()
		+ ", discount=" + getDiscount() + "]";
	}
}
