package inheritance.cclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZInheritanceClassDemo {
	/*
	  	Bài toán: Giả lập bài toán quản lý loại sách trong thư viện trong đó có 2 loại sách chính: 
	  		+ Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình trạng, %giảm giá 
	  		+ Sách tham khảo: mã sách, tên sách, giá bán, nxb, %thuế -
	  			TextBook: id, name, salesPice, publisher, isNew, discount 
	  			- ReferenBook: id, name, salesPice, publisher, tax, 
	  			--> Các thuộc tính như là id,.. dùng chung
	  			--> Tạo ra 1 lớp cha chung: => Book: id, name, salesPice, publisher,
	  				TextBook: isNew, discount 
	  				ReferenBook: tax 
	  	Yêu cầu : 
	  		-Tạo ds N cuốn sách trong thư viện 
	  		-Liệt kê sách thc nxb Nhi Đồng 
	  		-Liệt kê các sách có giảm giá
	 		-Giả lập mua sách, tính tiền
	 */

	public static void main(String[] args) {
		Book[] books = mockData();
		generate("Liệt kê các sách thuộc nxb Nhi Đồng: ", findBooksByPublisher(books, "Nhi Dong"));
		generate("Liệt kê danh sách có giảm giá > 2%", findBooksWithDiscount(books));
		System.out.println("Billing --> " + billing(books[0], books[1]));
	}

	private static Book[] mockData() {
		return new Book[] { new TextBook(1, "TB-1", 12d, "Nhi Dong", false, 1d),
				new TextBook(2, "TB-2", 16d, "Ha Noi", false, 5d), new ReferenceBook(3, "RF3", 40d, "Nhi Dong", 2d),
				new ReferenceBook(4, "RF4", 22d, "Nhi Dong", 8d), new ReferenceBook(5, "RF5", 36d, "Nhi Dong", 3d),
				new TextBook(6, "TB-6", 27d, "Nhi Dong", false, 10d),
				new TextBook(7, "TB-7", 27d, "Da Nang", false, 10d), };
	}

	// tìm
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

	// in ra
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + " --> { ");
		for (Book book : books) {
			System.out.println("   + " + book);
		}
		System.out.println("} \n");
	}

	private static Book[] findBooksWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
//			book lúc runtime có thể là TextBook hoặc ReferenceBook
//			if (book != null && book.getClass() == TextBook.class) // --> getClas lúc runtim cho biết book(biến) đó là
				if (book instanceof TextBook) {
					if (((TextBook) book).getDiscount() > 2d) {
						result[count++] = book;
					}
				}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static double billing(Book... booksToCalted) {
		double total =0;
		double salePrice=0;
		for(Book book: booksToCalted) {
			if(book instanceof TextBook tb) {
				salePrice = tb.getSalesPice() * (100 - tb.getDiscount())/100;
			}else if(book instanceof ReferenceBook rb) {
				salePrice = rb.getSalesPice() * (100 + rb.getTax()) / 100;
			}
			total +=salePrice;
		}
		return total;
	}
}
