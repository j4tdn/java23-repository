package bean;

public class President extends Employee {
	
	private double positionCoefficient;
	
	public President() {
	}

	public President(String name, String dateOfBirth, double coefficientsSalary, double positionCoefficient) {
		super(name, dateOfBirth, coefficientsSalary);
		this.positionCoefficient = positionCoefficient;
	}
	
	@Override
	public double calculateSalary() {
		return (getSalaryCoefficients() + positionCoefficient) * 3000000;
	}


	@Override
	public String toString() {
		return "President [name=" + getName() 
			+ ", dateOfBirth=" + getDateOfBirth() 
			+ ", coefficientsSalary=" 
			+ getSalaryCoefficients() + ", positionCoefficient=" 
			+ positionCoefficient + ", salary=" + calculateSalary() + "]";
	}
	
}