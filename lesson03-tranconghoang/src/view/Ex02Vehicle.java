package view;

import java.util.Scanner;

import bean.Vehicle;

public class Ex02Vehicle {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập N phương tiện: ");
		int n = Integer.parseInt(ip.nextLine());
		Vehicle[] vehicles = new Vehicle[n];
		for(int i = 0; i < n; i++) {
			if(i == 0) 
				System.out.println("Nhập phương tiện thứ nhất: ");
			else
			    System.out.println("Nhập phương tiện thứ " + (i + 1) + ": ");
			
			System.out.print("Nhập tên chủ xe: ");
			String ownerName = ip.nextLine();
			System.out.print("Nhập loại xe: ");
			String type = ip.nextLine();
			System.out.print("Nhập dung tích xe: ");
			int capacity = Integer.parseInt(ip.nextLine());
			System.out.print("Nhập trị giá xe: ");
			double price = Double.parseDouble(ip.nextLine());
			
			//Luu gia tri vao mang
			vehicles[i] = new Vehicle(ownerName, type, capacity, price);
		}	
			printfBasedOnFormat();
			for(Vehicle vehicle: vehicles) {
				System.out.printf("%-20s %-20s %-20d %-20f %-20f\n", vehicle.getOwnerName(), vehicle.getType(), vehicle.getCapacity(),
						           vehicle.getPrice(), vehicle.calculateTax());
			}
	}
	private static void printfBasedOnFormat() {
		System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("===================================================================================================");
				         
	}
}
