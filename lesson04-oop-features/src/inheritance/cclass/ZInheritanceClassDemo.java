package inheritance.cclass;

import java.util.Arrays;

public class ZInheritanceClassDemo {

	/*
	 * Bài toán : Giải lập bài toán quản lý các loại sách trong thư viện Trong đó có
	 * 2 loại sách chính + Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình
	 * trạng, % giảm giá + Sách tham khảo: mã sách, tên sách, giá bán, nxb, % thuế
	 * 
	 * Text Book : id, name, salesPricr, publisher, isNew, discount
	 */
	public static void main(String[] args) {
		Book[] books = mockData();
		generate("Liệt kê các sách thuộc nxb Nhi Dong", findBooksByPublisher(books, "Nhi Dong"));

		generate("Liệt kê các sách có giảm giá > 2% ", findBooksWithDiscount(books));

		System.out.println("Billing -->" + billing(books[0], books[1]));

	}

	private static double billing(Book... booksToBeCalted) {
		double total = 0d;

		for (Book book : booksToBeCalted) {
			double salesPrice = 0;
			if (book instanceof TextBook tb) {
				salesPrice = tb.getSalesPrice() * (100 - tb.getDiscount()) / 100;
			} else if (book instanceof ReferencaBook rb) {
				salesPrice = rb.getSalesPrice() * (100 + rb.getTax()) / 100;
			}
			total = total + salesPrice;
		}
		return total;
	}

	private static Book[] findBooksWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			// Cha lúc runtime có thể con #1 #2
			// muốn dùng thuộc tính của con kiểm tra lúc runtime là con#.
			// Ép kiểu sang rồi dùng

			// book.getClass() --> lúc runtime book là ai (yêu cầu book != null)
			// if (book != null && book.getClass() == TextBook.class) {
			if (book instanceof TextBook tbook) {
				if (tbook.getDiscount() > 2d) {
					result[count++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	};

	private static Book[] findBooksByPublisher(Book[] books, String givenPubl) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (givenPubl.equals(book.getPublisher())) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Book[] mockData() {
		return new Book[] { new TextBook(1, "TB1", 12d, "Nhi Dong", true, 1d),
				new TextBook(2, "TB2", 16d, "Da Nang", true, 5d), new ReferencaBook(3, "RF3", 12d, "Nhi Dong", 4d),
				new ReferencaBook(4, "RF4", 16d, "Nhi Dong", 5d), new ReferencaBook(5, "RF5", 12d, "Da Nang", 2d),
				new TextBook(6, "TB6", 12d, "Nhi Dong", true, 4d) };
	}

	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + "--> {");
		for (Book book : books) {
			System.out.println("   + " + book);
		}
		System.out.println("}\n");
	}
}
