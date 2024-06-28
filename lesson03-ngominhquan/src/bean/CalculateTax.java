package bean;

public class CalculateTax {
	public static double calculateTax(double price, int engineCapacity) {
		if (engineCapacity < 100) {
			return price * 0.01;
		} else if (engineCapacity >= 100 && engineCapacity <= 200) {
			return price *0.03;
		} else {
			return price * 0.05;
		}
	}
	
}
