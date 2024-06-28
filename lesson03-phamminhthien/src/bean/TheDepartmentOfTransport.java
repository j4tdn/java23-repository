package bean;

public class TheDepartmentOfTransport {
	private double tax;
	
	
	public TheDepartmentOfTransport() {}
	

	public TheDepartmentOfTransport(double tax) {
		this.tax = tax;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}


	public double calculateTaxRate(int dungtich, double giaxe) {
		if (dungtich < 100) {
            return giaxe * 0.01;
        } else if (dungtich <= 200) {
            return giaxe * 0.03;
        } else {
            return giaxe * 0.05;
        }
	}
	
	public void displayVehicleTaxes(Vehicle[] vehicles) {
		System.out.println("\n");
		System.out.printf("%63s%n", "BẢNG KÊ KHAI THUẾ TRƯỚC BẠ");
        System.out.println("====================================================================================================");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("====================================================================================================");

        int i=0;
        for (Vehicle vehicle : vehicles) {
            tax = calculateTaxRate(vehicle.getDungtich(), vehicle.getGiaxe());
            vehicle.output(tax);
        }
    }
	
}
