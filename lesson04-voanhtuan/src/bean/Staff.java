package bean;

public class Staff extends Employee{
	
	private DepartmentHead head;
    private String departmentName;

    public Staff() {
	}
    
    public Staff(String name, String birthDate, double salaryCoefficient, String departmentName, DepartmentHead head) {
        super(name, birthDate, salaryCoefficient);
        this.head = head;
        this.departmentName = departmentName;
    }
	
    public DepartmentHead getHead() {
        return head;
    }
    
    @Override
    public double calculateSalary() {
        return getSalaryCoefficient() * 1250000;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Department Name: " + departmentName + ", Managed by: " + head.getName();
    }
}
