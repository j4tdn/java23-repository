package inheritance.cclas;

public class TextBook extends Book {

	private boolean isNew;
	private Double discount;

	public TextBook() {

	}

	public TextBook(Integer id, String name, Double salesPrice, String publisher, boolean isNew, Double discount) {

		super(id, name, salesPrice, publisher);

		//super.getId(id);
//super.getName(name);
//super.getSalesPrice(salesPrice);
//super.getPublisher(publisher);
//		super. khiến code dài dòng thay vào đó ta dùng super()
		
		this.isNew = isNew;
		this.discount = discount;
	}

	public boolean getIsNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + getId() 
				+ ", name=" + getName() 
				+ ", salesPrice=" + getSalesPrice()
				+ ", publisher=" + getPublisher() 
				+ ", isNew=" + getIsNew()
				+ ", discount=" + getDiscount();

	}
	
	

}
