package inheritance.cclass;

import java.util.Arrays;

public class ZInheritanceClassDemo {

	
	/*
	 Bài toán: Giả lập bài toán quản lý các loại sách trong thư viện
	 Trong đó có 2 loại sách chính
	 + Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình trạng(mới hay cũ), %giảm giá
	 + Sách tham khảo: mã sách, tên sách, giá bán, nxb, % thuế
	 
	 TextBook: id, name, saleSPrice, publisher, isNew, discount
	 ReferenceBook: id, name, saleSPrice, publisher, tax
	 
	 --> Các thuộc tính như là id, name, salesPrice, publisher
	 --> Tạo ra 1 class chung(cha):
	 --> Book: id, name, salesPrice, publisher
	 --> TextBook: isNew, discount
	 --> ReferenceBook: tax
	 
	 Yêu cầu:
	 1. Tạo danh sách N cuốn sách trong thư viện
	 2. Liệt kê các sách thuộc NXB Nhi Đồng
	 3. Liệt kê các sách có giảm giá trên 2%
	 4. Giải lập bài toán mua sách, tính tiền
	 */
	public static void main(String[] args) {
		Book[] books = mockData();
		
		generate("Liệt kê các sách thuộc NXB Nhi Đồng", 
				findBookByPublisher(books, "Nhi Dong"));
		
		generate("Liệt kê các sách có giảm giá trên 2%", 
				findBookWithDiscount(books));
		
		System.out.println("Billing = " + billing(books[0], books[1]));
	}	
	
	private static double billing(Book... booksToBeCalted) {
		double total = 0d;
		
		double salesPrice = 0;
		for(Book book : booksToBeCalted) {
			if (book instanceof TextBook tb) {
				salesPrice = tb.getSalesPrice() * (100 - tb.getDiscount()) / 100;
			} else if (book instanceof ReferenceBook rb) {
				salesPrice = rb.getSalesPrice() * (100 + rb.getTax()) /100;
			}
			total = total + salesPrice;
		}
		return total;
	}
	
	
	private static Book[] findBookWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			// Cha lúc runtime có thể con #1 #2
			// Muốn dùng thuộc tính của con kiểm tra lúc runtime là con #
			// Ép kiểu sang rồi dùng
			
			// book lúc runtiem có thẻ là TextBook hoặc ReferenceBook
			// book.getclass() --> lúc runtiem book là ai( yêu cầu book != null)
			// if (book != null && book.getClass() == TextBook.class) {
			
				if (book instanceof TextBook tbook) {	
					if (tbook.getDiscount() > 2d) {
						result[count++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Book[] findBookByPublisher(Book[] books, String givenPubl) {
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
			new TextBook(1, "TB1", 12d, "Nhi Dong", false, 0d),	
			new TextBook(2, "TB2", 16d, "Ha Noi", false, 5d),	
			new ReferenceBook(3, "RF3", 40d, "Nhi Dong", 2d),	
			new ReferenceBook(4, "RF4", 50d, "Da Nang", 3d),	
			new ReferenceBook(5, "RF4", 60d, "Nhi Dong", 8d),	
			new TextBook(6, "TB6", 12d, "Nhi Dong", false, 10d),	
			new TextBook(7, "TB7", 16d, "Da Nang", false, 0d)
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
