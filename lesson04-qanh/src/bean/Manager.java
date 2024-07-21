package bean;

public class Manager extends Employee{
	
	private double positionCoefficient;
    private String departmentName;
	

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	} 
	
    public Manager() {
	}
    
    public Manager(String name, String birthDate, double salaryCoefficient, double positionCoefficient , String departmentName) {
        super(name, birthDate, salaryCoefficient);
        this.positionCoefficient = positionCoefficient;
        this.departmentName = departmentName;
    }
    
    @Override
    public double calculateSalary() {
    	double result;
        return result = (getSalaryCoefficient() + positionCoefficient) * 2200000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Position Coefficient: " + positionCoefficient + ", departmentName=" + getDepartmentName() ;
    }
    
}
