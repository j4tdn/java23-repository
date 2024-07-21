package bean;

public class Staff extends Employee{
	
	private String Managers;
    private String departmentName;

    public Staff() {
	}
    
    public Staff(String name, String birthDate, double salaryCoefficient, String departmentName, String Managerss) {
        super(name, birthDate, salaryCoefficient);
        this.Managers = Managerss;
        this.departmentName = departmentName;
    }
	
    public String getManager() {
		return Managers;
	}

	public void setManager(String Managerss) {
		this.Managers = Managerss;
	}	
    
    @Override
    public double calculateSalary() {
    	double result ;
        return result = getSalaryCoefficient() * 1250000;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Manage : " + getManager();
    }
}
