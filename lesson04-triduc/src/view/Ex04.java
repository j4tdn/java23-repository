package view;

import java.util.Arrays;
import bean.*;

public class Ex04 {
	public static void main(String[] args) {
		Employee[] employees = mockData();
		generate("Information of employees", employees);
		
		generate("List staffs of manager 1: ", findStaffsByManagerName(employees, "Manager 1"));
		generate("List staffs of manager 2: ", findStaffsByManagerName(employees, "Manager 2"));
	
		generateSalary("Salary of members: ", employees);
	}
	
	public static Employee[] mockData() {
		Employee manager1 = new Manager("Manager 1", "20-12-2222", 3d, "BOLT", 2);
		Employee manager2 = new Manager("Manager 2", "20-12-1999", 3d, "ATOMIC", 2);
		Employee[] result = {
			new SuperManager("Super Manager", "23-12-2222", 4.5d, 1),
			manager1, manager2,
			new Staff("Staff 1", "20-12-2000", 4.5d, "BOLT", (Manager)manager1),
			new Staff("Staff 2", "20-12-2000", 4.5d, "BOLT", (Manager)manager1),
			new Staff("Staff 3", "20-12-2000", 4.5d, "BOLT", (Manager)manager1),
			new Staff("Staff 4", "20-12-2000", 4.5d, "ATOMIC", (Manager)manager2),
			new Staff("Staff 5", "20-12-2000", 4.5d, "ATOMIC", (Manager)manager2),
			new Staff("Staff 6", "20-12-2000", 4.5d, "ATOMIC", (Manager)manager2),
		};
		return result;
	}
	
	//Không biết cách gọi vào manager1 nếu initData = 1 hàm như trên :(( nên đổi thành name
	public static Employee[] findStaffsByManagerName(Employee[] employees, String m) {
		Employee[] result = new Employee[employees.length];
		int count = 0;
		for(Employee e : employees) {
			if(e instanceof Staff s) {
				if(s.getManager().getName().equals(m)) {
					result[count++] = s;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	public static void generate(String pre, Employee[] employees) {
		System.out.println(pre);
		for(Employee e : employees) {
			System.out.println(e.toString());
		}
	}
	
	public static void generateSalary(String pre, Employee[] employees) {
		System.out.println(pre);
		for(Employee e : employees) {
			System.out.println(totalSalary(e) + " " + e.toString());
		}
	}
	
	public static Double totalSalary(Employee e) {
		if(e instanceof Manager m) {
			return (m.getSalaryCo() + m.getRoleId()) * 2200;
		}
		else if(e instanceof SuperManager s) {
			return (s.getSalaryCo() + s.getRoleId()) *  3000;
		}
		return e.getSalaryCo() * 1250;
	}
}

