package view;

import bean.Book;
import bean.Customer;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05BookStore {

	public static void main(String[] args) {
		Book[] books = createBooks();
		
		Book[] nhiDongBooks = booksByAuthor(books, "Nhi Đồng");
		System.out.println("Sách của nhà xuất bản Nhi Đồng: ");
		printInfo(nhiDongBooks);
		
		Book [] booksUnder50 = booksByPriceLesstThan(books, 50);
		System.out.println("Sách có đơn giá nhỏ hơn 50: ");
		printInfo(booksUnder50);
		
		TextBook[] textBooks50To200 = booksByPriceRange(books, 100, 200);
		System.out.println("Sách giáo khoa có đơn giá từ 100 đến 200: ");
		printInfo(textBooks50To200);
	
		Customer customer = new Customer("KH01", "Nguyễn Văn A", "0123456789", "123 Đường ABC");
		TextBook purchasedTextBook = (TextBook) books[1];
		ReferenceBook purchasedreReferenceBook = (ReferenceBook) books[4];
		double totalPrice = callTotalPrice(purchasedTextBook, purchasedreReferenceBook);
		System.out.println("Tổng tiền phải trả là: " + totalPrice);
		
	}
	
	public static Book[] createBooks() {
		Book[] books = new Book[5];
		books[0] = new TextBook("SGK01", 120, "Nhi Đồng", "new");
		books[1] = new TextBook("SGK02", 80, "Kim Đồng", "old");
		books[2] = new TextBook("SGK03", 150, "Nhi Đồng", "new");
		books[3] = new ReferenceBook("STK01", 90, "Giáo Dục", 10);
		books[4] = new ReferenceBook("STK02", 70, "Nhi Đồng", 5);
		return books;
	}
	
	public static Book[] booksByAuthor(Book[] books, String author) {
		int count = 0;
		for(Book book : books) {
			if(book.getAuthor().equals(author)) {
				count++;
			}
		}
		
		Book[] result = new Book[count];
		int index = 0;
		for (Book book : books) {
			if(book.getAuthor().equals(author)) {
				result[index++] = book;
			}
		}
		return result;
	}
	
	public static Book[] booksByPriceLesstThan(Book[] books, double price) {
		int count = 0;
		for(Book book : books) {
			if(book.getPrice() < price) {
				count++;
			}
		}
		
		Book[] result = new Book[count];
		int index = 0;
		for (Book book : books) {
			if(book.getPrice() < price) {
				result[index++] = book;
			}
		}
		return result;
	}
	
	public static TextBook[] booksByPriceRange(Book[] books, double minPrice,
					double maxPrice) {
		int count = 0;
		for(Book book : books) {
			if(book instanceof TextBook && book.getPrice() >= minPrice 
					&& book.getPrice() <= maxPrice) {
				count++;
			}
		}
		
		TextBook[] result = new TextBook[count];
		int index = 0;
		for(Book book : books) {
			if(book instanceof TextBook && book.getPrice() >= minPrice 
					&& book.getPrice() <= maxPrice) {
				result[index++] = (TextBook) book;
			}
		}
		return result;
	}
	
	public static double callTotalPrice(TextBook textBook, ReferenceBook referenceBook) {
		double totalPrice = textBook.getPrice() + referenceBook.getPrice();
		return totalPrice;
	}
	
	public static void printInfo(Book[] books) {
		for(Book book : books) {
			System.out.println("Mã sách: " + book.getId() + ", Đơn giá: " + book.getPrice() 
				+ ", Nhà xuất bản: " + book.getAuthor());
		}
	}
}
