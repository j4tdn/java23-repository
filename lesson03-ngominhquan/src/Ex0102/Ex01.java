package Ex0102;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Vehicle;

public class Ex01 {
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		List<Vehicle> vehicles = new ArrayList<>();
		
		while (true) {
            System.out.println("1. Nhập thông tin và tạo đối tượng xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Nhập tên chủ xe: ");
                String owner = scanner.nextLine();
                System.out.print("Nhập loại xe: ");
                String type = scanner.nextLine();
                System.out.print("Nhập trị giá xe: ");
                double value = scanner.nextDouble();
                System.out.print("Nhập dung tích xy lanh (cc): ");
                int cylinderCapacity = scanner.nextInt();


                Vehicle vehicle = new Vehicle(owner, type, value, cylinderCapacity);
                vehicles.add(vehicle);
                System.out.println("Xe đã được thêm vào danh sách.");
            } else if (choice == 2) {
            	System.out.printf("%-20s %-15s %10s %15s %15s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                System.out.println("===================================================================================");
                for (Vehicle vehicle : vehicles) {
                    vehicle.printDetails();
                }
            } else if (choice == 3) {
                System.out.println("Thoát chương trình.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
	}

}
