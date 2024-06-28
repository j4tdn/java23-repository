package vehicles;

public class VehicleUtils {
	public static Vehicle[] createVehicleArray() {
        Vehicle[] vehicleArray = {
        	 new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000),
       		 new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000),
       		 new Vehicle("Nguyễn Minh Triết", "Landscase", 1500, 1000000000)
        };
        return vehicleArray;
    }

    public static void displayVehicleArray(Vehicle[] vehicleArray) {
        System.out.println("\nVehicle Registration Tax List:");
        System.out.printf("%-5s %-20s %-20s %-20s %-15s %-15s%n", "No.", "Owner Name", "Vehicle Type", "Cylinder Capacity", "Vehicle Value", "Tax Value");
        for (int i = 0; i < vehicleArray.length; i++) {
            Vehicle vehicle = vehicleArray[i];
            System.out.printf("%-5d %-20s %-20s %-20.2f %-15.2f %-15.2f%n", i + 1, vehicle.getOwnerName(), vehicle.getVehicleType(), vehicle.getCylinderCapacity(), vehicle.getVehicleValue(), vehicle.getTaxValue());
        }
    }
}
