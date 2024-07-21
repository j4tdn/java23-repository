package inheritance.cclass;

import java.sql.Ref;
import java.util.Arrays;

public class ZInheritanceClassDemo {
	/*
 	Bài toán: Giả lập 1 bài toán quản lý các loại
 	sách trong thư viện. Trong đó có 2 loại sách
 	chính:
 	
 	+ Sách giáo khoa: mã sách, tên sách, giá bán, nxh, trình trạng, % giảm giá
 	+ Sách giáo khoa: mã sách, tên sách, giá bán, % thuế
 	
 	TextBook     : id, name, salesPrice, publisher, isNew, discount
 	ReferenceBook: id, name, salesPrice, publisher, tax
 	
 	--> Các thuộc tính như id, name, salesPrice, publisher chung
 	--> Tạo 1 class chung(cha): 
 	
 	--> Book         : id, bane, salesPrice, publisher
 	--> TextBook     : isNew, discount
 	--> ReferenceBook: tax 
 	
 	Yêu cầu:
 	+ Tạo danh sách N cuốn sách trong thư viện
 	+ Liệt kê các sách thuộc nxb Nhi Đồng
 	+ Liệt kê các sách 
 	+ Giả bập bài toán mua sách, tính tiền
 */
	public static void main(String[] args) {
//		TextBook tb1 = new TextBook(1, "TB-1", 12d, "Nhi Dong", true, 0d);
//		TextBook tb2 = new TextBook(2, "TB-2", 16d, "Ha Noi", false, 5d);
//		
//		System.out.println("tb1 -->> " + tb1);
//		System.out.println("tb1 -->> " + tb2);
		
		Book[] books = mockData();
		
		generate(
				"Liệt kê các sách thuộc nxb Nhi Đồng",
				findBooksByPublisher(books, "Nhi Dong")
				);
		generate(
				"Liệt kê các sách giảm giá hơn 2%",
				findBooksWithDiscount(books)
				);
		System.out.println("Billing --> "+ billing(books[1], books[0]));
	}
	
	private static double billing(Book... booksToBeCalculated)  {
		double total = 0d;
		
		double salesPrice = 0;
		for(Book book: booksToBeCalculated) {
			if (book instanceof TextBook tbook) {
				salesPrice = tbook.getSalesPrice() * (100 - tbook.getDiscount()) / 100;
			}else if (book instanceof ReferenceBook rbook) {
				salesPrice = rbook.getSalesPrice() * (100 + rbook.getTax()) /100;
			}
			total = total + salesPrice;
					
		}
		return total;
		
	}
	private static Book[] findBooksWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			// Cha lúc runtime có thể là Con #1 #2
			// Muốn dùng thuộc tính của con kiểm tra lúc run time là con #.
			// Ép kiểu sang rồi dùng
			
			// book lúc runtime có thể là TextBook hoặc ReferenceBook
			// book.getClass() --> lúc runtime book là class nào( yêu cầu book != null)
			//if(book!= null && book.getClass() == TextBook.class) {
			
//			if (book instanceof TextBook) {	
//				if(((TextBook)book).getDiscount() > 2d) {
//					result[count++] = book;
//				};
//			}
			// new way
			if (book instanceof TextBook tbook) {	
				if(tbook.getDiscount() > 2d) {
					result[count++] = book;
				};
			}
			
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	private static Book[] findBooksByPublisher(Book[] books, String givenPublisher) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (givenPublisher.equals(book.getPublisher())) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	
	private static Book[] mockData() {
		return new Book[] {
				new TextBook(1, "TB-1", 12d, "Nhi Dong", true, 0d),
				new TextBook(2, "TB-2", 16d, "Ha Noi", false, 5d),
				new ReferenceBook(3, "RF3", 40d, "Nhi Dong", 2d),
				new ReferenceBook(4, "RF4", 22d, "Da Nang", 8d),
				new ReferenceBook(5, "RF5", 36d, "Nhi Dong", 3d),
				new TextBook(6, "TB6", 62d, "Nhi Dong", false, 10d),
				new TextBook(7, "TB7", 26d, "Da Nang", true, 8d)
				};
	}
	
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + "--> {");
		for (Book book: books) {
			System.out.println("   + " + book);
		}
		System.out.println("}\n");
	}
}
