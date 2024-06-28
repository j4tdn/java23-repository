package Exercise2;
import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {
    private String Name;
    private String vehicleType;
    private int engineCapacity;
    private double price;
    
    public Vehicle(String Name, String vehicleType, int engineCapacity, double price) {
        this.Name = Name;
        this.vehicleType = vehicleType;
        this.engineCapacity = engineCapacity;
        this.price = price;
    }

    public double calculateTax() {
        if (engineCapacity < 100) {
            return price * 0.01;
        } else if (engineCapacity <= 200) {
            return price * 0.03;
        } else {
            return price * 0.05;
        }
    }

    public void displayInfo() {
        System.out.printf("%-20s %-15s %-10d %-15.2f %-15.2f%n", Name, vehicleType, engineCapacity, price, calculateTax());
    }
    public class VehicleTax {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Vehicle> vehicleList = new ArrayList<>();

            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Enter vehicle information");
                System.out.println("2. Display tax information");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                if (choice == 1) {
                    System.out.print("Enter owner name: ");
                    String ownerName = scanner.nextLine();

                    System.out.print("Enter vehicle type: ");
                    String vehicleType = scanner.nextLine();

                    System.out.print("Enter engine capacity: ");
                    int engineCapacity = scanner.nextInt();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    Vehicle vehicle = new Vehicle(ownerName, vehicleType, engineCapacity, price);
                    vehicleList.add(vehicle);
                } else if (choice == 2) {
                    System.out.printf("%-20s %-15s %-10s %-15s %-15s%n", "Owner Name", "Vehicle Type", "Capacity", "Price", "Tax");
                    for (Vehicle vehicle : vehicleList) {
                        vehicle.displayInfo();
                    }
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

            scanner.close();
        }
    }
}

	
