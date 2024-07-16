package inheritance.cclass;

public class TextBook extends Book {
     
	private Boolean isNew;
	private Double discount;
	
	public TextBook() {
	}
	
	

	public TextBook(Integer id, String name, Double salesPrice, String publisher,Boolean isNew,Double discount) {
		super(id, name, salesPrice, publisher);
		this.isNew = isNew;
		this.discount = discount;
	    // this: đại diện cho đối tượng , ô nhớ hiện tại ở heap khi gọi hàm non static
		//    khi thừa kế từ cha, các hàm, thuộc tính của cha nằm trong con 
		//    => gọi được các hàm của chính nó và cha
		// super: dùng để gọi đến các thuộc tính, hàm(constructor, getter, setter) non static
	
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
		return "TextBook [getId()=" + getId()
				+ ", getName()=" + getName() 
				+ ", getSalesPrice()=" + getSalesPrice() 
				+ ", getPublisher()=" + getPublisher() 
				+ "getIsNew()=" + getIsNew() 
				+ ", getDiscount()=" + getDiscount() +  "]";
		
	}
	
	
}
