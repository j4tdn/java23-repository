package bean;

public class Employee {
	private String name;
	private String doB;
	private Double salaryCo;
	
	public Employee() {
	}

	public Employee(String name, String doB, Double salaryCo) {
		this.name = name;
		this.doB = doB;
		this.salaryCo = salaryCo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoB() {
		return doB;
	}

	public void setDoB(String doB) {
		this.doB = doB;
	}

	public Double getSalaryCo() {
		return salaryCo;
	}

	public void setSalaryCo(Double salaryCo) {
		this.salaryCo = salaryCo;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", doB=" + doB + ", salaryCo=" + salaryCo + "]";
	}

	
}
