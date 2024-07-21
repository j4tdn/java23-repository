package bean;

public class Staff extends Employee{
	private String nameOfDepartment;
	private Manager manager;
	
	public Staff() {
	}
	
	public Staff(String name, String doB, Double salaryCo, String nameOfDepartment, Manager manager) {
		super(name, doB, salaryCo);
		this.nameOfDepartment = nameOfDepartment;
		this.manager = manager;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}
	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	@Override
	public String toString() {
		return "Staff [name=" + getName() + 
				", doB=" + getDoB() +
				", salaryCo=" + getSalaryCo() +
				", nameOfDepartment=" + getNameOfDepartment() +
				", managerName=" + getManager().getName() +
				"]";
	}
}
