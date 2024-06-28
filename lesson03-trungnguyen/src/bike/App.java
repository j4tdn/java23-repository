package bike;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng xe: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		Bike[] bikes = new Bike[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Xe thứ " + (i + 1) + " : ");
			System.out.print("Chủ sở hữu: ");
			String owner = scanner.nextLine();
			System.out.println("Tên xe: ");
			String name = scanner.nextLine();
			System.out.print("Trị giá xe: ");
			double price = scanner.nextDouble();
			System.out.print("Dung tích xy lanh: ");
			int capacity = scanner.nextInt();
			scanner.nextLine();
			bikes[i] = new Bike(owner, name, capacity, price);
		}
		System.out.printf("%-20s %-15s %-15s %-15s %-15s\n", "Tên chủ xe","Loại xe",  "Trị giá xe", "Dung tích",
				"Thuế phải nộp");
		System.out.println("===============================================================================================");
		for (Bike bike : bikes) {
			System.out.printf("%-20s %-15s %-15.2f %-15d %-15.2f\n", bike.getOwner(),bike.getName(), bike.getPrice(),
					bike.getCapacity(), TaxUtility.taxCalculating(bike));
		}

		scanner.close();
	}
}
