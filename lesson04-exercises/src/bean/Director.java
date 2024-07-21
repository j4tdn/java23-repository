package bean;

public class Director extends Attribute {
	
		private int positionCoefficient;
		
		public Director() {

		}

		public Director(String name, String dateOfBirth, int salaryCoefficient, int positionCoefficient) {
			super(name, dateOfBirth, salaryCoefficient);
			this.positionCoefficient = positionCoefficient;
		}
		
		public int getPositionCoefficient() {
			return positionCoefficient;
		}

		public void setPositionCoefficient(int positionCoefficient) {
			this.positionCoefficient = positionCoefficient;
		}

		@Override
		public double calculateSalary() {
			return (getSalaryCoefficient()+getPositionCoefficient())*3000000;
		}
		
		@Override
		public String toString() {
			return "Employee [name=" + getName() 
					+ ", dateOfBirth=" + getDateOfBirth() 
					+ ", salaryCoefficient=" + getSalaryCoefficient() 
			     	+ ", positionCoefficient=" + positionCoefficient  + "]";
		}
		
}
