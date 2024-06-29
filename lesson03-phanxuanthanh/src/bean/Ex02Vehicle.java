package bean;

import java.util.Scanner;

public class Ex02Vehicle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng xe cần thêm thông tin: ");
		int n = Integer.parseInt(sc.nextLine());
		int count = 1;
		Vehicle[] vehiclesArrays = new Vehicle[n];
		for (int i = 0; i < vehiclesArrays.length; i++) {
			System.out.println("----- Nhập thông tin xe thứ " + count + " -----");
			System.out.print("Nhập tên chủ xe: ");
			String carOwner = sc.nextLine();
			System.out.print("Nhập loại xe: ");
			String category = sc.nextLine();
			System.out.print("Nhập dung tích: ");
			int capacity = Integer.parseInt(sc.nextLine());
			System.out.print("Nhập trị giá: ");
			double cost = Double.parseDouble(sc.nextLine());

			Vehicle vehicle = new Vehicle();
			vehicle.setCarOwner(carOwner);
			vehicle.setCategory(category);
			vehicle.setCapacity(capacity);
			vehicle.setCost(cost);
			vehiclesArrays[i] = new Vehicle(carOwner, category, capacity, cost);
		}
		System.out.println("| Tên chủ xe | loại xe | dung tích | trị giá | thuế phải nộp |");
		System.out.println("==============================================================");
		for (Vehicle v : vehiclesArrays) {
			System.out.println(v);
		}
		sc.close();
	}
}
