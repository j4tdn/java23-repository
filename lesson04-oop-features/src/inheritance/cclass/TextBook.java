package inheritance.cclass;

public class TextBook extends Book{
	private Boolean isNew;
	private Double discount;
	
	public TextBook() {
	}

	// this: đại diện cho đối tượng, ô nhớ hiện tại ở HEAP khi gọi hàm non static
	//	   : khi thừ kế từ cha nên có thể gọi dc các hàm của chính nó và cha
	// super: dùng để gọi thuộc tính, hàm (contructor, getter, setter) non static 
	
	public TextBook(Integer id, String name, Double salesPice, String publisher, Boolean isNew, Double discount) {
		super(id, name, salesPice, publisher);
		this.isNew=isNew;
		this.discount=discount;
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
		return "TextBook [id=" + getId() + ", name=" + getName() + ", salesPice=" + getSalesPice() + ", publisher=" + getPublisher() + ", isNew=" + getIsNew() + ", discount=" + getDiscount() +"]";
	}
	

	

}
