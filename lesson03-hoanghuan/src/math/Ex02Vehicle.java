package math;

public class Ex02Vehicle {
	private String owner;
    private String VehicleType;
    private int EngineDisplacement;
    private double VehicleValue;

    public Ex02Vehicle(String owner, String VehicleType, int EngineDisplacement, double VehicleValue) {
        this.owner = owner;
        this.VehicleType = VehicleType;
        this.EngineDisplacement = EngineDisplacement;
        this.VehicleValue = VehicleValue;
    }

    public String getOwner() {
        return owner;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public int getEngineDisplacement() {
        return EngineDisplacement;
    }

    public double getVehicleValue() {
        return VehicleValue;
    }

    public double CalculateTax() {
        if (EngineDisplacement < 100) {
            return VehicleValue * 0.01;
        } else if (EngineDisplacement <= 200) {
            return VehicleValue * 0.03;
        } else {
            return VehicleValue * 0.05;
        }
    }
}
