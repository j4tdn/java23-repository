package bean;

public class Employee extends Attribute {

	private String unit;
	private String manager;
	
	public Employee() {
	
	}

	public Employee(String name, String dateOfBirth, int salaryCoefficient,String unit, String manager) {
		super(name, dateOfBirth, salaryCoefficient);
		this.unit = unit;
		this.manager = manager;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public double calculateSalary() {
		return getSalaryCoefficient()*1250000;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + getName() 
				+ ", dateOfBirth=" + getDateOfBirth() 
				+ ", salaryCoefficient=" + getSalaryCoefficient() 
		     	+ ", unit=" + unit 
		     	+", manager=" + manager + "]";
	}
	
	
}
