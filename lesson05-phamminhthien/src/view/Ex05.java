package view;

import org.w3c.dom.Text;
import bean.*;
public class Ex05 {
	
	private static Book[] ds ;
	public static void main(String[] args) {

		
		
	}
	public static Book[] dsBook () {
		ds = new Book[5];
		TextBook tb1 = new TextBook("SGK", 10000, "Nhi Đong", "moi");
		TextBook tb2 = new TextBook("SGK", 14000, "Nhi Đong", "moi");
		TextBook tb3 = new TextBook("SGK", 15000, "Nhi Đong", "cu");
		
		RefrenceBook rb1 = new RefrenceBook("STK", 30000, "Kim Dong", 5);
		RefrenceBook rb2 = new RefrenceBook("STK", 34000, "Nhi Dong", 15);
		
		return ds;
	}
	
	public static findBook name(Book[] ds, String nxb) {
	
		System.out.println("Sách của nhà xuất bản + " );
	}
}
