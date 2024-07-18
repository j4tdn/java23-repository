package inheritance.cclass;

import java.util.Arrays;

public class ZInheritanceClassDemo {
	/*
	  Viết 1 chương trình :Giải lập bài toán ql lí sách trong thư viện trong đó có 2 loại sách chính
	  
	  +Sách tham khảo : mã sách , tên sách, giá bán, nxb
	  +Sách tham khảo: mã sach, tên sách , giá bán , nxb, % thuế
	  Text book: id , name , salePrice, publisher, isNew, discount
	  ReferenceBook:id, name ,salesPrice, publisher, tax
	  
	  -->Các thuộc tính như là id , name , salesPrice, publisher chung
	  -->Tạo ra 1 class chung (Cha):
	  
	  -->Box :id , name ,salesPrice , publicsher
	  --textBook :isNe, discount
	  --.ReferenceBook:tax
	  
	  Yêu cầu tạo danh sách trong thư viên
	  Liệt kê các sách thuộc nhà xuất bản Nhi đồng
	  +Lieetjh kê các sách có giảm giá
	  + Giải lập bài toán mua sách , tính tiền 
	 */
	public static void main(String[] args) {
		Book[] books = mockData();
		
		generate(
			"Liệt kê các sách thuộc nxb Nhi Đồng",
			findBooksByPublisher(books, "Nhi Dong")
		);
		
		generate(
			"Liệt kê các sách có giảm giá > 2%",
			findBooksWithDiscount(books)
		);
		
		System.out.println("Billing --> " + billing(books[0], books[1]));
	}
	
	private static double billing(Book... booksToBeCalted) {
		double total = 0d;
		for (Book book: booksToBeCalted) {
			double salesPrice = 0;
			if (book instanceof TextBook tb) {
				salesPrice = tb.getSalesPrice() * (100 - tb.getDiscount()) / 100;
			} else if (book instanceof ReferenceBook rb) {
				salesPrice = rb.getSalesPrice() * (100 + rb.getTax()) / 100;
			}
			total = total + salesPrice;
		}
		return total;
	}

	
	private  static Book[]mockData(){
		return new Book[] {
				new TextBook(1, "TB-1", 12d, "Nhi Dong",false, 0d),
				new TextBook(2, "TB-2", 16d, "Ha Noi", false, 5d),
				new ReferenceBook(3,"Rf3",40d,"Nhi Dong",2d),
				new ReferenceBook(4,"Rf4",40d,"Da Nang",8d),
				new ReferenceBook(5,"Rf5",40d,"Nhi Dong",3d),
				new TextBook(6, "TB-6", 62d, "Nhi Dong", false, 10d),
			    new TextBook(7, "TB-7", 26d, "Da Nang", false, 0d)
		};
	
}
	private static void generate(String prefix,Book[]books) {
		System.out.println(prefix+"-->{");
		for (Book book :books) {
			System.out.println(" + "+book);
		}
		System.out.println("}\n");
	}

}