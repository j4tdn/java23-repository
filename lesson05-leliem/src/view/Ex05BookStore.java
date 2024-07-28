package view;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05BookStore {

	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK1", 40, "Nhi Dong", false);
		TextBook tb2 = new TextBook("SGK2", 110, "Da Nang", true);
		TextBook tb3 = new TextBook("SGK3", 180, "Quang Tri", false);
		
		ReferenceBook rf1 = new ReferenceBook("STK1", 60, "Nhi Dong", 5);
		ReferenceBook rf2 = new ReferenceBook("STK2", 90, "Sai Gon", 5);
				
		Book[] books = {tb1,tb2,tb3,rf1,rf2};
		
		for(Book book: books) {
			if(book.getPublisher().equals("Nhi Dong")) {
				System.out.println("Sach thuoc nxb Nhi Dong \n"+ book);
			}
		}
		
		for(Book book: books) {
			if(book.getPrice() <50) {
				System.out.println("Sach co gia nho hon 50: \n" + book);
			}
		}
		for(Book book: books) {
			if(book.getPrice() > 100 && book.getPrice() <200) {
				System.out.println("Sach co gia lon hon 100 va nho hon 200: \n" + book);
			}
		}
	}
}
