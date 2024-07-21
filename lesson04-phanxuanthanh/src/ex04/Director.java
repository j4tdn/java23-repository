package ex04;

public class Director extends Staff{
	
	private int possitionCoefficient;
	public Director() {
	}

	public Director(String name, String dateOfBirth, float salaryCoefficient, int possitionCoefficient) {
		super(name, dateOfBirth, salaryCoefficient);
		this.possitionCoefficient = possitionCoefficient;
	}

	public int getPossitionCoefficient() {
		return possitionCoefficient;
	}

	public void setPossitionCoefficient(int possitionCoefficient) {
		this.possitionCoefficient = possitionCoefficient;
	}

	@Override
	public String toString() {
		return "Giám đốc [Họ tên: " + getName() + ", Ngày sinh: " + getDateOfBirth() + ", Hệ số lương: "
				+ getSalaryCoefficient() + ", Hệ số chức vụ: " + getPossitionCoefficient() + "]";
	}
}
