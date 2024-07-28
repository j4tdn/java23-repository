package view;

import bean.Book;
import bean.ReferBook;
import bean.TextBook;

public class Ex05BookStore {

	private Book[] books;
    private int currentIndex;

    public Ex05BookStore() {
        books = new Book[5];
        currentIndex = 0;   
    }
    
    private Book[] trimArray(Book[] result, int count) {
		return null;
	}
    
    public static void main(String[] args) {
        
        Ex05BookStore bookStore = new Ex05BookStore();
        bookStore.createBooks();

        System.out.println("Các sách thuộc nhà xuất bản Nhi Đồng:");
        Book[] nhiDongBooks = bookStore.findBooksByPublisher("Nhi Đồng");
        for (Book book : nhiDongBooks) {
            System.out.println(book);
        }

        
        System.out.println("\nCác sách có đơn giá nhỏ hơn 50:");
        Book[] cheapBooks = bookStore.findBooksByPriceLessThan(50);
        for (Book book : cheapBooks) {
            System.out.println(book);
        }

        System.out.println("\nCác sách giáo khoa có đơn giá từ 100 đến 200:");
        TextBook[] textBooksInRange = bookStore.findTextBooksByPriceRange(100, 200);
        for (TextBook textBook : textBooksInRange) {
            System.out.println(textBook);
        }

    }
    
    public void createBooks() {
        books[0] = new TextBook("SGK001", 150, "Nhi Đồng", "new");
        books[1] = new TextBook("SGK002", 120, "Giáo Dục", "old");
        books[2] = new TextBook("SGK003", 90, "Nhi Đồng", "new");
        books[3] = new ReferBook("STK001", 200, "Thành Phố", 10);
        books[4] = new ReferBook("STK002", 80, "Nhi Đồng", 5);
    }

    // Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
    public Book[] findBooksByPublisher(String publisher) {
        Book[] result = new Book[books.length];
        int count = 0;

        for (Book book : books) {
            if (book != null && book.getPublisher().equalsIgnoreCase(publisher)) {
                result[count++] = book;
            }
        }

        return trimArray(result, count);
    }

    

	// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
    public Book[] findBooksByPriceLessThan(double price) {
        Book[] result = new Book[books.length];
        int count = 0;

        for (Book book : books) {
            if (book != null && book.getPrice() < price) {
                result[count++] = book;
            }
        }

        return trimArray(result, count);
    }

    // Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
    public TextBook[] findTextBooksByPriceRange(double minPrice, double maxPrice) {
        // Tạo mảng tạm thời để lưu kết quả
        TextBook[] result = new TextBook[books.length];
        int count = 0;

        for (Book book : books) {
            if (book instanceof TextBook) {
                TextBook textBook = (TextBook) book;
                if (textBook.getPrice() >= minPrice && textBook.getPrice() <= maxPrice) {
                    result[count++] = textBook;
                }
            }
        }
        // Tạo mảng có kích thước chính xác với số sách tìm thấy
        return trimArray(result, count);
    }

    // Tính tổng tiền mà khách hàng phải thanh toán
    public double calculateTotalCost(Customer customer, Book textbook, Book referBook) {
        double totalCost = 0;
        if (textbook != null) {
            totalCost += textbook.getFinalPrice();
        }
        if (referBook != null) {
            totalCost += referBook.getFinalPrice();
        }
        return totalCost;
    }

	
	
}
