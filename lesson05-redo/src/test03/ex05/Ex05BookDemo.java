package test03.ex05;

import java.util.Arrays;

public class Ex05BookDemo {
	
	public static void main(String[] args) {
		Book[] books = mockData();
		generate("1. Danh sách sách trong cửa hàng", books);
		generate(""
				+ "2. Tìm toàn bộ sách thuộc nhà xuất bản  ** - ? - ** === lambda expression" , 
				//findBooksByPublisher(books, "NXB-HCM1"));
				findBooks(books,  book ->  book.getPublisher().equals("NXB-HN1"))
				);

		generate(""
				+ "2. Tìm toàn bộ sách thuộc nhà xuất bản  ** - ? - ** === functional programming", 
				//findBooksByPublisher(books, "NXB-HCM1"));
				findBooks(books, new BookTest() {
					
					@Override
					public boolean check(Book book) {
						
						return book.getPublisher().equals("NXB-HCM1");
					}
				})
				);
		
		generate(""
				+ "2. Tìm toàn bộ sách có giá rẻ hơn  ** - ? - **", 
//				findBooksWithPriceLessThan(books, 100d));
				findBooks(books,  book ->  book.getSalePrice()<  100d)
				);

		generate(""
				+ "3. Tìm toàn bộ sách có giá từ  * ? * -- * ? *", 
//				findBooksWithPriceỈnange(books, 50d, 100d));
				findBooks(books,  book -> book.getSalePrice() >= 50d && book.getSalePrice() <=  100d)
				);
		
		generate(""
				+ "3. Tìm toàn bộ sách có giá từ  * ? * -- * ? * ====== different way", 
//				findBooksWithPriceỈnange(books, 50d, 100d));
				findBooks(books,  book -> {
					Double salePrice = book.getSalePrice();
					return salePrice >= 50d && salePrice <= 100d;
				})
				);
	

		
	}
	
	// --> Tìm ra công thức chung của điều kiện4
	// DK1: book.getPublisher().equals(givenPublisher)
	// DK2: book.getSalePrice() < (givenPrice)
	// DK3: minInclusive <= salesPrice && salesPrice <= maxInclusive
	
	// Strategy Pattern: Tham số hoá 1 hành vi, hàm thay vì là biến, giá trị
	// Tìm ra công thức chung(hàm trừu tượng)  của các DK trên
	// 1. Tham số truyền vào là gì ---> Book
	// 2. Kiểu trả về là gì ----> boolean
	
	// ----> Tạo ra 1 functional interface với tên bất kỳ, hàm trừu tượng có tên bất kỳ
	// có input, output đã xác định ở bước trên
	// BookTest() Boolean check(Book book)
	
	
	// ============== Function using Strategy pattern =================
	private static Book[] findBooks(Book[] source, BookTest booktest) {
		Book[] result = new Book[source.length];
		int count = 0;
		
		for(Book book: source) {
			if (booktest.check(book)) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	// ================ Function =================
	// Chưa ứng phó với việc khách hàng thay đổi yêu cầu liên tục 
	// Có yêu cầu mới --> tạo hàm mới, trùng hầu hết code chỉ khác điều kiện không yêu cầu
	
	// Tìm toàn bộ sách thuộc nhà xuất bản "** ? **"
	private static Book[] findBooksByPublisher(Book[] source, String givenPublisher) {
		Book[] result = new Book[source.length];
		int count = 0;
		
		for(Book book: source) {
			if (book.getPublisher().equals(givenPublisher)) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	// Tìm toàn bộ sách có đơn giá nhỏ hơn ** ? **
	private static Book[] findBooksWithPriceLessThan(Book[] source, Double givenPrice) {
		Book[] result = new Book[source.length];
		int count = 0;
		
		for(Book book: source) {
			if (book.getSalePrice() < (givenPrice)) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	// Tìm toàn bộ sách có đơn giá nhỏ từ ** ? ** ----> ** ? **
		
	private static Book[] findBooksWithPriceỈnange(Book[] source, Double minInclusive, Double maxInclusive) {
		Book[] result = new Book[source.length];
		int count = 0;
		
		for(Book book: source) {
			Double salesPrice = book.getSalePrice();
			if (minInclusive <= salesPrice && salesPrice <= maxInclusive) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}

	
	
	// ============== Data ================
	
	private static Book[] mockData() {
		return new Book[] {
				new TextBook("SGKA1", 88d, "NXB-HN1", true),
				new TextBook("SGKA2", 14d, "NXB-HN2", true),
				new TextBook("SGKA3", 65d, "NXB-DN1", false),
				new TextBook("SGKA4", 92d, "NXB-DN2", true),
				new ReferenceBook("STKB1", 210d, "NXB-HCM1", 4d),
				new ReferenceBook("STKB2", 114d, "NXB-HCM1", 2d),
				new ReferenceBook("STKB3", 88d, "NXB-HCM2", 4d),
				new ReferenceBook("STKB4", 66d, "NXB-HCM2", 2d),
				new ReferenceBook("STKC1", 140d, "NXB-HCM3", 4d),
				new ReferenceBook("STKC2", 85d, "NXB-HCM3", 4d),

		};
	}
	private static void generate(String prefix, Book[] books)
	{
		System.out.println(prefix + "{\n");
		for(Book book : books) {
			System.out.println(" + " + book);
		}
		System.out.println("}\n");
		
	}
}
 