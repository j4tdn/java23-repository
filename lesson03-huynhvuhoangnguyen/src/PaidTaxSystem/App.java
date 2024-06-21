package PaidTaxSystem;
import java.util.Scanner;
import bean.Vehicle;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of vehicle: ");
		int N = scanner.nextInt();
		scanner.nextLine();
		
		Vehicle[] vehicles = new Vehicle[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Enter vehicle information " + (i + 1) + ":");
			System.out.println("Owner name: ");
			String ownerName = scanner.nextLine();
			System.out.println("Price: ");
			double price = scanner.nextDouble();
			System.out.println("Engine Capacity: ");
			int engineCapacity = scanner.nextInt();
			scanner.nextLine();
			
			vehicles[i] = new Vehicle(ownerName, price, engineCapacity);
		}
		
		System.out.println("\nTax Table:");
		System.out.printf("%-20s %-15s %-15s %-15s\n", "Owner Name", "Price", "Engine Capacity", "Tax Amount");
		for (Vehicle vehicle : vehicles) {
			vehicle.displayInfo();
		}
		
		System.out.println("\nExit.");
		scanner.close();
	}
	
}
