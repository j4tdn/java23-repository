package bean;

public class SuperManager extends Employee {
	private Integer roleId;
	
	public SuperManager() {
	}

	public SuperManager(String name, String doB, Double salaryCo, Integer roleId) {
		super(name, doB, salaryCo);
		this.roleId = roleId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "SuperManager [name=" + getName() + 
				", doB=" + getDoB() +
				", salaryCo=" + getSalaryCo() +
				", roleId=" + getRoleId() +
				"]";
	}
}
