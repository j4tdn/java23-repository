package inheritance.cclass;

public class TextBook extends Book {
	
	private Boolean isNew;
	private Double discount;
	
	public TextBook() {
	}
	
	// H1
	// new TextBook(1, "TB-1", 12d, "Nhi Dong", true, 0d)
	public TextBook(Integer id, String name, Double salesPrice, 
			String publisher, Boolean isNew, Double discount) {
		// this : đại diện cho đối tượng, ô nhớ hiện tại ở heap khi gọi hàm non static
		//      : khi thừa kế từ cha, các hàm, thuộc tính của cha nằm trong con
		//      : ==> gọi được các hàm của chính nó và cha
		// super: dùng để gọi đến các thuộc tính, hàm(constructor, getter, setter) non static ở lớp cha 
		
		
		super(id, name, salesPrice, publisher);
		
		// super.setId(id); // this.id = id
		// super.setName(name); // this.name = name
		// super.setSalesPrice(salesPrice); // this.salesPrice = salesPrice
		// super.setPublisher(publisher); // this.publisher = publisher
		
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
	public String toString() {
		return "TextBook [id=" + getId() 
		    + ", name=" + getName() 
			+ ", salesPrice=" + getSalesPrice() 
			+ ", publisher=" + getPublisher() 
			+ ", isNew=" + getIsNew() 
			+ ", discount=" + getDiscount() + "]";
	}
}
