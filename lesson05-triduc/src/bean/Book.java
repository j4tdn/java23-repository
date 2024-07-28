package bean;

public class Book {
	private String idBook;
	private Double money;
	private String publisher;
	
	public Book() {
	}
	

	public Book(String idBook, Double money, String publisher) {
		this.idBook = idBook;
		this.money = money;
		this.publisher = publisher;
	}



	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", money=" + money + ", publisher=" + publisher + "]";
	}
	
	
}
