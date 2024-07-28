package view;
import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class Store {

	public static void main(String[] args) {
//		TextBook tb1 = new TextBook(01,100d,"Nhi Đồng","new");
//		TextBook tb2 = new TextBook(02,200d,"Kim Đồng","old");
//		TextBook tb3 = new TextBook(03,150d,"Kim Đồng","new");
//		
//		ReferenceBook rb1 = new ReferenceBook(04,50d,"Nhi Đồng",10);
//		ReferenceBook rb2 = new ReferenceBook(05,250d,"Kim Đồng",5);
//		
//		Book[] books = {tb1,tb2,tb3,rb1,rb2};
	
	        Book[] books = booksArray();
	        findNhiDong(books);
	        findMin50(books);
	        findBookAvg(books);
	}
	private static Book[] booksArray() {
		return new Book[] {
			new TextBook(01,100d,"Nhi Đồng","new"),
			new TextBook(02,200d,"Kim Đồng","old"),
			new TextBook(03,150d,"Kim Đồng","new"),
			new ReferenceBook(04,50d,"Nhi Đồng",10),
			new ReferenceBook(05,250d,"Kim Đồng",5),
			
		};
	}
	
	private static Book[] findNhiDong(Book[] books) {
      Book[] result = new Book[books.length];
	  int count = 0;
      for(Book book:books) {
    	  if("Nhi Đồng".equals(book.getOwner())) {
			result[count++] = book;
    	  }
      }
      return Arrays.copyOfRange(result,0,count);
	}
	
	private static Book[] findMin50(Book[] books) {
		 Book[] result = new Book[books.length];
		  int count = 0;
	      for(Book book:books) {
	    	  if(book.getSalesPrice() < 50) {
				result[count++] = book;
	    	  }
	      }
	      return Arrays.copyOfRange(result,0,count);
		}

	private static Book[] findBookAvg(Book[] books) {
		 Book[] result = new Book[books.length];
		  int count = 0;
	      for(Book book:books) {
	    	  if(book.getSalesPrice() > 100 && book.getSalesPrice() <200) {
				result[count++] = book;
	    	  }
	      }
	      return Arrays.copyOfRange(result,0,count);
		}

//	private static void sum(Book[] books) {
//	      for(Book book:books) {
//         if(book.getOwner())
//		
//	}
}



