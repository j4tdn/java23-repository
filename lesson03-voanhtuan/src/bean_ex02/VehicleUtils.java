package bean_ex02;

import java.util.Scanner;

public class VehicleUtils {

	public static double calculateTax(Vehicle vehicle) {
		if (vehicle.getVolume() < 100) {
			return vehicle.getPrice() * 0.01;
		} else if (vehicle.getVolume() <= 200) {
			return vehicle.getPrice() * 0.03;
		} else {
			return vehicle.getPrice() * 0.05;
		}
	}

	 public static Vehicle[] importVehicle(int n) {
	        Scanner scanner = new Scanner(System.in);
	        Vehicle[] vehicles = new Vehicle[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nNhập thông tin cho xe thứ " + (i + 1) + ":");
	            System.out.print("Tên chủ xe: ");
	            String ownerName = scanner.nextLine();
	            System.out.print("Loại xe: ");
	            String model = scanner.nextLine();
	            System.out.print("Dung tích động cơ: ");
	            int volume = scanner.nextInt();
	            System.out.print("Trị giá: ");
	            double price = scanner.nextDouble();
	            scanner.nextLine();

	            vehicles[i] = new Vehicle(ownerName, model, volume, price);
	        }
	        return vehicles;
	    }
	
	public static void exportVehicle(Vehicle vehicle) {
		System.out.printf("%-18s %-15s %9d %15.2f %18.2f%n\n",
                vehicle.getOwnerName(),
                vehicle.getModel(),
                vehicle.getVolume(),
                vehicle.getPrice(),
                calculateTax(vehicle));
	}
	
}
