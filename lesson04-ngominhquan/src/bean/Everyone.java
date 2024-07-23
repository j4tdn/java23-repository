package bean;

public abstract class Everyone {

	private String name;
    protected String DateOfBirth;
    protected double CoefficientsSalary;
    protected String unit;
    
    public Everyone() {
    }
    
    public Everyone(String name, String DateOfBirth, double CoefficientsSalary, String unit) {
        this.setName(name);
        this.DateOfBirth = DateOfBirth;
        this.CoefficientsSalary = CoefficientsSalary;
        this.unit = unit;
    }
    
    public double calculateSalary() {
        return this.CoefficientsSalary * 1250000;
    }
    
    @Override
    public String toString() {
        return "Name: " + getName() + ", DateOfBirth: " + DateOfBirth + ", CoefficientsSalary: " + CoefficientsSalary + ", Unit: " + unit;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

