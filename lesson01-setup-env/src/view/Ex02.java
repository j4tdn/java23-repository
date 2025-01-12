package view;


import oop.Vehicle;

public class Ex02 {
	public static void main(String[] args) {
		
		 Vehicle[] vehicles = new Vehicle[] {
		            new Vehicle("Nguyễn Văn A", "Xe máy", 50.0, 20000000.0),
		            new Vehicle("Trần Thị B", "Ô tô", 150.0, 500000000.0),
		            new Vehicle("Lê Minh C", "Xe tải", 250.0, 800000000.0)
	};
		 System.out.printf("%-20s %-15s %-15s %-15s %-15s%n", 
	                "Chủ sở hữu", "Loại xe", "Dung tích", "Giá trị", "Thuế");
		 for (Vehicle vehicle : vehicles) {
	            System.out.printf("%-20s %-15s %-15.2f %-15.2f %-15.2f%n",
	                    vehicle.getOwnerName(),
	                    vehicle.getVehicleType(),
	                    vehicle.getCylinderCapacity(),
	                    vehicle.getVehicleValue(),
	                    vehicle.calculateTax());
	        }
	}
}
