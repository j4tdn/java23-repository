package bean;

public class Manager extends Everyone {
	private double PositionCoefficient;
	
	public Manager() {
	}

    public Manager(String name, String DateOfBirth, double CoefficientsSalary, double PositionCoefficient, String unit) {
        super(name, DateOfBirth, CoefficientsSalary, unit);
        this.PositionCoefficient = PositionCoefficient;
    }
    
    @Override
    public double calculateSalary() {
        return (this.CoefficientsSalary + this.PositionCoefficient) * 2200000;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Position Coefficient: " + PositionCoefficient;
    }
}