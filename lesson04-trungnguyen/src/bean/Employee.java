package bean;

public class Employee {
	protected String name;
	protected String dateOfBirth;
	protected double salaryCoefficient;
	protected String unitName;
	protected String managerName;
	public Employee() {
		
	}
	
	public Employee(String name, String dateOfBirth, double salaryCoefficient, String unitName, String managerName) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salaryCoefficient = salaryCoefficient;
		this.unitName = unitName;
		this.managerName = managerName;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}
	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	
}
