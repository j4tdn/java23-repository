package math;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ex02Vehicle> vehicles = new ArrayList<>();

        System.out.print("Nhập số lượng xe: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho xe thứ " + (i + 1) + ":");
            System.out.print("Tên chủ xe: ");
            String owner = scanner.nextLine();
            System.out.print("Loại xe: ");
            String VehicleType = scanner.nextLine();
            System.out.print("Dung tích xylanh: ");
            int EngineDisplacement = scanner.nextInt();
            System.out.print("Trị giá xe: ");
            double VehicleValue = scanner.nextDouble();
            scanner.nextLine(); 

            vehicles.add(new Ex02Vehicle(owner, VehicleType, EngineDisplacement, VehicleValue));
        }

        System.out.printf("%-20s %-20s %-10s %-15s %-15s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("============================================================================================");

        for (Ex02Vehicle vehicle : vehicles) {
            System.out.printf("%-20s %-20s %-10d %-15.2f %-15.2f\n",
                    vehicle.getOwner(),
                    vehicle.getVehicleType(),
                    vehicle.getEngineDisplacement(),
                    vehicle.getVehicleValue(),
                    vehicle.CalculateTax());
        }
        
        scanner.close();
    }
}
