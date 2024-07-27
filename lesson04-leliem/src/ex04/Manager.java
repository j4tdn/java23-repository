package ex04;

import java.time.LocalDate;

public class Manager extends Personnel {

	private int titleJob;
	private String department;
	
	public Manager() {
	}

	public Manager(String fullname, LocalDate birthDate, int salary, int titleJob, String department) {
		super(fullname, birthDate, salary);
		this.titleJob = titleJob;
		this.department = department;
	}

	public int getTitleJob() {
		return titleJob;
	}

	public void setTitleJob(int titleJob) {
		this.titleJob = titleJob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [Fullname()=" + getFullname() 
		+ ", BirthDate()=" + getBirthDate() 
		+ ", Salary()="+ getSalary() 
		+ ", titleJob=" + getTitleJob() 
		+ ", department=" + getDepartment() + "]";
	}
	
	
}
