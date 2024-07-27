package ex04;

import java.time.LocalDate;

public class Employee extends Personnel {

	private String department;
	private Manager manager;
	
	public Employee() {
	}

	public Employee(String fullname, LocalDate birthDate, int salary, String department, Manager manager) {
		super(fullname, birthDate, salary);
		this.department = department;
		this.manager = manager;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [Fullname()=" + getFullname() 
		+ ", BirthDate()=" + getBirthDate() 
		+ ", Salary()=" + getSalary() 
		+ ",department=" + getDepartment()
		+ "manager=" + getManager().getFullname() +"]";
	}
	
    
}
