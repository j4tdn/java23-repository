package ex04;

import java.time.LocalDate;

public class President extends Personnel {

	private int titleJob;
	
	public President() {
	}
 
	public President(String fullname, LocalDate birthDate, int salary, int titleJob) {
		super(fullname, birthDate, salary);
		this.titleJob = titleJob;
	}


	public int getTitlejob() {
		return titleJob;
	}

	public void setTitlejob(int titleJob) {
		this.titleJob = titleJob;
	}

	@Override
	public String toString() {
		return "President [ Fullname()=" + getFullname() 
		+ ", BirthDate()=" + getBirthDate() 
		+ ", Salary()=" + getSalary() 
		+ ", titlejob=" + getTitlejob() + "]";
	}
	
	
}
