package bean;

public class Employee {
	private String name;
    protected String birthDate;
    protected double salaryCoefficient;
    protected String unit;
    
    public Employee() {
    }
    
    public Employee(String name, String birthDate, double salaryCoefficient, String unit) {
        this.setName(name);
        this.birthDate = birthDate;
        this.salaryCoefficient = salaryCoefficient;
        this.unit = unit;
    }
    
    public double calculateSalary() {
        return this.salaryCoefficient * 1250000;
    }
    
    @Override
    public String toString() {
        return "Name: " + getName() + ", Birth Date: " + birthDate + ", Salary Coefficient: " + salaryCoefficient + ", Unit: " + unit;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

