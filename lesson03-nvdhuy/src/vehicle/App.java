package vehicle;

public class App {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("C001", "Nguyễn Thu Loan", "123", "Đà Nẵng");
		Customer c2 = new Customer("C002", "Lê Minh Tính", "456", "Hà Nội");
		Customer c3 = new Customer("C003", "Nguyễn Minh Triết", "999", "Hà Tĩnh");
		
		Car x1 = new Car("Future Neo", 100, 3500000);
		Car x2 = new Car("Ford Ranger", 3000, 25000000);
		Car x3 = new Car("Landscape", 1500, 10000000);
		
		System.out.println("KH1 " + c1);
		System.out.print("Car 1 " + x1);
		System.out.println("  " + x1.Itax());
		System.out.println("KH2 " + c2);
		System.out.print("Car 2 " + x2);
		System.out.println("c2  " + x2.Itax());
		System.out.println("KH3 " + c3);
		System.out.print("Car 3 " + x3);
		System.out.println("c3  " + x3.Itax());
	}
}
