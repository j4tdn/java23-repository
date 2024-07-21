package bean;

public class Manager extends Employee{
	private String departmentName;

	public Manager(String departmentName) {
		super();
		this.departmentName = departmentName;
	}
	public Manager() {
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public double calculateSalary() {
        return (salaryCoefficient + 1.0) * 2200000; 
    }
}
