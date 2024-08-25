package test03.ex05;

public class TextBook extends Book{
	
	private Boolean isNew;
	public TextBook() {
	}
	public TextBook(String id, Double salePrice, String publisher, Boolean isNew) {
		super(id, salePrice, publisher);
		this.isNew = isNew;
	}
	
	public Boolean isNew() {
		return isNew;
	}
	public void setNew(Boolean isNew) {
		this.isNew = isNew;
	}
	@Override
	public String toString() {
		return "TextBook [ ID=" + getId() + ", SalePrice()=" + getSalePrice()
				+ ", Publisher()=" + getPublisher() +", isNew()=" + isNew() +  "]";
	}
	
	
}
