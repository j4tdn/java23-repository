package bean;

public class Director extends Everyone {

	private static final String DateOfBirth = null;
	private double PositionCoefficient;

	public Director() {
	}

    public Director(String name, String birthDate, double CoefficientsSalary, double PositionCoefficient) {
        super(name, DateOfBirth, CoefficientsSalary, "Director");
        this.PositionCoefficient = PositionCoefficient;
    }

    @Override
    public double calculateSalary() {
        return (this.CoefficientsSalary + this.PositionCoefficient) * 3000000;
    }

    @Override
    public String toString() {
        return super.toString() + ", PositionCoefficient: " + PositionCoefficient;
    }
}