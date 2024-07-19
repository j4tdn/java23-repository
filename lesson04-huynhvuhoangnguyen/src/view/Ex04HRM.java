package view;

import bean.Employee;
import bean.Manager;
import bean.President;
import bean.Staff;

public class Ex04HRM {

	public static void main(String[] args) {
		
		President president = new President("Nguyen Huynh", "03/02/1995", 5.0, 2.0);
		
		Manager manager1 = new Manager("Hung Truong", "10/10/1995", 4.0, 1.5, "Design");
		Manager manager2 = new Manager("Trinh Phan" , "23/02/1995", 4.0, 1.5, "Marketing");
		
		Staff staff1 = new Staff("", "", 3.0, "", manager1);
		Staff staff2 = new Staff("", "", 3.0, "", manager1);
		Staff staff3 = new Staff("", "", 3.0, "", manager1);
		Staff staff4 = new Staff("", "", 3.0, "", manager2);
		Staff staff5 = new Staff("", "", 3.0, "", manager2);
		Staff staff6 = new Staff("", "", 3.0, "", manager2);
		
		Employee[] employees = new Employee[9];
		employees[0] = president;
        employees[1] = manager1;
        employees[2] = manager2;
        employees[3] = staff1;
        employees[4] = staff2;
        employees[5] = staff3;
        employees[6] = staff4;
        employees[7] = staff5;
        employees[8] = staff6;
		
        displayEmployee(employees);
        countStaffPerManager(employees);
        calculateAndDisplaySalaries(employees);
        
	}
	
	public static void displayEmployee(Employee[] employees) {
		System.out.println("Employee Information:");
		for(Employee employee: employees) {
			System.out.println(employee);
		}
	}
	
	public static void countStaffPerManager(Employee[] employees) {
		System.out.println("\nNumber of staff managed by each manager:");
		for(Employee employee: employees) {
			if(employee instanceof Manager) {
				Manager manager = (Manager) employee;
				int count = 0;
				for(Employee e: employees) {
					if(e instanceof Staff) {
						Staff staff = (Staff) e;
						if (staff.getManager().equals(manager)) {
							count++;
						}
					}
				}
				System.out.println(manager.getName() + " manages " + count + " staff(s).");
			}
		}
	}
	
	public static void calculateAndDisplaySalaries(Employee[] employees) {
		System.out.println("\nEmployee Salaries:");
		for(Employee employee: employees) {
			System.out.println(employee.getName() + ": " + employee.calculateSalary());
		}
	}
	
}