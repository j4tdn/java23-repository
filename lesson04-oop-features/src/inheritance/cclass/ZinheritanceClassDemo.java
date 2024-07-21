package inheritance.cclass;

import java.util.Arrays;

public class ZinheritanceClassDemo {
	
	/*
	 * Bài toán: Giải lập bài toán quản lý sách
	 * Trong đó 2 loại sách chính:
	 * 
	 * + Sách giáo khoa: mã sách, tên sách, giá, nxb, tình trạng, %discount
	 * + Sách tham khảo: mã sách, tên sách, giá, nxb, %thuế
	 * 
	 * Book: id, name, salesPrice, publisher
	 * TextBook: isNew, discount
	 * ReferenceBook:  tax
	 * 
	 * Yêu cầu:
	 * + Tạo danh sách N cuốn sách trong thư viện
	 * + Liệt kê các sách thuộc NXB Nhi Đồng
	 * + Liệt kê các sách có giảm giá > 2%
	 * + Giải lập bài toán mua sách, tính tiền.
	 * 
	 */
	
	public static void main(String[] args) {
		Book[] books = mockData();
		
		generate("Liệt kê các bản sách thuộc NXB Nhi Đồng",
				findBooksByPublisher(books,"Nhi Dong"));
		
		generate("Liệt kê các sách có giảm giá > 2%", 
				findBooksWithDiscount(books));
		
		System.out.println("Billing ---> " + billing(books[0],books[1]));
	}
	
	private static double billing(Book... booksToBeCalted) {
		double total = 0d;
		
		double salesPrice = 0;
		for(Book book: booksToBeCalted) {
			if(book instanceof TextBook tb)
				salesPrice = tb.getSalesPrice() * (100 - tb.getDiscount())/100;
			else if(book instanceof ReferenceBook rb) {
				salesPrice = rb.getSalesPrice() * (100 - rb.getTax())/100;
			}
			total = total + salesPrice;
		}
		
		return total;
	}
	
	private static Book[] findBooksWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book book: books) {
			//Muốn dùng thuộc tính của con trong lúc runtime 
			//-> ép kiểu 
			//book lúc runtime có thể là textbook, hoặc referencebook
			//book.getClass() --> lúc runtime Book là gì (yêu cầu Book khác null
			//if(book != null && book.getClass() == TextBook.class) {
			if(book instanceof TextBook tbook) {	 //tự check Null
			//	TextBook tbook = (TextBook)book;
				if(tbook.getDiscount() > 2d) {
					result[count++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Book[] findBooksByPublisher(Book[] books, String givenPublisher) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book book: books) {
			if(givenPublisher.equals(book.getPublisher())) { // đảo ngược để 0 bị null
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Book[] mockData() {
		return new Book[] {
			new	TextBook(1, "TB-1", 300000d, "Nhi Dong", false, 1d),
			new TextBook(2, "TB-2", 444000d, "Ha Noi", false, 5d),
			new ReferenceBook(3,"RF3", 40d, "Nhi Dong", 2d),
			new ReferenceBook(4,"RF4", 30d, "Da Nang", 3d),
			new ReferenceBook(5,"RF5", 20d, "Nhi Dong", 4d),
			new TextBook(6, "TB-6", 43000d, "Ha Noi", false, 10d),
			new TextBook(7, "TB-7", 24000d, "Da Nang", true, 0d)
		};
	}
	
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + "--> {");
		for(Book book: books) {
			System.out.println(" + " + book);
		}
		System.out.println("}\n");
	}
}
