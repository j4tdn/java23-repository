package taxbuyingcar;

public class App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyen Thu Loan", "Future Neo", 100, 3500000000d);
		Vehicle v2 = new Vehicle("Le Minh Tinh", "Ford Ranger", 3000, 2500000000d);
		Vehicle v3 = new Vehicle("Nguyen Minh Triet", "Landscape", 150, 1000000000d);
		
		Vehicle[] vehicles = {v1,v2,v3};
		
		System.out.printf("%-30s %-20s %-20s %-20s %-20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		for(Vehicle v : vehicles)
			System.out.printf("%-30s %-20s %-20s %-20.2f %-20.2f\n", v.getAuthorName(), v.getCarType(), v.getXylanh(), v.getCharge(), v.getTax());
	}
}
