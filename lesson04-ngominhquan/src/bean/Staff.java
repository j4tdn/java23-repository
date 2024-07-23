package bean;

public class Staff extends Everyone{

	private String manager;

    public Staff(String name, String DateOfBirth, double CoefficientsSalary, String unit, String manager) {
        super(name, DateOfBirth, CoefficientsSalary, unit);
        this.manager = manager;
    }
    
    public String getManager() {
        return manager;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Manager: " + manager;
    }
	
}
