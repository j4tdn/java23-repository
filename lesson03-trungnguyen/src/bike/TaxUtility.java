package bike;

public class TaxUtility {
	public static double taxCalculating(Bike bike) {
		if (bike.getCapacity() < 100) {
            return bike.getPrice() * 0.01;
        } else if (bike.getCapacity()<= 200) {
            return bike.getPrice() * 0.03;
        } else {
            return bike.getPrice() * 0.05;
        }
	}
}
