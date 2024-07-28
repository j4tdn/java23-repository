package view;

import java.util.Arrays;

import bean.Book;
import bean.ReferenceBooks;
import bean.TextBooks;

public class Ex05Main {
	
	public static void main(String[] args) {
		Book tb1 = new TextBooks("SGK01", 40d, "Nhi Đồng", "Cũ");
		Book tb2 = new TextBooks("SGK02", 115d, "Nhi Đồng", "Mới");
		Book tb3 = new TextBooks("SGK03", 65d, "ABC", "Cũ");
		
		Book rb1 = new ReferenceBooks("STK01", 35d, "Nhi Đồng", 0.1d);
		Book rb2 = new ReferenceBooks("STK02", 55d, "ABC", 0.05d);
		
		Book[] books = {tb1, tb2, tb3, rb1, rb2};
		
		for(Book b: books) {
			System.out.println(b);
		}
		
		generation("\nSách thuộc nhà xuấn bản Nhi Đồng: ", findBook_nxb(books));
		generation("\nSách có đơn giá nhỏ hơn 50: ", findBook_price(books));
		generation("\nSách giáo khoa có đơn giá từ 100 đến 200: ", findTextBook_price(books));
		
		Book[] bs = {tb1, rb2};
		double sum = 0;
		System.out.println("Tổng tiền mà khách hàng phải thanh toán: " );
		for(Book b: bs) {
			sum+= b.totalAmount(books);
				}
		System.out.println("--> " + sum);
	}
	
	private static void generation(String content, Book[] books) {
		System.out.println(content + "--> ");
		for(Book b: books) {
			System.out.println(" " + b);
		}
		System.out.println();
	}
	
	private static Book[] findBook_nxb(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book b: books) {
			if(b.getNxb() == "Nhi Đồng") {
				result[count++] = b;
			}
		}
		return Arrays.copyOf(result, count);
	}
	
	private static Book[] findBook_price(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book b: books) {
			if(b.getPrice() < 50) {
				result[count++] = b;
			}
		}
		return Arrays.copyOf(result, count);
	}
	
	private static Book[] findTextBook_price(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book b: books) {
			if(b instanceof TextBooks tb) {
				if(tb.getPrice() >= 100 && tb.getPrice() <=200) {
					result[count++] = tb;
				}
			}
		}
		return Arrays.copyOf(result, count);
	}
	
	
}
