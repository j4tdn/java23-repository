package bean;

public class Manager extends Employee{
	private String nameOfDepartment;
	private Integer roleId;
	
	public Manager() {
	}

	public Manager(String name, String doB, Double salaryCo, String nameOfDepartment, Integer roleId) {
		super(name, doB, salaryCo);
		this.nameOfDepartment = nameOfDepartment;
		this.roleId = roleId;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	@Override
	public String toString() {
		return "Manager [name=" + getName() + 
				", doB=" + getDoB() +
				", salaryCo=" + getSalaryCo() +
				", nameOfDepartment=" + getNameOfDepartment() +
				", roleId=" + getRoleId() +
				"]";
	}
}
