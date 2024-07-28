package ex05;

public class main {
	public static void main(String[] args) {
		TextBook t1 = new TextBook("SGK1", 100, "Nhi Dong", "new");
		TextBook t2 = new TextBook("SGK2", 200, "Van Hoc", "new");
		TextBook t3 = new TextBook("SGK3", 150, "Nhi Dong", "old");
		References r1 = new References("STK", 220, "Toan Hoc", 10);
		References r2 = new References("STK", 40, "Nhi Dong", 4);
		
		
		Book [] book = {t1,t2,t3,r1,r2};
		 for (Book n : book) {
			 if(n.getPublisher() == "Nhi Dong") {
				 System.out.println("Sach thuoc NXB Nhi Dong la " + n);
			 }
		 }
		 for (Book n : book) {
			 if(n.getSalesPrices() < 50) {
				 System.out.println("Sach co don gia nho hon 50 la " + n);
			 }
		 }
		 for (Book n : book) {
			 if(n.getSalesPrices() >= 100 && n.getSalesPrices()  < 200) {
				 System.out.println("Sach co don lon hon 100 va nho hon 200 la " + n);
	}
		 }
	}
}
