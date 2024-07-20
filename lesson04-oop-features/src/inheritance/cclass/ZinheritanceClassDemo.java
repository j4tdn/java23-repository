package inheritance.cclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZinheritanceClassDemo {
	/*
	 Bài toán: Giả lập bài toán quản lý các loại sách trong thư viện
	 Trong đó có 2 loại sách chính:
	 	+ Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình trạng, %giảm giá
	 	+ Sách tham khảo: mã sách, tên sách, giá bán, nxb, % thuế
	 	
	 	
	 	Yêu cầu: 
	 	+ Tạo danh sách N cuốn sách trong thư viện
	 	+ Liệt kê các sách thuộc nxb Nhi Đồng
	 	+ Liệt kê sách có giảm giá
	 	+ Gia lap bai toan mua sach tinh tien
	 
	 */
	public static void main(String[] args) {
		Book [] books = mockData();
		
		generate ("Liet ke cac sach thuoc NXB Nhi Dong", findBooksByPublisher(books,"Nhi Dong"));
		
		generate("Liet ke cac sach co giam gia > 2%",findBooksWithDiscount(books));
		
		System.out.println("Billing --> " + billing(books[0]));
	}
	
	private static double billing (Book... booksToBeCalted) {
		double total = 0d;
		
		double salesPrice = 0;
		for(Book book: booksToBeCalted) {
			if (book instanceof TextBook tb) {
				salesPrice = tb.getSalesPrice() * (100 - tb.getDiscount()) / 100;
				
			} else if (book instanceof ReferenceBook rb) {
				salesPrice = rb.getSalesPrice() * (100 + rb.getTax()) / 100;
			}
			total = total + salesPrice;
		}
		return total;
	}
		
	private static Book [] findBooksWithDiscount(Book[] books) {
		Book [] result = new Book [books.length];
		int count = 0;
		for (Book book: books) {
			// cha luc runtime co the con 1 2
			// Muon dung thuoc tinh cua con ktr luc runtime la con #
			// ep kieu sang roi dung
			// book luc runtime co the la textbook hoac reference book
			//System.out.println("runtime -->" + book.getClass());
			// book.getClass() --> luc runtime book la a
			//if(book !=null && book.getClass() == TextBook.class) {
			if (book instanceof TextBook tbook) {
				if (tbook.getDiscount() > 2d) {
					result [count++] = book ;	
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Book [] findBooksByPublisher(Book[] books, String givenPubl) {
		Book [] result = new Book [books.length];
		int count = 0;
		for (Book book: books) {
			if (givenPubl.equals(book.getPublisher())) {
				result [count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static Book [] mockData () {
		return new Book [] {
				new TextBook(1, "TB-1", 12d, "Nhi Dong", true, 0d),
				new TextBook(2, "TB-2", 16d, "Ha Noi", false, 5d),
				new ReferenceBook(3, "RF3", 40d, "Nhi Dong", 2d),
				new ReferenceBook(4, "RF4", 22d, "Da Nang", 8d),
				new ReferenceBook(5, "RF5", 36d, "Nhi Dong", 3d),
				new TextBook(6, "TB-6", 62d, "Da Nang", false, 10d),
				new TextBook(7, "TB-7", 26d, "Nhi Dong", true, 0d),
		};
	}
	private static void generate (String prefix, Book [] books) {
		System.out.println(prefix + "---> {");
		for (Book book:books) {
			System.out.println("   + " + book);
		}
		System.out.println("}\n");
	}
}
