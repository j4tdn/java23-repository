package view;

import bean.Book;
import bean.BookStore;
import bean.ReferBook;
import bean.TextBook;

public class Ex05 {
	public static void main (String arg[]) {
		BookStore store = new BookStore();
		Book[] nhiDongBooks = store.findBooksByPublisher("Nhi Đồng");
        System.out.println("Sách thuộc nhà xuất bản Nhi Đồng:");
        for (Book book : nhiDongBooks) {
            System.out.println(book.getBookId());
        }
        
        Book[] cheapBooks = store.findBooksByPriceLessThan(50);
        System.out.println("Sách có đơn giá nhỏ hơn 50:");
        for (Book book : cheapBooks) {
            System.out.println(book.getBookId());
        }
        
        TextBook[] textBooksInRange = store.findTextBooksByPriceRange(100, 200);
        System.out.println("Sách giáo khoa có đơn giá từ 100 đến 200:");
        for (TextBook book : textBooksInRange) {
            System.out.println(book.getBookId());
        }
        
        TextBook textBook = (TextBook) store.books[0]; 
        ReferBook referBook = (ReferBook) store.books[3];
        double totalPrice = store.calculateTotalPrice(textBook, referBook);
        System.out.println("Tổng tiền khách hàng phải thanh toán: " + totalPrice);
    }
}

