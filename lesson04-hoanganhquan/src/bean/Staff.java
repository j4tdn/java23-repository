package bean;

public class Staff extends Employee {
	private String manager;

    public Staff(String name, String birthDate, double salaryCoefficient, String unit, String manager) {
        super(name, birthDate, salaryCoefficient, unit);
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
