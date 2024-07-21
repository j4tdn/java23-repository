package view;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import bean.Vehicle;

public class Ex02VehicleDemo {
	
	private static DecimalFormat df = new DecimalFormat("#,###");
	
	public static void main(String[] args) {
		
		// 1. Nhập thông tin N đối tượng xe
		Vehicle[] vehicles = getVehicleData();
		
		// 2. Xuất bảng kê khai tiền thuế trước bạ của các xe
		generate(vehicles);
	}
	
	private static void generate(Vehicle[] vehicles) {
		System.out.printf("%-20s %-15s %-10s %-15s %-15s\n", 
				"Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("=============================================================================");
		for (Vehicle vehicle: vehicles) {
			System.out.printf("%-20s %-15s %-10d %-15s %-15s\n", 
					vehicle.getOwner(), vehicle.getModel(), vehicle.getCapacity(),
					vehicle.getFormattedSalesPrice(df), vehicle.getFormattedTax(df));
		}
	}
	
	private static Vehicle[] getVehicleData() {
		return new Vehicle[] {
			new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, bd("35000000")),
			new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, bd("250000000")),
			new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, bd("1000000000")),
			new Vehicle("Hoàng Văn Tèo", "Honda", 400, bd("400000000")),
			new Vehicle("Đặng Văn A", "Yamaha", 200, bd("80000000"))
		};
	}
	
	private static BigDecimal bd(String val) {
		return new BigDecimal(val);
	}
	
}
