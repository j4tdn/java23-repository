package ex04;

import java.time.LocalDate;

public class Personnel {

	private String fullname;
	private LocalDate birthDate;
	private int salary;
	
	public Personnel() {
		// TODO Auto-generated constructor stub
	}

	public Personnel(String fullname, LocalDate birthDate, int salary) {
		super();
		this.fullname = fullname;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Personnel [fullname=" + fullname + ", birthDate=" + birthDate + ", salary=" + salary + "]";
	}
}
