package view;

import java.util.Scanner;

import bean.Vehicle;

public class Ex02Vehicle {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Enter the number of vehicles: ");
		int n = Integer.parseInt(ip.nextLine());
		Vehicle[] vs = new Vehicle[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Vehicle " + (i + 1) + ":");

			System.out.println("Enter owner name: ");
			String ownerName = ip.nextLine();

			System.out.println("Enter model: ");
			String model = ip.nextLine();

			System.out.println("Enter capacity: ");
			int capacity = Integer.parseInt(ip.nextLine());

			System.out.println("Enter price: ");
			double price = Double.parseDouble(ip.nextLine());

			vs[i] = new Vehicle(ownerName, model, capacity, price);
		}

		System.out.printf("%-20s %-15s %-15s %-20s %-20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("==================================================================================================");
		for (Vehicle v : vs) {
			System.out.printf("%-20s %-15s %-15d %-20.2f %-20.2f\n", v.getOwnerName(), v.getModel(), v.getCapacity(), v.getPrice(), v.tax());
		}
		return;
	}
}
