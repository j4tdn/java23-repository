package view;

import java.util.Scanner;

import bean_ex02.Vehicle;
import bean_ex02.VehicleUtils;

public class Ex02VehicleTax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng xe: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		Vehicle[] vehicles = VehicleUtils.importVehicle(n);
		
		System.out.println("\n~~~~Bảng kê khai~~~~\n");
		System.out.println("Tên chủ xe         Loại xe         Dung tích         Trị giá      Thuế phải nộp");
        System.out.println("===============================================================================");
		for (Vehicle vehicle : vehicles) {
			VehicleUtils.exportVehicle(vehicle);
		}
	}
}
