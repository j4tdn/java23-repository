package bean;

public class Employee extends Manager {

	private Manager manager;
	
	public Employee() {
		
	}

	public Employee(String name, String dateOfBirth, Double coefficientSalary,
			String unitName, Manager manager) {
		super(name, dateOfBirth, coefficientSalary, null, unitName);
		this.manager = manager;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public double calculateSalary() {
		return getCoefficientSalary() * 1250000;
	}
	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", dateOfBirth=" + getDateOfBirth() + ", coefficientSalary="
				+ getCoefficientSalary() + ", unitName=" + getUnitName() + ", manager=" + manager + "]";
	}
}
