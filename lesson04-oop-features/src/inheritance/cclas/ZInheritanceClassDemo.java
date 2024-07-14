package inheritance.cclas;

import java.util.Arrays;

public class ZInheritanceClassDemo {

	/*
	 Bài toán: Giải lập bài toán quản lý các loại sách trong thư viện
	 Trong đó có 2 loại sách chính
	 
	 + Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình trạng, %giảm giá
	 + Sách tham khảo: mã sách, tên sách, giá bán, nxb, %thuế
	 
	 TextBook	  : id, name, salesPrice, publisher, isNew, discount
	 ReferenceBook: id, name, salesPrice, publisher, tax
	 
	 --> Các thuộc tính như là id, name, salesPrice, publisher chung
	 --> Tạo ra 1 class chung(cha):
	 	--> Book		 : id, name, salesPrice, publisher
	 	--> TextBook	 : isNew, discount
	 	--> ReferenceBook: tax
	 
	 Yêu cầu:
	 + Tạo danh sách N cuốn sách trong thư viện
	 + Liệt kê các sách thuộc nxb Nhi Đồng
	 + Liệt kê các sách có giảm giá > 2%
	 + Giải lập bài toán mua sách, tính tiền
	 
	 */
	
	public static void main(String[] args) {
		Book[] books = mockData();
		
		generate(
				"Liệt kê các sách thuộc nxb Nhi Đồng",
				findBooksByPublisher(books, "Nhi Dong")
		);
		
		generate(
				"Liệt kê các sách có giảm giá > 2%",
				findBooksWithDiscount(books)
		);
		
		System.out.println("billing --> "+ billing(books));
	}
	
	//Giải lập bài toán mua sách, tính tiền
	private static double billing(Book... booksToBeCalted) {
		double total = 0d;
		for (Book book: booksToBeCalted) {
			double salesPrice = 0;
			if (book instanceof TextBook tb) {
				salesPrice = tb.getSalesPrice() * (100 - tb.getDiscount()) / 100;
			} else if (book instanceof ReferenceBook rb) {
				salesPrice = rb.getSalesPrice() * (100 + rb.getTax()) / 100;
			}
			total = total + salesPrice;
		}
		return total;
	}
	
	//tìm sách có giảm giá
	private static Book[] findBooksWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			// Cha lúc runtime có thể Con #1 #2
			// Muốn dùng thuộc tính của con kiểm tra lúc runtime là con #.
			// Ép kiểu sang rồi dùng
			
			// book lúc runtime có thể là TextBook hoặc ReferenceBook
			// book.getClass() --> lúc runtime book là ai (yêu cầu book phải khác null)
//			if (book != null && book.getClass() == TextBook.class) {
			if(book instanceof TextBook tbook) {
				if (tbook.getDiscount() > 2d) {
					result[count++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	//tìm theo tên nxb
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
			new ReferenceBook(3, "RF3", 40d, "Nhi Dong", 2d),
			new ReferenceBook(4, "RF4", 22d, "Da Nang", 8d),
			new ReferenceBook(5, "RF5", 36d, "Nhi Dong", 3d),
			new TextBook(6, "TB6", 62d, "Nhi Dong", false, 10d),
			new TextBook(7, "TB7", 26d, "Da Nang", false, 8d),
		};
	}
	
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + " --> {");
		for (Book book : books) {
			System.out.println("    + " + book);
		}
		System.out.println("}\n");
	}
}

