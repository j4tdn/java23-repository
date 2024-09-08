package test03.ex05;

import java.util.Arrays;

public class Ex05BookDemo {
	
	public static void main(String[] args) {
		// Lưu danh sách các đối tượng vào mảng một chiều duy nhất
		Book[] books = mockData();
		 
		generate("1. Danh sách sách trong của hàng", books);
		
		generate(
			"2. Tìm toàn bộ sách thuộc nhà xuất bản **-?-**", 
			// findBooksByPublisher(books, "NXB-HCM1")
			findBooks(books, book -> book.getPublisher().equals("NXB-HN1"))
		);
		
		generate(
			"3. Tìm toàn bộ sách có đơn giá nhỏ hơn **-?-**", 
			// findBooksWithPriceLessThan(books, 100d)
			findBooks(books, book -> book.getSalesPrice() < 100d)
		);
		
		generate(
			"4. Tìm toàn bộ sách giáo khoa có đơn giá từ **-?-** đến **-?-**", 
			// findBooksWithPriceInRange(books, 50d, 100d)
			findBooks(books, book -> {
				Double salesPrice = book.getSalesPrice();
				return salesPrice >= 100d && salesPrice <= 200d;
			})
		);
	}
	
	// DK1: book.getPublisher().equals(givenPublisher)
	// DK2: book.getSalesPrice() < givenPrice
	// DK3: book.getSalesPrice() >= minInc && book.getSalesPrice() <= maxInc
	
	// Strategy Pattern: Tham số hóa 1 hành vi, hàm thay vì là biến, giá trị
	
	// Tìm ra công thức chung(hàm trừu tượng) của các DK trên
	// 1. Tham số truyền vào là gì --> Book
	// 2. KDL trả về là gì --> boolean
	
	// Tạo ra 1 functional interface với 1 tên bất kỳ, hàm trừu tượng có tên bất kỳ
	// có input, output đã xác định ở bước trên
	// BookTest boolean check(Book book)
	
	// ============== Làm các chức năng(sử dụng strategy pattern) ==============
	private static Book[] findBooks(Book[] source, BookTest bookTest) {
		Book[] result = new Book[source.length];
		int count = 0;
		
		for (Book book: source) {
			if (bookTest.check(book)) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	// ============== Làm các chức năng ==============
	// Chưa ứng phó với việc khách hàng thay đổi yêu cầu liên tục
	// Cứ có yêu cầu mới phải tạo hàm mới, trùng hầu hết code chỉ khác điều kiện kh yêu cầu
	// Tìm toàn bộ sách thuộc nhà xuất bản **-?-**
	private static Book[] findBooksByPublisher(Book[] source, String givenPublisher) {
		Book[] result = new Book[source.length];
		int count = 0;
		
		for (Book book: source) {
			if (book.getPublisher().equals(givenPublisher)) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	// Tìm toàn bộ sách có đơn giá nhỏ hơn **-?-**
	private static Book[] findBooksWithPriceLessThan(Book[] source, Double givenPrice) {
		Book[] result = new Book[source.length];
		int count = 0;
		
		for (Book book: source) {
			if (book.getSalesPrice() < givenPrice) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	// Tìm toàn bộ sách giáo khoa có đơn giá từ **-?-** đến **-?-**
	private static Book[] findBooksWithPriceInRange(Book[] source, Double minInc, Double maxInc) {
		Book[] result = new Book[source.length];
		int count = 0;
		
		for (Book book: source) {
			Double salesPrice = book.getSalesPrice();
			if (salesPrice >= minInc && salesPrice <= maxInc) {
				result[count++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	
	// ============== Tạo dữ liệu cho cửa hàng ================
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
			new ReferenceBook("STKC2", 85d, "NXB-HCM3", 4d)
		};
	}
	
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + " ---> {");
		for (Book book: books) {
			System.out.println("  + " + book);
		}
		System.out.println("}\n");
	}
	
}