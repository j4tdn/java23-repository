package car;

import java.util.Scanner;

public class EnterVihicle {
	static int percent;
	static Scanner sc = new Scanner(System.in);

	public static void InputValue(Vehicle vehicle) {
		System.out.println("Input owner car: ");
		String owner = sc.nextLine();
		vehicle.setOwner(owner);

		System.out.println("Input transportation car: ");
		String transportation = sc.nextLine();
		vehicle.setTransportation(transportation);

		System.out.println("Input capacity car: ");
		Double capacity = sc.nextDouble();
		vehicle.setCapacity(capacity);
		
		System.out.println("Input price car: ");
		Double price = sc.nextDouble();
		vehicle.setPrice(price);

		if (capacity <= 100) {
			percent = 1;
		} else if (capacity > 100 && capacity <= 200) {
			percent = 3;
		} else
			percent = 5;
	}

	public static void Show(Vehicle vehicle) {
//		System.out.println("owner:" + vehicle.getOwner() +"\n transportation:" + vehicle.getTransportation()
//				+"\n capacity:" + vehicle.getCapacity() +"\n price:" + vehicle.getPrice() +"\n moneyTax: " +vehicle.moneyTax(percent));
		System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Owner", "Transportation", "Capacity", "Price",
				"MoneyTax");
		System.out.println("======================================================"
				+ "=============================================");

		System.out.printf("%-20s %-20s %-20.0f %-20.2f %-20.2f\n", vehicle.getOwner(), vehicle.getTransportation(),
				vehicle.getCapacity(), vehicle.getPrice(), vehicle.moneyTax(percent));

	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		InputValue(v1);
		Show(v1);
		InputValue(v2);
		Show(v2);
	}

}
 
