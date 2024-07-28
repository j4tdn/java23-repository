package Ex05;

public class Book {
	private String Id;
	protected Double Price;
	private String Publisher;
	
	public Book(String Id, Double Price, String Publisher) {
		this.Id = Id;
		this.Price = Price;
		this.Publisher = Publisher;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Price=" + Price + ", Publisher=" + Publisher + "]";
	}
	
	

}
