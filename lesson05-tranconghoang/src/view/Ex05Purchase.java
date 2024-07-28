package view;

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05Purchase {

	public static void main(String[] args) {
		
		TextBook t1 = new TextBook("SGK1", 20d, "Nhi Dong", "new");
		TextBook t2 = new TextBook("SGK2", 17d, "Vo Thi Sau", "old");
		TextBook t3 = new TextBook("SGK3", 120d, "Kim Dung", "new");
		ReferenceBook r1 = new ReferenceBook("STK1", 44d, "Hai Nam", 2d);
		ReferenceBook r2 = new ReferenceBook("STK2", 100d, "Nick", 4d);
		ReferenceBook r3 = new ReferenceBook("STK3", 88d, "Jacky Chun", 3d);
		
		Book[] books = {t1, t2, t3, r1, r2, r3};
		TextBook[] tb = {t1, t2, t3};
		
		generate("Liệt kê các sách thuộc nhà xuất bản Nhi Dong", findBooksByPublisher(books));
		generate("Tìm toàn bộ sách có đơn giá <50", findBooksBySalesPrice(books));
		generate("Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200", findBooksBySalesPriceInRange(tb));
	}
	
	private static Book[] findBooksByPublisher(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book book: books) {
			if("Nhi Dong".equals(book.getPublisher()))
				result[count++] = book;
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + "{");
		for(Book book: books)
			System.out.println("   +" + book);
		System.out.println("}\n");
	}
	
	private static Book[] findBooksBySalesPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book book: books) {
			if(book.getSalesPrice() < 50)
				result[count++] = book;
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static TextBook[] findBooksBySalesPriceInRange(TextBook[] tb) {
		TextBook[] result = new TextBook[tb.length];
		int count = 0;
		for(TextBook tbk: tb) {
			if(tbk.getSalesPrice() >= 100 && tbk.getSalesPrice() <= 200)
				result[count++] = tbk;
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
