package ex04;

public class Main {
	
	public static void main(String[] args) {
		Director d = new Director("Phan Xuân Thanh", "2003, 11, 02", 4, 1);
		
		Maneger m1 = new Maneger("Trần A", "2003, 2, 1", 2, 2, "Phòng A");
		Maneger m2 = new Maneger("Trần B", "2003, 1, 1", 2, 2, "Phòng B");

		Employee e1 = new Employee("Phan A", "2002, 10, 02", 3, "Phòng A", "Trần A");
		Employee e2 = new Employee("Phan B", "2001, 12, 04", 3, "Phòng B", "Trần A");
		Employee e3 = new Employee("Phan C", "2004, 19, 07", 3, "Phòng B", "Trần B");
		Employee e4 = new Employee("Phan D", "2000, 16, 06", 3, "Phòng B", "Trần B");
		Employee e5 = new Employee("Phan E", "1999, 17, 05", 3, "Phòng B", "Trần B");
		Employee e6 = new Employee("Phan F", "1998, 10, 04", 3, "Phòng A", "Trần A");
		Staff[] s = {d, m1, m2, e1, e2, e3, e4, e5, e6};
		// In ra màn hình tất cả staff
		printStaff(s);
		
		System.out.println("\n======================================");
		// tính và in ra lương của từng loại nhân sự
		System.out.println("Lương của giám đốc: " + printSalary(d));
		System.out.println("Lương của trưởng phòng: " + printSalary(m1));
		System.out.println("Lương của nhân viên: " + printSalary(e1));
	}	
	static void printStaff(Staff[] staffs) {
		for (Staff staff : staffs ) {
			System.out.println(staff);
		}
	}
	
	private static double printSalary(Staff staff) {
		float salary;
		if (staff instanceof Employee)
			salary = staff.getSalaryCoefficient() * 1250000;
		else if (staff instanceof Maneger) {
			Maneger m = (Maneger) staff;
			salary = (m.getPossitionCoefficient() + m.getPossitionCoefficient()) * 2200000;
		} else {
			Director d = (Director) staff;
			salary = (d.getSalaryCoefficient() + d.getPossitionCoefficient()) * 3000000;
		}
		return salary;
	}
}