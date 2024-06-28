package view;

public class CarTable {
	
    private double tax;
	public CarTable() {}
	
	public CarTable(double tax) {
		this.tax = tax;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double cartax(int dungtich, double giaxe) {
		if (dungtich < 100) {
            return giaxe * 0.01;
        } else if (dungtich <= 200) {
            return giaxe * 0.03;
        } else {
            return giaxe * 0.05;
        }
	}
	
	public void InTable(Input_Vehicle[] ve) {
		System.out.printf("/n");
        
        for (int j = 0; j < ve.length; j++) {
        	System.out.println("====================================================================================================");
            System.out.printf("%-20s %-20s %-20s %-20s %-20s%n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
            Input_Vehicle vle = ve[j];
            double tax = cartax(vle.getDungtich(), vle.getGiaxe());
            vle.output(tax);
        }
    }
}