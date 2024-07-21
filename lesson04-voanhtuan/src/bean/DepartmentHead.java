package bean;

public class DepartmentHead extends Employee{
	
	private double positionCoefficient;
    private String departmentName;
	
    public DepartmentHead() {
	}
    
    public DepartmentHead(String name, String birthDate, double salaryCoefficient, double positionCoefficient, String departmentName) {
        super(name, birthDate, salaryCoefficient);
        this.positionCoefficient = positionCoefficient;
        this.departmentName = departmentName;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    
    @Override
    public double calculateSalary() {
        return (getSalaryCoefficient() + positionCoefficient) * 2200000;
    }



    @Override
    public String toString() {
        return super.toString() + ", Position Coefficient: " + positionCoefficient + ", Department Name: " + departmentName;
    }
    
}
