package inheritance.cclass;

public class TextBook extends Book{
	private Boolean isNew;
	private Double discount;
	
	public TextBook() {
	}

	//this: đại diện cho đối tượng, ô nhớ hiện tại ở heap khi gọi hàm non-static
	//	  : khi thừa kế từ cha, các hàm thuộc tính cha nằm trong con.
	//		=> gọi được các hàm của chính nó và cha.
	//super: dùng để gọi đến các thuộc tính, hàm (constructor, getter, setter) nonstatic
	
	public TextBook(Integer id, String name, Double salesPrice, String publisher,Boolean isNew, Double discount) {
		super(id,name,salesPrice,publisher);
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
	
	public String toString() {
		return "Book [id=" + getId() + 
				", name=" + getName() +
				", salesPrice=" + getSalesPrice() +
				", publisher=" + getPublisher() +
				", isNew=" + getIsNew() +
				", discount=" + getDiscount() +
				"]";
	}
}
