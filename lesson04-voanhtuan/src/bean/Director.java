package bean;

public class Director extends Employee{
	
	private double positionCoefficient;

	public Director() {
	}
	
	public Director(String name, String birthDate, double salaryCoefficient, double positionCoefficient) {
        super(name, birthDate, salaryCoefficient);
        this.positionCoefficient = positionCoefficient;
    }
	
	@Override
    public double calculateSalary() {
        return (getSalaryCoefficient() + positionCoefficient) * 3000000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Position Coefficient: " + positionCoefficient;
    }
	
}
