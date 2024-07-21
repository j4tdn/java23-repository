package bean;

public class Manager extends Employee {
	private double positionCoefficient;
	
	public Manager() {
	}

    public Manager(String name, String birthDate, double salaryCoefficient, double positionCoefficient, String unit) {
        super(name, birthDate, salaryCoefficient, unit);
        this.positionCoefficient = positionCoefficient;
    }
    
    @Override
    public double calculateSalary() {
        return (this.salaryCoefficient + this.positionCoefficient) * 2200000;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Position Coefficient: " + positionCoefficient;
    }
}
