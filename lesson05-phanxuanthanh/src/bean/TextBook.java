package bean;

public class TextBook extends Book{
	private BookCondition bookConditon;
	
	public TextBook() {
	}
	
	public TextBook(String id, double salePrices, String publisher, BookCondition bookConditon) {
		super(id, salePrices, publisher);
		this.bookConditon = bookConditon;
	}

	public BookCondition getBookConditon() {
		return bookConditon;
	}

	public void setBookConditon(BookCondition bookConditon) {
		this.bookConditon = bookConditon;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + getId() + ", cost=" + getSalePrices() + ", publisher=" + getPublisher() + ", BookCondition=" + bookConditon + "]";
	}
}
