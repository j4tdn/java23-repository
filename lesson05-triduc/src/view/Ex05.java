package view;

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05 {
	public static void main(String[] args) {
		Book[] books = initData();

		System.out.println("All books of Kim Dong Publisher: ");
		for(Book b : findBooksByPublisher(books, "Kim Dong")) {
			System.out.println(b.toString());
		}
		
		System.out.println("All books lower 50 money: ");
		for(Book b : findBooksByMoney(books)) {
			System.out.println(b.toString());
		}
		
		System.out.println("All Textbooks from 100 - 200 money:  ");
		for(Book b : findTextBooksByMoney(books)) {
			System.out.println(b.toString());
		}
	}
	
	private static Book[] initData() {
		Book[] books = {
			new TextBook("SGK01", 25d, "Kim Dong", 1),
			new TextBook("SGK02", 125d, "Viet Nam", 0),
			new TextBook("SGK03", 55d, "Kim Dong", 1),
			new ReferenceBook("STK01", 50d, "Kim Dong", 5d),
			new ReferenceBook("STK01", 120d, "Viet Nam", 3d),
		};
		return books;
	}
	
	private static Book[] findBooksByPublisher(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book b : books) {
			if(b.getPublisher().equals("Kim Dong")) {
				result[count++] = b;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Book[] findBooksByMoney(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book b : books) {
			if(b.getMoney() < 50d) {
				result[count++] = b;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Book[] findTextBooksByMoney(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book b : books) {
			if(b instanceof TextBook tb) {
				if(tb.getMoney() > 100 && tb.getMoney()<200)
					result[count++] = b;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	
	
}
