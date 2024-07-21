package inheritance.cclass;

import java.util.Arrays;

public class ZInheritanceClassDemo {
	
	public static void main(String[] args) {
		Book[] books = mockData();
		
		generate("Liệt kê các sách thuộc nxb Nhi Đồng", findBooksByPublisher(books, "Nhi Dong"));
		
		generate("Liệt kê các sách có giảm giá > 2%", findBooksWithDiscount(books));
		
		System.out.println("Billing --> " + billing(books[0], books[1]));
	}
	
	private static double billing(Book... booksToBeCalted) {
		double total = 0d;
		
		double salesPrice = 0;
		for (Book book: booksToBeCalted) {
			if(book instanceof TextBook tb) {
				salesPrice = tb.getSalesPrice() * (100 - tb.getDiscount()) / 100;
			} else if  (book instanceof ReferenceBook rb) {
				salesPrice = rb.getSalesPrice() * (100 - rb.getTax()) / 100;
			}
			total = total + salesPrice; 
		}
		
		return total;
	}
	
	private static Book[] findBooksWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			// if (book != null && book.getClass() == TextBook.class) {
			if (book instanceof TextBook tbook) {
				if (tbook.getDiscount() > 5d) {
					result[count++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	
	private static Book[] findBooksByPublisher(Book[] books, String givenPubl) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			if (givenPubl.equals(book.getPublisher())) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Book[] mockData() {
		return new Book[] {
			new TextBook(1, "TB1", 12d, "Nhi Dong", false, 1d),
			new TextBook(2, "TB2", 16d, "Ha Noi", false, 5d),
			new ReferenceBook (3, "RF3", 40d, "Nhi Dong", 2d),
			new ReferenceBook (4, "RF4", 22d, "Da Nang", 8d),
			new ReferenceBook (5, "RF5", 36d, "Nhi Dong", 3d),
			new TextBook(6, "TB6", 62d, "Nhi Dong", false, 10d),
			new TextBook(7, "TB7", 26d, "Ha Noi", false, 8d),
		};
	}
	
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + " --> {");
		for (Book book: books) {
			System.out.println("   + " + book);
		}
		System.out.println("}\n");
	} 
}
