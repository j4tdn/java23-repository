package bean;

public class Vehicle {
	
	private String owner;
    private double value;
    private int cylinderCapacity;
    private String type;
   
    public Vehicle() {
    	
    }

    public Vehicle(String owner, String type, double value, int cylinderCapacity) {
        this.owner = owner;
        this.value = value;
        this.cylinderCapacity = cylinderCapacity;
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }
    
    public double getValue() {
        return value;
    }
    
    public int getCylinderCapacity() {
        return cylinderCapacity;
    }
    
    public double calculateTax() {
        if (cylinderCapacity < 100) {
            return value * 0.01;
        } else if (cylinderCapacity <= 200) {
            return value * 0.03;
        } else {
            return value * 0.05;
        }
    }
    
    public void printDetails() {
        System.out.printf("%-20s %-15s %10d %15.2f %15.2f\n", owner, type, cylinderCapacity, value, calculateTax());
    }

}
