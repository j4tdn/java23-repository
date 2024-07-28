package view;

import bean.BookCondition;
import bean.ReferenceBook;
import bean.TextBook;


import bean.Book;

public class Ex05StoreA {
	public static void main(String[] args) {
		Book[] books = booksStore();
		System.out.println(books);
		findPublisher(books);
		findCostBook(books);
	}
	
	private static Book[] booksStore() {
		return new Book[] {
			new TextBook("SGK01", 100, "NXB Nhi Đồng", BookCondition.NEW),
			new TextBook("SGK01", 40, "NXB Nhi Đồng", BookCondition.OLD),
			new TextBook("SGK01", 200, "NXB Nhi Đồng", BookCondition.OLD),
			new ReferenceBook("STK01", 200, "NXB Nhi Đồng", 4),
			new ReferenceBook("STK02", 100, "NXB Nhi Đồng", 4)
		};
	}
	
	private static void findPublisher(Book[] books) {
		for (Book book : books) {
			if (book.getPublisher().equals("NXB Nhi Đồng")) {
				if (book instanceof TextBook) {
					TextBook n = (TextBook) book;
					System.out.println(n);
				}
				else {
					ReferenceBook m = (ReferenceBook) book;
					System.out.println(m);
				}
			}
		}
	}
	
	private static void findCostBook(Book[] books) {
		for (Book book : books ) {
			if (book.getSalePrices() >= 100 && book.getSalePrices() <= 200) {
				if (book instanceof TextBook) {
					TextBook i = (TextBook) book;
					System.out.println(i);
				}
				else {
					ReferenceBook k = (ReferenceBook) book;
					System.out.println(k);
				}
			}
		}
	}
}
